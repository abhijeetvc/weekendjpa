package com.spjpa.weekendjpa.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;

    //@JsonBackReference
//    @ManyToOne
//    @JoinColumn(name="dept_id")
//    private Department department;
}

