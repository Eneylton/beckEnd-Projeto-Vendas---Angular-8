package com.estque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estque.Model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
