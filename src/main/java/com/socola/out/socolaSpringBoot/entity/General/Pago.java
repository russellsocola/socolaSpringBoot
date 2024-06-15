package com.socola.out.socolaSpringBoot.entity.General;

import com.socola.out.socolaSpringBoot.entity.Administracion.Cliente;
import com.socola.out.socolaSpringBoot.entity.Administracion.Empleado;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PAGOS", schema = "GENERAL")
public class Pago implements Serializable {

    private static final long serialVersionUID = -3321254456341495564L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_pago_seq")
    @SequenceGenerator(name = "id_pago_seq",sequenceName = "seq_id_pago",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_pago")
    private Long idPago;

    //private Factura factura;
    //private Cliente cliente;
//    private Empleado empleado;
//    private Sede sede;

    @Column(name = "valor_pagado")
    private Double valorPagado;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "tipo_pago")
    private String tipoPago;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    private void preUpdate(){
        this.fechaModificacion = new Date();
    }

    public Long getIdPago() {
        return idPago;
    }

    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    public Double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(Double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
