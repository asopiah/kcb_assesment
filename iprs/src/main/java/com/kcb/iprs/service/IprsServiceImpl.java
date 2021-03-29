package com.kcb.iprs.service;

import com.kcb.iprs.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IprsServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${resource.persons}")
    private String resource;
    @Value("${resource.persons}/{id}")
    private String idResource;

    public List<Person> findAll() {
        return Arrays.stream(restTemplate.getForObject(resource, Person[].class)).collect(Collectors.toList());
    }

    public Person create(Person person) {
        return restTemplate.postForObject(resource, person, Person.class);
    }

    public Person update(Long id, Person person) {
        return restTemplate.exchange(idResource, HttpMethod.PUT, new HttpEntity<>(person), Person.class, id).getBody();
    }

    public void delete(Long id) {
        restTemplate.delete(idResource, id);
    }
}
