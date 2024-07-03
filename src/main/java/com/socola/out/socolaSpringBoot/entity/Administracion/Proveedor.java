package com.socola.out.socolaSpringBoot.entity.Administracion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.socola.out.socolaSpringBoot.entity.BaseEntity;
import com.socola.out.socolaSpringBoot.entity.General.Producto;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Russell
 */

@Entity
@Table(name = "PROVEEDORES", schema = "ADMINISTRACION")
public class Proveedor extends BaseEntity {

    private static final long serialVersionUID = 5138296349030406577L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_proveedor_seq")
    @SequenceGenerator(name = "id_proveedor_seq", sequenceName = "seq_id_proveedor",allocationSize = 1,initialValue = 1,schema = "ADMINISTRACION")
    @Column(name = "id_proveedor")
    private Long idProveedor;

    @Column(name = "nombre_proveedor")
    private String nombreProveedor;

    @Column(name = "direccion_proveedor")
    private String direccionProveedor;

    @Column(name = "telefono_proveedor")
    private String telefonoProveedor;

    @Column(name = "email_proveedor")
    private String emailProveedor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_productos")
    private List<Producto> productos;

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getEmailProveedor() {
        return emailProveedor;
    }

    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }

    public List <Producto> getProductos() {
        return productos;
    }

    public void setProductos(List <Producto> productos) {
        this.productos = productos;
    }
}
