package com.SignOnSenai.personsystem.controller;

import com.SignOnSenai.personsystem.model.Person;
import com.SignOnSenai.personsystem.service.PersonServiceImpl;
import com.SignOnSenai.personsystem.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateRequestCustomizer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;


    @PostMapping("/add")
    public String add(@RequestBody Person person){
        personService.savePerson(person);
        return "New Person is added";
    }
}
