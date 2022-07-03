package com.perscholas.conhelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perscholas.conhelper.model.*;

@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long>{

}