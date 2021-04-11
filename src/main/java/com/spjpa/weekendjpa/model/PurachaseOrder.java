package com.spjpa.weekendjpa.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class PurachaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String customerName;
    private String city;
    private Double amount;

    @JsonManagedReference
    @OneToMany(mappedBy = "purachaseOrder",cascade = CascadeType.ALL)
    private Set<PoItems> poItemsSet;

}
