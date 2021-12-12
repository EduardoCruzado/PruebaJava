package com.eduardo.prueba.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class ProductoModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_prod;
    private String nombre;
    private String categoria;
    private float precioU;
    private String estado;

    

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
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

    public ProductoModel(Long id_prod, String nombre, String categoria, float precioU, String estado) {
        this.id_prod = id_prod;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioU = precioU;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ProductoModel [categoria=" + categoria + ", estado=" + estado + ", id=" + id_prod + ", nombre="
                + nombre + ", precioU=" + precioU + "]";
    }

}
