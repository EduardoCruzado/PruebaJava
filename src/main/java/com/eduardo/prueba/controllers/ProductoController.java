package com.eduardo.prueba.controllers;

import java.util.List;

import com.eduardo.prueba.models.ProductoModel;
import com.eduardo.prueba.services.IProductoService;
import com.eduardo.prueba.services.ProductoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoService;

    @GetMapping()
    public String listarProducto(Model model){
        List<ProductoModel> listadoProductos = productoService.listarTodos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listadoProductos);
        return "listarProducto";
    }

    @GetMapping("/crearProducto")
    public String crearProducto(Model model){
        ProductoModel producto = new ProductoModel();
        model.addAttribute("titulo", "Formulario: Nuevo Producto");
        model.addAttribute("producto", producto);
        return "formProducto";
    }

    @GetMapping("/edit/{id_prod}")
    public String editarProducto(@PathVariable("id_prod") Long idProducto, Model model){
        ProductoModel producto = productoService.buscarPorId(idProducto);
        model.addAttribute("titulo", "Formulario: Editar Producto");
        model.addAttribute("producto", producto);
        return "formProducto";
    }

    @PostMapping("/save")
    public String guardar(@ModelAttribute ProductoModel producto){
        productoService.guardarProducto(producto);
        System.out.println("Producto guardado");
        System.out.println(producto);
        return "redirect:/productos";
    }
}
