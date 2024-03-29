package com.tawanda.springBootDemo.service;

import com.tawanda.springBootDemo.dao.PersonDao;
import com.tawanda.springBootDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService  {

    private final PersonDao personDao;
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllpeople(){
        return personDao.returnAllPeople();
    }



}
