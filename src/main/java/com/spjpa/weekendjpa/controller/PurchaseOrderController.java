package com.spjpa.weekendjpa.controller;

import com.spjpa.weekendjpa.model.PoItems;
import com.spjpa.weekendjpa.model.PurachaseOrder;
import com.spjpa.weekendjpa.repository.PurchaseOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderRepo purchaseOrderRepo;

    @PostMapping("/savePo")
    public String savePo(@RequestBody PurachaseOrder purachaseOrder){
       // Set<PoItems> list=purachaseOrder.getPoItemsSet();
        purchaseOrderRepo.save(purachaseOrder);
        return "PO saved";
    }

    @DeleteMapping("/removepo/{id}")
    public String removeData(@PathVariable Integer id){
        purchaseOrderRepo.deleteById(id);
        return "PO deleted";
    }
}
