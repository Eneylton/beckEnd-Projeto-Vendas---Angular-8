package com.estque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estque.Model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
