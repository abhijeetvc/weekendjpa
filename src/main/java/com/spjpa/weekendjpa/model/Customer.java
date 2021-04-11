package com.spjpa.weekendjpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(name = "cust_prod",
            joinColumns = @JoinColumn(name = "cust_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "prod_id",referencedColumnName = "id"))
    private Set<Product> products;

}
