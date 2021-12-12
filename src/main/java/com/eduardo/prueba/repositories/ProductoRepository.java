package com.eduardo.prueba.repositories;

import com.eduardo.prueba.models.ProductoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository <ProductoModel, Long>{
    
}
