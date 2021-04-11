package com.spjpa.weekendjpa.repository;

import com.spjpa.weekendjpa.model.PurachaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepo extends JpaRepository<PurachaseOrder,Integer> {
}
