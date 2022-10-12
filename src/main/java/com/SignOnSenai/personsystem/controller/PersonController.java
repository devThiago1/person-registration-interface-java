package com.SignOnSenai.personsystem.controller;

import com.SignOnSenai.personsystem.model.Person;
import com.SignOnSenai.personsystem.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAll")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
    @DeleteMapping("/deleteAll")
    public String delete(){
        personService.deleteAllPerson();
        return "People delete";
    }
}
