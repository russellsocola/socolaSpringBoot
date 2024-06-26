package com.socola.out.socolaSpringBoot.entity.General;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "FICHAS_TECNICAS", schema = "GENERAL")
public class FichaTecnica implements Serializable {

    private static final long serialVersionUID = -1282562396661193479L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_ficha_tecnica_seq")
    @SequenceGenerator(name = "id_ficha_tecnica_seq",sequenceName = "seq_id_ficha_tecnica",allocationSize = 1,initialValue = 1,schema = "GENERAL")
    @Column(name = "id_ficha_tecnica")
    private Long idFichaTecnica;

    @Column(name = "nombre_ficha_tecnica")
    private String nombreFichaTecnica;

    @Column(name = "cod_ficha_tecnica")
    private String codFichaTecnica;

    @Column(name = "especificaciones_ficha_tecnica")
    private String especificacionesFichaTecnica;

    @Column(name = "precausiones")
    private String Precausiones;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "fk_id_producto")
    private Producto producto;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties(allowSetters = true,value = {"hibernateLazyInitializer","handler"})
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

    public Long getIdFichaTecnica() {
        return idFichaTecnica;
    }

    public void setIdFichaTecnica(Long idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public String getNombreFichaTecnica() {
        return nombreFichaTecnica;
    }

    public void setNombreFichaTecnica(String nombreFichaTecnica) {
        this.nombreFichaTecnica = nombreFichaTecnica;
    }

    public String getCodFichaTecnica() {
        return codFichaTecnica;
    }

    public void setCodFichaTecnica(String codFichaTecnica) {
        this.codFichaTecnica = codFichaTecnica;
    }

    public String getEspecificacionesFichaTecnica() {
        return especificacionesFichaTecnica;
    }

    public void setEspecificacionesFichaTecnica(String especificacionesFichaTecnica) {
        this.especificacionesFichaTecnica = especificacionesFichaTecnica;
    }

    public String getPrecausiones() {
        return Precausiones;
    }

    public void setPrecausiones(String precausiones) {
        Precausiones = precausiones;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List <Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List <Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
