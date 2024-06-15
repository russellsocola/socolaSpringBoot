package com.socola.out.socolaSpringBoot.entity.Administracion;

import com.socola.out.socolaSpringBoot.entity.General.Sede;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EMPLEADOS", schema = "ADMINISTRACION")
public class Empleado implements Serializable {

    private static final long serialVersionUID = -6411716431384356349L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_empleado_seq")
    @SequenceGenerator(name = "id_empleado_seq", sequenceName = "seq_id_empleado",allocationSize = 1,initialValue = 1,schema = "ADMINISTRACION")
    @Column(name = "id_empleado")
    private Long idEmpleado;

    @Column(name = "nombre_empleado",length = 255, nullable = false)
    private String nombreEmpleado;

    @Column(name = "puesto_empleado",length = 255, nullable = false)
    private String puestoEmpleado;

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

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
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
