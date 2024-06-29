package com.socola.out.socolaSpringBoot.entity.Administracion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.socola.out.socolaSpringBoot.entity.General.Pedido;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CLIENTES", schema = "ADMINISTRACION")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 4174170275798710255L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_cliente_seq")
    @SequenceGenerator(name = "id_cliente_seq", sequenceName = "seq_id_cliente", allocationSize = 1, initialValue = 1, schema = "ADMINISTRACION")
    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "nombre_cliente", length = 255, nullable = false)
    private String nombreCliente;

    @Column(name = "direccion_cliente", length = 255, nullable = false)
    private String direccion;

    @Column(name = "telefono_cliente", length = 20, nullable = false)
    private String telefonoCliente;

    @Column(name = "email_cliente", length = 55, nullable = false)
    private String emailCliente;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true, value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_pedidos")
    private List<Pedido> pedidos;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = new Date();
    }
    @PreUpdate
    private void preUpdate(){
        this.fechaModificacion = new Date();
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
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

    public List <Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List <Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
