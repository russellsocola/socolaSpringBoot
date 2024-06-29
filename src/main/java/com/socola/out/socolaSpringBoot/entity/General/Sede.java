package com.socola.out.socolaSpringBoot.entity.General;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.socola.out.socolaSpringBoot.entity.Administracion.Cliente;
import com.socola.out.socolaSpringBoot.entity.Administracion.Empleado;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_empleado")
    private List <Empleado> empleado;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_cliente")
    private List<Cliente> clientes;

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

    public List <Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List <Empleado> empleado) {
        this.empleado = empleado;
    }

    public List <Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List <Cliente> clientes) {
        this.clientes = clientes;
    }
}
