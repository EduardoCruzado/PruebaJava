package com.eduardo.prueba.models;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String estado;
    private LocalDateTime fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private String cliente;

    public PedidoModel() {
    }

    public PedidoModel(int id, String estado, LocalDateTime fecha, String cliente) {
        this.id = id;
        this.estado = estado;
        this.fecha = fecha;
        this.cliente = cliente;
    }

}
