/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendadeconv;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eliut
 */
@Entity
@Table(name = "facce")
@NamedQueries({
    @NamedQuery(name = "Facce.findAll", query = "SELECT f FROM Facce f"),
    @NamedQuery(name = "Facce.findByNumfac", query = "SELECT f FROM Facce f WHERE f.numfac = :numfac"),
    @NamedQuery(name = "Facce.findByFecha", query = "SELECT f FROM Facce f WHERE f.fecha = :fecha"),
    @NamedQuery(name = "Facce.findByTotal", query = "SELECT f FROM Facce f WHERE f.total = :total"),
    @NamedQuery(name = "Facce.findByTipop", query = "SELECT f FROM Facce f WHERE f.tipop = :tipop"),
    @NamedQuery(name = "Facce.findByIdprov", query = "SELECT f FROM Facce f WHERE f.idprov = :idprov")})
public class Facce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numfac")
    private Integer numfac;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "tipop")
    private String tipop;
    @Column(name = "idprov")
    private Integer idprov;

    public Facce() {
    }

    public Facce(Integer numfac) {
        this.numfac = numfac;
    }

    public Integer getNumfac() {
        return numfac;
    }

    public void setNumfac(Integer numfac) {
        this.numfac = numfac;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }

    public Integer getIdprov() {
        return idprov;
    }

    public void setIdprov(Integer idprov) {
        this.idprov = idprov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numfac != null ? numfac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facce)) {
            return false;
        }
        Facce other = (Facce) object;
        if ((this.numfac == null && other.numfac != null) || (this.numfac != null && !this.numfac.equals(other.numfac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tiendadeconv.Facce[ numfac=" + numfac + " ]";
    }
    
}
