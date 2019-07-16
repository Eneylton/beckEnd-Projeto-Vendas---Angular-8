package com.estque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estque.Model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
