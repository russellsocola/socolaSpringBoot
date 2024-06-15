package com.socola.out.socolaSpringBoot.entity.General;

import com.socola.out.socolaSpringBoot.entity.Administracion.Administrador;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SEDES", schema = "GENERAL")
public class Sede implements Serializable {

    private static final long serialVersionUID = 1250390497808810087L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sede_seq")
    @SequenceGenerator(name = "id_sede_seq",sequenceName = "seq_id_sede",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_sede")
    private Long idSede;

    @Column(name = "nombre_sede")
    private String nombreSede;

    @Column(name = "direccion_sede")
    private String direccionSede;

//    @Column(name = "administrador")
//    private Administrador administrador;

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


    public Long getIdSede() {
        return idSede;
    }

    public void setIdSede(Long idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
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
