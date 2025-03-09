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
@Table(name = "colour", catalog = "wardrobe", schema = "")
@NamedQueries({
    @NamedQuery(name = "Colour.findAll", query = "SELECT c FROM Colour c")
    , @NamedQuery(name = "Colour.findByCoId", query = "SELECT c FROM Colour c WHERE c.coId = :coId")
    , @NamedQuery(name = "Colour.findByColour", query = "SELECT c FROM Colour c WHERE c.colour = :colour")})
public class Colour implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CoId")
    private Integer coId;
    @Basic(optional = false)
    @Column(name = "colour")
    private String colour;

    public Colour() {
    }

    public Colour(Integer coId) {
        this.coId = coId;
    }

    public Colour(Integer coId, String colour) {
        this.coId = coId;
        this.colour = colour;
    }

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        Integer oldCoId = this.coId;
        this.coId = coId;
        changeSupport.firePropertyChange("coId", oldCoId, coId);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        String oldColour = this.colour;
        this.colour = colour;
        changeSupport.firePropertyChange("colour", oldColour, colour);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coId != null ? coId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colour)) {
            return false;
        }
        Colour other = (Colour) object;
        if ((this.coId == null && other.coId != null) || (this.coId != null && !this.coId.equals(other.coId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wardrobe.Colour[ coId=" + coId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
