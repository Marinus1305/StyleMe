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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author KULDEEP
 */
@Entity
@Table(name = "tblstock", catalog = "wardrobe", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tblstock.findAll", query = "SELECT t FROM Tblstock t")
    , @NamedQuery(name = "Tblstock.findByItemId", query = "SELECT t FROM Tblstock t WHERE t.itemId = :itemId")
    , @NamedQuery(name = "Tblstock.findByItemDes", query = "SELECT t FROM Tblstock t WHERE t.itemDes = :itemDes")
    , @NamedQuery(name = "Tblstock.findByItemType", query = "SELECT t FROM Tblstock t WHERE t.itemType = :itemType")
    , @NamedQuery(name = "Tblstock.findByItemBrand", query = "SELECT t FROM Tblstock t WHERE t.itemBrand = :itemBrand")
    , @NamedQuery(name = "Tblstock.findByItemcolour", query = "SELECT t FROM Tblstock t WHERE t.itemcolour = :itemcolour")
    , @NamedQuery(name = "Tblstock.findByItemWear", query = "SELECT t FROM Tblstock t WHERE t.itemWear = :itemWear")
    , @NamedQuery(name = "Tblstock.findByItemBuyDate", query = "SELECT t FROM Tblstock t WHERE t.itemBuyDate = :itemBuyDate")})
public class Tblstock implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ItemId")
    private Integer itemId;
    @Basic(optional = false)
    @Column(name = "ItemDes")
    private String itemDes;
    @Basic(optional = false)
    @Column(name = "ItemType")
    private String itemType;
    @Basic(optional = false)
    @Column(name = "ItemBrand")
    private String itemBrand;
    @Basic(optional = false)
    @Column(name = "Itemcolour")
    private String itemcolour;
    @Basic(optional = false)
    @Column(name = "ItemWear")
    private String itemWear;
    @Basic(optional = false)
    @Column(name = "ItemBuyDate")
    private String itemBuyDate;
    @Lob
    @Column(name = "ItemPhoto")
    private byte[] itemPhoto;

    public Tblstock() {
    }

    public Tblstock(Integer itemId) {
        this.itemId = itemId;
    }

    public Tblstock(Integer itemId, String itemDes, String itemType, String itemBrand, String itemcolour, String itemWear, String itemBuyDate) {
        this.itemId = itemId;
        this.itemDes = itemDes;
        this.itemType = itemType;
        this.itemBrand = itemBrand;
        this.itemcolour = itemcolour;
        this.itemWear = itemWear;
        this.itemBuyDate = itemBuyDate;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        Integer oldItemId = this.itemId;
        this.itemId = itemId;
        changeSupport.firePropertyChange("itemId", oldItemId, itemId);
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        String oldItemDes = this.itemDes;
        this.itemDes = itemDes;
        changeSupport.firePropertyChange("itemDes", oldItemDes, itemDes);
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        String oldItemType = this.itemType;
        this.itemType = itemType;
        changeSupport.firePropertyChange("itemType", oldItemType, itemType);
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        String oldItemBrand = this.itemBrand;
        this.itemBrand = itemBrand;
        changeSupport.firePropertyChange("itemBrand", oldItemBrand, itemBrand);
    }

    public String getItemcolour() {
        return itemcolour;
    }

    public void setItemcolour(String itemcolour) {
        String oldItemcolour = this.itemcolour;
        this.itemcolour = itemcolour;
        changeSupport.firePropertyChange("itemcolour", oldItemcolour, itemcolour);
    }

    public String getItemWear() {
        return itemWear;
    }

    public void setItemWear(String itemWear) {
        String oldItemWear = this.itemWear;
        this.itemWear = itemWear;
        changeSupport.firePropertyChange("itemWear", oldItemWear, itemWear);
    }

    public String getItemBuyDate() {
        return itemBuyDate;
    }

    public void setItemBuyDate(String itemBuyDate) {
        String oldItemBuyDate = this.itemBuyDate;
        this.itemBuyDate = itemBuyDate;
        changeSupport.firePropertyChange("itemBuyDate", oldItemBuyDate, itemBuyDate);
    }

    public byte[] getItemPhoto() {
        return itemPhoto;
    }

    public void setItemPhoto(byte[] itemPhoto) {
        byte[] oldItemPhoto = this.itemPhoto;
        this.itemPhoto = itemPhoto;
        changeSupport.firePropertyChange("itemPhoto", oldItemPhoto, itemPhoto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblstock)) {
            return false;
        }
        Tblstock other = (Tblstock) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wardrobe.Tblstock[ itemId=" + itemId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
