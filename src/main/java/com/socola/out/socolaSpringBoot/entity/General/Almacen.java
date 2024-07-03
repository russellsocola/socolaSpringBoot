package com.socola.out.socolaSpringBoot.entity.General;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.socola.out.socolaSpringBoot.entity.BaseEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ALMACENES", schema = "GENERAL")
public class Almacen extends BaseEntity {

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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler","almacen"})
    @JoinColumn(name = "fk_id_inventario")
    private List<Inventario> inventario;

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

    public List <Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List <Inventario> inventario) {
        this.inventario = inventario;
    }
}
