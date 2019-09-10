package com.tawanda.springBootDemo.service;

import com.tawanda.springBootDemo.dao.PersonDao;
import com.tawanda.springBootDemo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonService  {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }


}
