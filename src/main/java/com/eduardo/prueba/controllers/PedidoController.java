package com.eduardo.prueba.controllers;

import java.util.List;

import com.eduardo.prueba.models.PedidoModel;
import com.eduardo.prueba.models.ProductoModel;
import com.eduardo.prueba.services.PedidoServiceImpl;
import com.eduardo.prueba.services.ProductoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class PedidoController {
    @Autowired
    private PedidoServiceImpl pedidoService;
    @Autowired
    private ProductoServiceImpl productoService;

    @GetMapping()
    public String listarPedido(Model model){
        List<PedidoModel> listadoPedidos = pedidoService.listarTodos();
        model.addAttribute("titulo", "Orders");
        model.addAttribute("pedidos", listadoPedidos);
        return "listarOrders";
    }

    @GetMapping("/crearPedido")
    public String crearPedido(Model model){
        PedidoModel pedido = new PedidoModel();
        List<ProductoModel> listadoProductos = productoService.listarTodos();
        model.addAttribute("titulo", "Formulario: Nuevo Pedido");
        model.addAttribute("pedido", pedido);
        model.addAttribute("lista", listadoProductos);
        
        return "formPedido";
    }

    @GetMapping("/{id_ped}")
    public String editarPedido(@PathVariable("id_ped") Long idPedido, Model model){
        PedidoModel pedido = pedidoService.buscarPorId(idPedido);
        model.addAttribute("id", "Order N°"+ pedido.getId_ped() );
        model.addAttribute("cliente", "Cliente:  "+ pedido.getCliente() );
        model.addAttribute("estado", "Estado:  "+ pedido.getEstado() );
        model.addAttribute("fecha", "Fecha:  "+ pedido.getFecha() );
        return "editarPedido";
    }

    @PostMapping("/saveP")
    public String guardar(@ModelAttribute PedidoModel pedido){
        System.out.println(pedido.getCliente());
        System.out.println(pedido.getFecha());
        pedidoService.guardarPedido(pedido);
        System.out.println("Pedido guardado");
        System.out.println(pedido);
        return "redirect:/orders";
    }

}
