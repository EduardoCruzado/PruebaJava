package com.eduardo.prueba.services;

import java.util.List;

import com.eduardo.prueba.models.ProductoModel;
import com.eduardo.prueba.repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public ProductoModel buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
        
    }

    @Override
    public void guardarProducto(ProductoModel producto) {
        productoRepository.save(producto);
        
    }

    @Override
    public List<ProductoModel> listarTodos() {
        return (List<ProductoModel>) productoRepository.findAll();
    }
    
}
