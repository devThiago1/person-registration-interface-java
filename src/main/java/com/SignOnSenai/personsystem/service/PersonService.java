package com.SignOnSenai.personsystem.service;

import com.SignOnSenai.personsystem.model.Person;

import java.util.List;

public interface PersonService {
    public Person savePerson(Person person);
    public List<Person> getAllPerson();
    public void deleteAllPerson();
}
