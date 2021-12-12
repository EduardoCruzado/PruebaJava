package com.eduardo.prueba.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
public class PedidoModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String estado;
    private LocalDateTime fecha;
    private int cantImp;
    private Float totalImp;
    private Float total;

    @ManyToOne
    @JoinColumn(name = "id_prod")
    private ProductoModel producto;

    public Long getId() {
        return id;
    }

    public int getCantImp() {
        return cantImp;
    }

    public void setCantImp(int cantImp) {
        this.cantImp = cantImp;
    }

    public Float getTotalImp() {
        return totalImp;
    }

    public void setTotalImp(Float totalImp) {
        this.totalImp = totalImp;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public ProductoModel getProducto() {
        return producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public void setId(Long id) {
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

    public PedidoModel(Long id, String estado, LocalDateTime fecha, int cantImp, Float totalImp, Float total,
            ProductoModel producto, String cliente) {
        this.id = id;
        this.estado = estado;
        this.fecha = fecha;
        this.cantImp = cantImp;
        this.totalImp = totalImp;
        this.total = total;
        this.producto = producto;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "PedidoModel [cantImp=" + cantImp + ", cliente=" + cliente + ", estado=" + estado + ", fecha=" + fecha
                + ", id=" + id + ", producto=" + producto + ", total=" + total + ", totalImp=" + totalImp + "]";
    }

}
