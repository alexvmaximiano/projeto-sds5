package com.gamax.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamax.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
