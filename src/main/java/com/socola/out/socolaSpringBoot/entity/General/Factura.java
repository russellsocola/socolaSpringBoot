package com.socola.out.socolaSpringBoot.entity.General;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.socola.out.socolaSpringBoot.entity.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "FACTURAS", schema = "GENERAL")
public class Factura extends BaseEntity {

    private static final long serialVersionUID = -6685079979042422599L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_factura_seq")
    @SequenceGenerator(name = "id_factura_seq",sequenceName = "seq_id_factura",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_factura")
    private Long idFactura;


    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "precio_total")
    private Double precioTotal;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_pago")
    private List<Pago> pago;

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

    public List <Pago> getPago() {
        return pago;
    }

    public void setPago(List <Pago> pago) {
        this.pago = pago;
    }
}
