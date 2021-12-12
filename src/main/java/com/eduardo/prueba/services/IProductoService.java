package com.eduardo.prueba.services;

import java.util.List;

import com.eduardo.prueba.models.ProductoModel;

public interface IProductoService {
    public List<ProductoModel> listarTodos();
    public void guardarProducto(ProductoModel producto);
    public ProductoModel buscarPorId(Long id);
    public void eliminar(Long id);
}
