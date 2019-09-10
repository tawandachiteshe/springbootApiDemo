package com.tawanda.springBootDemo.api;

import com.tawanda.springBootDemo.dao.PersonDao;
import com.tawanda.springBootDemo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class PersonSample implements PersonDao {
    private static List<Person> people = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        people.add(new Person(id,person.getName()));
        return 1;
    }

    @Override
    public List<Person> returnAllPeople() {
        return people;
    }

}
