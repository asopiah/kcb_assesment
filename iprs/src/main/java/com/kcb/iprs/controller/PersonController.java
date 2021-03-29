package com.kcb.iprs.controller;

import com.kcb.iprs.model.Person;
import com.kcb.iprs.service.IprsServiceImpl;
import com.kcb.iprs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonService personService;

    @Autowired
    private IprsServiceImpl service;

    @GetMapping("")
    public List<Person> list() {
        return personService.listAllPerson();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> get(@RequestParam(defaultValue = "empty") Long id, @RequestParam(defaultValue = "empty") String nationalID, @RequestParam(defaultValue = "empty") String alienId, @RequestParam(defaultValue = "empty") String passportNumber) {
        try {
            Person user = personService.getPerson(id);
            return new ResponseEntity<Person>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Person person) {
        personService.savePerson(person);
    }

    /*
    * save response data fetched from calling
    * */

    @PostMapping("/iprs")
    public void create(@RequestBody Person person) {
        service.create(person);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Person person, @PathVariable Long id) {
        try {
            Person existingPerson = personService.getPerson(id);
            person.setId(id);
            personService.savePerson(person);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        personService.deletePerson(id);
    }
}
