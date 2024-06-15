package com.socola.out.socolaSpringBoot.entity.General;

import com.socola.out.socolaSpringBoot.entity.Administracion.Proveedor;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PRODUCTOS", schema = "GENERAL")
public class Producto implements Serializable {

    private static final long serialVersionUID = -3088790548303869848L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_producto_seq")
    @SequenceGenerator(name = "id_producto_seq",sequenceName = "seq_id_producto",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "descripcion_producto")
    private String descripcionProducto;

    @Column(name = "precio_producto")
    private Double precioProducto;

//    @Column(name = "proveedor")
//    private Proveedor proveedor;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @PrePersist
    public void prePersist() {
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    private void preUpdate() {
        this.fechaModificacion = new Date();
    }


    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
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
