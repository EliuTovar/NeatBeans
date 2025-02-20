/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendadeconv;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author eliut
 */
@Entity
@Table(name = "faccd")
@NamedQueries({
    @NamedQuery(name = "Faccd.findAll", query = "SELECT f FROM Faccd f"),
    @NamedQuery(name = "Faccd.findByNumfac", query = "SELECT f FROM Faccd f WHERE f.faccdPK.numfac = :numfac"),
    @NamedQuery(name = "Faccd.findByIdprod", query = "SELECT f FROM Faccd f WHERE f.faccdPK.idprod = :idprod"),
    @NamedQuery(name = "Faccd.findByCantidad", query = "SELECT f FROM Faccd f WHERE f.cantidad = :cantidad"),
    @NamedQuery(name = "Faccd.findByPrecio", query = "SELECT f FROM Faccd f WHERE f.precio = :precio")})
public class Faccd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FaccdPK faccdPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;

    public Faccd() {
    }

    public Faccd(FaccdPK faccdPK) {
        this.faccdPK = faccdPK;
    }

    public Faccd(int numfac, int idprod) {
        this.faccdPK = new FaccdPK(numfac, idprod);
    }

    public FaccdPK getFaccdPK() {
        return faccdPK;
    }

    public void setFaccdPK(FaccdPK faccdPK) {
        this.faccdPK = faccdPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faccdPK != null ? faccdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faccd)) {
            return false;
        }
        Faccd other = (Faccd) object;
        if ((this.faccdPK == null && other.faccdPK != null) || (this.faccdPK != null && !this.faccdPK.equals(other.faccdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tiendadeconv.Faccd[ faccdPK=" + faccdPK + " ]";
    }
    
}
