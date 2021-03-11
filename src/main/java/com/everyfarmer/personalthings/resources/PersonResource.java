/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everyfarmer.personalthings.resources;

import com.everyfarmer.personalthings.resources.repository.PersonRepository;
import com.everyfarmer.personalthings.resources.model.Person;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 *
 * @author USER
 */
@Path("person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonRepository personRepository;

    public String getName() {
        return "Person Resource";
    }

    @POST
    public Person createPerson(Person person) {
        return personRepository.createPerson(person);
    }

    @GET
    public List<Person> createPerson() {
        return personRepository.getAllPeople();
    }
}
