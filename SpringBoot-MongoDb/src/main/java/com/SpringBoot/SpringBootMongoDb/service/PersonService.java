package com.SpringBoot.SpringBootMongoDb.service;

import java.util.List;




import com.SpringBoot.SpringBootMongoDb.collection.Person;

public interface PersonService {

String save(Person person);

List<Person> getPersonWith(String name);    


List<Person> getPersonStartWith(String name);

void delete(String id);

List<Person> getByPersonAge(Integer minAge, Integer maxAge);



    
}
