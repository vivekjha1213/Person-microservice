package com.SpringBoot.SpringBootMongoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.SpringBootMongoDb.collection.Person;
import com.SpringBoot.SpringBootMongoDb.service.PersonService;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/person")

public class PersonController {


    @Autowired

private PersonService personService;

@PostMapping
public String save(@RequestBody Person person){

    return personService.save(person);
    
}

@GetMapping
public List<Person> getPersonStartWith(@RequestParam("name") String name) {
    return personService.getPersonStartWith(name);
}

 @DeleteMapping("/{id}")
public void delete(@PathVariable String id){
    personService.delete(id);

}


@GetMapping("/age")
    public List<Person> getByPersonAge(@RequestParam Integer minAge,
                                       @RequestParam Integer maxAge) {
        return personService.getByPersonAge(minAge,maxAge);
    }



  


}
