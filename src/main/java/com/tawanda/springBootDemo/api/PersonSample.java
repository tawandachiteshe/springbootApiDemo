package com.tawanda.springBootDemo.api;

import com.tawanda.springBootDemo.dao.PersonDao;
import com.tawanda.springBootDemo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonSample implements PersonDao {
    private static List<Person> people = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        people.add(new Person(id,person.getName()));
        return 0;
    }

    @Override
    public int addPerson(Person person) {
        return 0;
    }
}
