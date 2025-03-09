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
@Table(name = "cloth description", catalog = "wardrobe", schema = "")
@NamedQueries({
    @NamedQuery(name = "ClothDescription.findAll", query = "SELECT c FROM ClothDescription c")
    , @NamedQuery(name = "ClothDescription.findByCid", query = "SELECT c FROM ClothDescription c WHERE c.cid = :cid")
    , @NamedQuery(name = "ClothDescription.findByClothType", query = "SELECT c FROM ClothDescription c WHERE c.clothType = :clothType")})
public class ClothDescription implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cid")
    private Integer cid;
    @Basic(optional = false)
    @Column(name = "cloth type")
    private String clothType;

    public ClothDescription() {
    }

    public ClothDescription(Integer cid) {
        this.cid = cid;
    }

    public ClothDescription(Integer cid, String clothType) {
        this.cid = cid;
        this.clothType = clothType;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        Integer oldCid = this.cid;
        this.cid = cid;
        changeSupport.firePropertyChange("cid", oldCid, cid);
    }

    public String getClothType() {
        return clothType;
    }

    public void setClothType(String clothType) {
        String oldClothType = this.clothType;
        this.clothType = clothType;
        changeSupport.firePropertyChange("clothType", oldClothType, clothType);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClothDescription)) {
            return false;
        }
        ClothDescription other = (ClothDescription) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wardrobe.ClothDescription[ cid=" + cid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
