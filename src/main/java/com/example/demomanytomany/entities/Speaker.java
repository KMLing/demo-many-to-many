package com.example.demomanytomany.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Speaker implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String experties;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Event> events=new HashSet<>();

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }


    public void addEvent(Event event){
        this.events.add(event);
        event.getSpeakers().add(this);
    }


    public Speaker(){

    }

    public Speaker(String name, int age, String experties) {
        this.name = name;
        this.age = age;
        this.experties = experties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperties() {
        return experties;
    }

    public void setExperties(String experties) {
        this.experties = experties;
    }
}
