package com.eduardo.prueba.models;

import javax.persistence.*;

@Entity
@Table(name = "detalle")
public class DetalleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "total")
    private float total;

    @ManyToOne
    @JoinColumn(name = "id_prod")
    private ProductoModel producto;
    @ManyToOne
    @JoinColumn(name = "id_ped")
    private ProductoModel id_ped;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoModel getProducto() {
        return producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public ProductoModel getId_ped() {
        return id_ped;
    }

    public void setId_ped(ProductoModel id_ped) {
        this.id_ped = id_ped;
    }

    public DetalleModel() {
    }

    public DetalleModel(Long id, int cantidad, float total, ProductoModel producto, ProductoModel id_ped) {
        this.id = id;
        this.cantidad = cantidad;
        this.total = total;
        this.producto = producto;
        this.id_ped = id_ped;
    }

    @Override
    public String toString() {
        return "DetalleModel [cantidad=" + cantidad + ", id=" + id + ", id_ped=" + id_ped + ", producto=" + producto
                + ", total=" + total + "]";
    }

    

}
