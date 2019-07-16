package com.estque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estque.Model.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {
	
	

}
