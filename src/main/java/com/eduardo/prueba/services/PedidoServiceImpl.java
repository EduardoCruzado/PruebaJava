package com.eduardo.prueba.services;

import java.util.List;

import com.eduardo.prueba.models.PedidoModel;
import com.eduardo.prueba.repositories.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements IPedidoService{
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public PedidoModel buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        pedidoRepository.deleteById(id);
        
    }

    @Override
    public void guardarPedido(PedidoModel pedido) {
        pedidoRepository.save(pedido);
        
    }

    @Override
    public List<PedidoModel> listarTodos() {
        return (List<PedidoModel>) pedidoRepository.findAll();
    }
}
