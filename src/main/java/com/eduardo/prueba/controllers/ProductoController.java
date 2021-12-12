package com.eduardo.prueba.controllers;

import java.util.List;

import com.eduardo.prueba.models.ProductoModel;
import com.eduardo.prueba.services.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService productoService;
    @GetMapping()
    public String listarProducto(Model model){
        List<ProductoModel> listadoProductos = productoService.listarTodos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listadoProductos);
        return "listar";
    }
}
