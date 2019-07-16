package com.estque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estque.Model.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Integer> {

}
