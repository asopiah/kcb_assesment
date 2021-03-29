package com.kcb.iprs.service;

import com.kcb.iprs.model.Person;
import com.kcb.iprs.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public List<Person> listAllPerson() {
        return personRepository.findAll();
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public Person getPerson(Long id) {
        return personRepository.findById(id).get();
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
