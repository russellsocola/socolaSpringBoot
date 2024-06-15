package com.socola.out.socolaSpringBoot.entity.Administracion;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USUARIOS", schema = "ADMINISTRACION")
public class Usuario implements Serializable {

    private static final long  serialVersionUID = 4644783394053548965L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_usuario_seq")
    @SequenceGenerator(name = "id_usuario_seq", sequenceName = "seq_id_usuario",allocationSize = 1,initialValue = 1,schema = "ADMINISTRACION")
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "dni_usuario",length = 15,nullable = false)
    private String dniUsuario;

    @Column(name = "nom_usuario",length = 150,nullable = false)
    private String nomUsuario;

    @JsonIgnore
    @Column(name = "contrasenia",length = 300,nullable = false)
    private String contrasenia;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;


    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;


    @Column(name = "usuario_tipo")
    private String usuarioTipo;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    private void preUpdate(){
        this.fechaModificacion = new Date();
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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

    public String getUsuarioTipo() {
        return usuarioTipo;
    }

    public void setUsuarioTipo(String usuarioTipo) {
        this.usuarioTipo = usuarioTipo;
    }
}
