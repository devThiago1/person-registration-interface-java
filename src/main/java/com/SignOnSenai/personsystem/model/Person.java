package com.SignOnSenai.personsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
        private String name;
        private String email;

        private int cep;
        private int tel;


    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCep(){
        return cep;
    }

    public void setCep(int cep){
        this.cep = cep;
    }

    public int getTel(){
        return tel;
    }

    public void setTel(int tel){
        this.tel = tel;
    }
}
