package com.socola.out.socolaSpringBoot.entity.Administracion;

import com.socola.out.socolaSpringBoot.entity.General.Sede;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ADMINISTRADORES", schema = "ADMINISTRACION")
public class Administrador implements Serializable {

    private static final long serialVersionUID = 5270163921841341592L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_administrador_seq")
    @SequenceGenerator(name = "id_administrador_seq", sequenceName = "seq_id_administrador",allocationSize = 1,initialValue = 1,schema = "ADMINISTRACION")
    @Column(name = "id_administrador")
    private Long idAdministrador;

    @Column(name = "nombre_administrador",length = 255)
    private String nombreAdministrador;

//    @Column(name = "sede")
//    private Sede sede;

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

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
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
