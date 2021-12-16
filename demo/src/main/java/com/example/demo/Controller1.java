package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController() // con esta etiqueta ya se entiende que esta clase es un controlador con sus paths
public class Controller1 {

    @GetMapping("/user/{name}")
    public String getHola(@PathVariable String name) // pathvariable  = que se mete en el path
    {
        return "Hola " + name;

    }

    @PostMapping("/useradd")
    @ResponseBody // no es necesario usar.
    public Person add(@RequestBody Person person){
        List<Person> listPerson = new ArrayList<Person>();
        listPerson.add(new Person(person.getName(),person.getAge(),person.getCity()));
        person.setAge(person.getAge()+1);
        return person;
    }

}
