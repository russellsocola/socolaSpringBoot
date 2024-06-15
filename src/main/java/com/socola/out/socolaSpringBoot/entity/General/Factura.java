package com.socola.out.socolaSpringBoot.entity.General;

import com.socola.out.socolaSpringBoot.entity.Administracion.Cliente;
import com.socola.out.socolaSpringBoot.entity.Administracion.Empleado;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FACTURAS", schema = "GENERAL")
public class Factura implements Serializable {

    private static final long serialVersionUID = -6685079979042422599L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_factura_seq")
    @SequenceGenerator(name = "id_factura_seq",sequenceName = "seq_id_factura",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_factura")
    private Long idFactura;

//    @Column(name = "pedido")
//    private Pedido pedido;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    //@Column(name = "cliente")
    //private Cliente cliente;

    @Column(name = "precio_total")
    private Double precioTotal;

    //private Empleado empleado;


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

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
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
