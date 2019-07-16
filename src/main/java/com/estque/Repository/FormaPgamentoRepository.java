package com.estque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estque.Model.FormaPagamento;

@Repository
public interface FormaPgamentoRepository extends JpaRepository<FormaPagamento, Integer> {

}
