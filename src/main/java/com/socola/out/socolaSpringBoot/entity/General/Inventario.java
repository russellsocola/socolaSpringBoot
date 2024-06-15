package com.socola.out.socolaSpringBoot.entity.General;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "INVENTARIOS", schema = "GENERAL")
public class Inventario implements Serializable {

    private static final long serialVersionUID = 4508133749092504292L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_inventario_seq")
    @SequenceGenerator(name = "id_inventario_seq",sequenceName = "seq_id_inventario",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_inventario")
    private Long idInventario;

    //private Producto producto;

    //private Almacen almacen;

//    @Column(name = "ficha_tecnica")
//    private FichaTecnica fichaTecnica;

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

    public Long getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Long idInventario) {
        this.idInventario = idInventario;
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
