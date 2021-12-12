package com.eduardo.prueba.repositories;

import com.eduardo.prueba.models.PedidoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository <PedidoModel,Long>{
    
}