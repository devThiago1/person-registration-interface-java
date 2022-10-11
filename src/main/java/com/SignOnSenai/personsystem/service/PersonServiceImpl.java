package com.SignOnSenai.personsystem.service;


import com.SignOnSenai.personsystem.model.Person;
import com.SignOnSenai.personsystem.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
}