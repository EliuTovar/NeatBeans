/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendadeconv;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author eliut
 */
@Embeddable
public class FaccdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "numfac")
    private int numfac;
    @Basic(optional = false)
    @Column(name = "idprod")
    private int idprod;

    public FaccdPK() {
    }

    public FaccdPK(int numfac, int idprod) {
        this.numfac = numfac;
        this.idprod = idprod;
    }

    public int getNumfac() {
        return numfac;
    }

    public void setNumfac(int numfac) {
        this.numfac = numfac;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numfac;
        hash += (int) idprod;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaccdPK)) {
            return false;
        }
        FaccdPK other = (FaccdPK) object;
        if (this.numfac != other.numfac) {
            return false;
        }
        if (this.idprod != other.idprod) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tiendadeconv.FaccdPK[ numfac=" + numfac + ", idprod=" + idprod + " ]";
    }
    
}
