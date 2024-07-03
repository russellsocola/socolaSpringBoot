package com.socola.out.socolaSpringBoot.entity.Administracion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.socola.out.socolaSpringBoot.entity.BaseEntity;
import com.socola.out.socolaSpringBoot.entity.General.Pedido;
import com.socola.out.socolaSpringBoot.entity.General.PedidoDetalle;
import com.socola.out.socolaSpringBoot.entity.General.Sede;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Russell
 */
@Entity
@Table(name = "EMPLEADOS", schema = "ADMINISTRACION")
public class Empleado extends BaseEntity {

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

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_pedidos")
    private List<Pedido> pedidos;

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

    public List <Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List <Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
