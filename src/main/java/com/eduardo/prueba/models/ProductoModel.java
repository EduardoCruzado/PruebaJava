package com.eduardo.prueba.models;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String nombre;
    private String categoria;
    private float precioU;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecioU() {
        return precioU;
    }

    public void setPrecioU(float precioU) {
        this.precioU = precioU;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ProductoModel() {
    }

    public ProductoModel(int id, String nombre, String categoria, float precioU, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioU = precioU;
        this.estado = estado;
    }

}
