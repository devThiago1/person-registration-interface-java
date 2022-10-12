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
        private String cep;
        private String tel;


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

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }
}
