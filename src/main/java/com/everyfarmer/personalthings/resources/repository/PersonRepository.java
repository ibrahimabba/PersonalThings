/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everyfarmer.personalthings.resources.repository;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import com.everyfarmer.personalthings.resources.model.Person;
import java.util.List;

/**
 *
 * @author USER
 */
@Stateless
@TransactionManagement(value = TransactionManagementType.BEAN)
public class PersonRepository {

    @PersistenceContext(unitName = "myThings")
    EntityManager em;

    @Transactional
    public Person createPerson(Person person) {
        em.persist(person);
        return person;
    }

    @Transactional
    public List<Person> getAllPeople() {
        List<Person> people;
        people = em.createQuery("SELECT p FROM Person p").getResultList();
        return people;
    }

}
