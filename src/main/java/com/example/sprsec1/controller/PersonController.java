package com.example.sprsec1.controller;


import com.example.sprsec1.model.Person;
import com.example.sprsec1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/hello")
    public String showHelloPage(){
        return "Hello from spring security application! (this page is available for everybody)";
    }

    //example: http://localhost:8080/persons/by-city?city=Moscow
    @GetMapping("/persons/by-city")
    public List getPersonsByCity(@RequestParam String city) {
        return personRepository.customizedSearchByCity(city);
    }

    //example: http://localhost:8080/persons/by-age?age=3
    @GetMapping("/persons/by-age")
    public List getPersonsByAge(@RequestParam int age) {
        return personRepository.customizedSearchByAge(age);
    }

    //example: http://localhost:8080/persons/by-name-and-surname?name=Phillipps&surname=Nicholson
    @GetMapping("/persons/by-name-and-surname")
    public List<Optional<Person>> advancedSearch(@RequestParam String name, @RequestParam String surname) {
        return personRepository.customizedSearchByNameAndSurname(name, surname);
    }
}