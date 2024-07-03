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

    @Column(name = "cantidad")
    private Integer cantidad;

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
}
