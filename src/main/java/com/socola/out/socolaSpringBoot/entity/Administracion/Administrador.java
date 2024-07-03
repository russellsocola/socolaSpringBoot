package com.socola.out.socolaSpringBoot.entity.Administracion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.socola.out.socolaSpringBoot.entity.BaseEntity;
import com.socola.out.socolaSpringBoot.entity.General.Factura;
import com.socola.out.socolaSpringBoot.entity.General.Sede;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Russell
 */
@Entity
@Table(name = "ADMINISTRADORES", schema = "ADMINISTRACION")
public class Administrador extends BaseEntity {

    private static final long serialVersionUID = 5270163921841341592L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_administrador_seq")
    @SequenceGenerator(name = "id_administrador_seq", sequenceName = "seq_id_administrador",allocationSize = 1,initialValue = 1,schema = "ADMINISTRACION")
    @Column(name = "id_administrador")
    private Long idAdministrador;

    @Column(name = "nombre_administrador",length = 255)
    private String nombreAdministrador;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_sede")
    private List<Sede> sede;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_facturas")
    private List<Factura> facturas;

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

    public List <Sede> getSede() {
        return sede;
    }

    public void setSede(List <Sede> sede) {
        this.sede = sede;
    }

    public List <Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List <Factura> facturas) {
        this.facturas = facturas;
    }
}
