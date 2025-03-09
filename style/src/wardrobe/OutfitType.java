/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wardrobe;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author KULDEEP
 */
@Entity
@Table(name = "outfit type", catalog = "wardrobe", schema = "")
@NamedQueries({
    @NamedQuery(name = "OutfitType.findAll", query = "SELECT o FROM OutfitType o")
    , @NamedQuery(name = "OutfitType.findByOid", query = "SELECT o FROM OutfitType o WHERE o.oid = :oid")
    , @NamedQuery(name = "OutfitType.findByOwear", query = "SELECT o FROM OutfitType o WHERE o.owear = :owear")})
public class OutfitType implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Oid")
    private Integer oid;
    @Basic(optional = false)
    @Column(name = "Owear")
    private String owear;

    public OutfitType() {
    }

    public OutfitType(Integer oid) {
        this.oid = oid;
    }

    public OutfitType(Integer oid, String owear) {
        this.oid = oid;
        this.owear = owear;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        Integer oldOid = this.oid;
        this.oid = oid;
        changeSupport.firePropertyChange("oid", oldOid, oid);
    }

    public String getOwear() {
        return owear;
    }

    public void setOwear(String owear) {
        String oldOwear = this.owear;
        this.owear = owear;
        changeSupport.firePropertyChange("owear", oldOwear, owear);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oid != null ? oid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OutfitType)) {
            return false;
        }
        OutfitType other = (OutfitType) object;
        if ((this.oid == null && other.oid != null) || (this.oid != null && !this.oid.equals(other.oid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wardrobe.OutfitType[ oid=" + oid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
