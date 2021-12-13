package com.eduardo.prueba.controllers;

import java.util.List;

import com.eduardo.prueba.models.PedidoModel;
import com.eduardo.prueba.services.PedidoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class PedidoController {
    @Autowired
    private PedidoServiceImpl pedidoService;

    @GetMapping()
    public String listarPedido(Model model){
        List<PedidoModel> listadoPedidos = pedidoService.listarTodos();
        model.addAttribute("titulo", "Orders");
        model.addAttribute("productos", listadoPedidos);
        return "listarOrders";
    }

    @GetMapping("/crearPedido")
    public String crearPedido(Model model){
        PedidoModel pedido = new PedidoModel();
        //model.addAttribute("titulo", "Formulario: Nuevo Producto");
        model.addAttribute("pedido", pedido);
        return "formPedido";
    }

    @PostMapping("/save")
    public String guardar(@ModelAttribute PedidoModel pedido){
        System.out.println(pedido.getCliente());
        pedidoService.guardarPedido(pedido);
        System.out.println("Pedido guardado");
        System.out.println(pedido);
        return "redirect:/orders";
    }

}
