package com.socola.out.socolaSpringBoot.entity.General;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ALMACENES", schema = "GENERAL")
public class Almacen implements Serializable {

    private static final long serialVersionUID = -7538480092955732843L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_almacen_seq")
    @SequenceGenerator(name = "id_almacen_seq",sequenceName = "seq_id_almacen",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_almacen")
    private Long idAlmacen;

    @Column(name = "nombre_almacen")
    private String nombreAlmacen;

    @Column(name = "descripcion_almacen")
    private String descripcionAlmacen;

    @Column(name = "direccion_almacen")
    private String direccionAlmacen;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_inventario")
    private List <Inventario> inventario;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    private void preUpdate(){
        this.fechaModificacion = new Date();
    }

    public Long getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(Long idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public String getDescripcionAlmacen() {
        return descripcionAlmacen;
    }

    public void setDescripcionAlmacen(String descripcionAlmacen) {
        this.descripcionAlmacen = descripcionAlmacen;
    }

    public String getDireccionAlmacen() {
        return direccionAlmacen;
    }

    public void setDireccionAlmacen(String direccionAlmacen) {
        this.direccionAlmacen = direccionAlmacen;
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

    public List <Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List <Inventario> inventario) {
        this.inventario = inventario;
    }
}
