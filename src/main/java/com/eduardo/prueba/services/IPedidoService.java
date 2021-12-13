package com.eduardo.prueba.services;

import java.util.List;

import com.eduardo.prueba.models.PedidoModel;

public interface IPedidoService {
    public List<PedidoModel> listarTodos();
    public void guardarPedido(PedidoModel producto);
    public PedidoModel buscarPorId(Long id);
    public void eliminar(Long id);
}
