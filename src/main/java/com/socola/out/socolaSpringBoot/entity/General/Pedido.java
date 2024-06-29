package com.socola.out.socolaSpringBoot.entity.General;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PEDIDOS", schema = "GENERAL")
public class Pedido implements Serializable {

    private static final long serialVersionUID = -5301068039197310878L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_pedido_seq")
    @SequenceGenerator(name = "id_pedido_seq",sequenceName = "seq_id_pedido",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "cantidad_pedidos")
    private Integer cantidad;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_pedido_detalles")
    private List<PedidoDetalle> pedidoDetalles;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_factura")
    private Factura factura;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinTable(
            name = "pedido_inventario",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "inventario_id"))
    private List<Inventario> inventarios;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    private void preUpdate(){
        this.fechaModificacion = new Date();
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
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

    public List <PedidoDetalle> getPedidoDetalles() {
        return pedidoDetalles;
    }

    public void setPedidoDetalles(List <PedidoDetalle> pedidoDetalles) {
        this.pedidoDetalles = pedidoDetalles;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List <Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List <Inventario> inventarios) {
        this.inventarios = inventarios;
    }
}
