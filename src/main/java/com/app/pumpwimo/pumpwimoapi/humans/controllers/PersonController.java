package com.app.pumpwimo.pumpwimoapi.humans.controllers;

import com.app.pumpwimo.pumpwimoapi.humans.models.Person;
import com.app.pumpwimo.pumpwimoapi.humans.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    /**
     * принимает запросы и
     * вызывает методы соответствующего сервиса
     */

    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{name}")
    public Person getByName(@PathVariable String name) {
        return personService.getByName(name);
    }

    @PostMapping("/newPerson")
    public List<Person> add(@RequestBody Person newPerson) {
        personService.add(newPerson);
        return personService.getAllPersons();
    }

    @PutMapping("/updatedPerson")
    public void update(@RequestBody Person updatedPerson) {
        personService.update(updatedPerson);
    }

    @DeleteMapping("/deletedPerson/{name}")
    public void delete(@PathVariable String name) {
        personService.delete(getByName(name));
    }
}