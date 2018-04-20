package com.edureka.client2.rest;

import com.edureka.client2.model.Person;
import com.edureka.client2.model.PersonXml;
import com.edureka.client2.service.Service_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRS {

    @Autowired
    private Service_1 service_1;

    @GetMapping("/hello")
    public String getHello() {
        return service_1.getData();
    }

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("1", "One");
    }

    @GetMapping(value = "/person-xml", produces = MediaType.APPLICATION_XML_VALUE)
    public PersonXml getPersonXml() {
        return new PersonXml("2", "Two");
    }
}
