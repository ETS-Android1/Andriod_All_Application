package com.example.nsuinternationalbatch2018;

import java.util.ArrayList;

public class Service {
   private String name;
   private String id;
//   private String student;
 //  private String course;
   //private String instructor;
   //private int imgstudent;
    //private int imginstructor;



    public static Service[]dataBases= {
            new Service("Buronov", "18380120001"),
            new Service("Hasibul", "18380120002"),
            new Service("Hossam", "18380120003"),
            new Service("Talantbek", "18380120004"),
            new Service("Najeeb", "18380120005"),
            new Service("Fahim", "18380120006"),
            new Service("Jibi", "18380120007"),
            new Service("Mamun", "18380120008"),
            new Service("Aizaj", "18380120009"),
            new Service("Asel", "18380120010"),
            new Service("Abdulhuk", "18380120011"),
            new Service("Shakzod", "18380120012"),
            new Service("Benny", "18380120013"),
            new Service("Derrick", "18380120014"),
            new Service("Patrick", "18380120015"),

    };

    public Service( String name, String id) {
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
