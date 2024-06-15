package com.socola.out.socolaSpringBoot.entity.General;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PEDIDOS_DETALLES", schema = "GENERAL")
public class PedidoDetalle implements Serializable {

    private static final long serialVersionUID = -6680159675137366101L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_pedido_detalle_seq")
    @SequenceGenerator(name = "id_pedido_detalle_seq",sequenceName = "seq_id_pedido_detalle",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_pedido_detalle")
    private Long idPedidoDetalle;

    //private Pedido pedido;
    //private Producto producto;
    //private PedidoDetalle pedidoDetalle;
    //private FichaTecnica fichaTecnica;

    @Column(name = "cantidad")
    private Integer cantidad;

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


    public Long getIdPedidoDetalle() {
        return idPedidoDetalle;
    }

    public void setIdPedidoDetalle(Long idPedidoDetalle) {
        this.idPedidoDetalle = idPedidoDetalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
