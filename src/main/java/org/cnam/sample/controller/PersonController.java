package org.cnam.sample.controller;

import org.cnam.sample.domain.Person;
import org.cnam.sample.dto.SavePersonRequest;
import org.cnam.sample.dto.SavePersonResponse;
import org.cnam.sample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;



    @PostMapping
    public List<SavePersonResponse> savePerson(final SavePersonRequest savePersonRequest){
        final Person person = new Person(savePersonRequest.name);
        final List<Person> personList = personService.savePerson(person);

        return null;

    }
}