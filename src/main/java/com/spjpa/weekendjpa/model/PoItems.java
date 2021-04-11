package com.spjpa.weekendjpa.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PoItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String item;
    private Integer qty;
    private Double price;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="po_id")
    private PurachaseOrder purachaseOrder;


}
