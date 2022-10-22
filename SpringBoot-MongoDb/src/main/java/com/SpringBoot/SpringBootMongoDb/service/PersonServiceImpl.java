package com.SpringBoot.SpringBootMongoDb.service;

import com.SpringBoot.SpringBootMongoDb.collection.Person;
import com.SpringBoot.SpringBootMongoDb.repository.PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    

  @Override
  public String save(Person person) {
    return personRepository.save(person).getPersonId();

  }

  @Override
  public List<Person> getPersonStartWith(String name) {
      return personRepository.findByFirstNameStartsWith(name);
  }

@Override
public List<Person> getPersonWith(String name) {

  return null;
}

@Override
public void delete(String id){

personRepository.deleteById(id);


}

@Override
public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
    return personRepository.findPersonByAgeBetween(minAge,maxAge);
}




}
