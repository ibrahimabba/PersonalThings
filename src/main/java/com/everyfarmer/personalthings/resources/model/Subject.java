/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everyfarmer.personalthings.resources.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Table(name = "subject")
@Entity
@XmlRootElement
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "subjects")
    private List<Person> personsDoingTheCourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Person> getPersonsDoingTheCourse() {
        return personsDoingTheCourse;
    }

    public void setPersonsDoingTheCourse(List<Person> personsDoingTheCourse) {
        this.personsDoingTheCourse = personsDoingTheCourse;
    }

    public void addPersonsDoingTheCourse(Person someone) {
        getPersonsDoingTheCourse().add(someone);
    }

}
