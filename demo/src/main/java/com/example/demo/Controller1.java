package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController()
public class Controller1 {

    @GetMapping("/user/{name}")
    public String getHola(@PathVariable String name)
    {
        return "Hola " + name;

    }
    List<Person> listPerson = new ArrayList<Person>();

    @PostMapping("/useradd")
    @ResponseBody
    public Person add(@RequestBody Person person){
        listPerson.add(new Person(person.getName(),person.getAge(),person.getCity()));
        person.setAge(person.getAge()+1);
        return person;
    }

}
