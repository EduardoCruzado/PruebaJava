package com.eduardo.prueba.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
public class PedidoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_ped;
    @Column(name = "cliente")
    private String cliente;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha")
    private LocalDateTime fecha;
    @Column(name = "cantImp")
    private int cantImp;
    @Column(name = "totalImpl")
    private Float totalImp;
    @Column(name = "totalP")
    private Float totalP;
    

    public Long getId_ped() {
        return id_ped;
    }

    public void setId_ped(Long id_ped) {
        this.id_ped = id_ped;
    }

    public int getCantImp() {
        return cantImp;
    }

    public Float getTotalP() {
        return totalP;
    }

    public void setTotalP(Float totalP) {
        this.totalP = totalP;
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

    public PedidoModel() {
    }

    public PedidoModel(Long id_ped, String estado, LocalDateTime fecha, int cantImp, Float totalImp, Float totalP,
            String cliente) {
        this.id_ped = id_ped;
        this.estado = estado;
        this.fecha = fecha;
        this.cantImp = cantImp;
        this.totalImp = totalImp;
        this.totalP = totalP;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "PedidoModel [cantImp=" + cantImp + ", cliente=" + cliente + ", estado=" + estado + ", fecha=" + fecha
                + ", id_ped=" + id_ped + ", totalImp=" + totalImp + ", totalP=" + totalP + "]";
    }

}
