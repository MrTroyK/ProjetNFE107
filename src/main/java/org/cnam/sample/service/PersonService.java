package org.cnam.sample.service;


import org.cnam.sample.domain.Person;
import org.cnam.sample.model.PersonModel;
import org.cnam.sample.service.PersonService;
import org.cnam.sample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> savePerson(final Person person){
        final PersonModel personModel = new PersonModel();
        personModel.setName(person.name);
        personRepository.save(personModel);

        final List<PersonModel> personModelList = personRepository.findAll();

        return personModelList.stream()
                .map(it -> new Person(it.getName()))
                .collect(Collectors.toList());
    }
}