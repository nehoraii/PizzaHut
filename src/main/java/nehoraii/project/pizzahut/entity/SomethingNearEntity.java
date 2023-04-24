/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nehoraii.project.pizzahut.entity;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "something_near")
@NamedQueries({
    @NamedQuery(name = "SomethingNear.findAll", query = "SELECT s FROM SomethingNearEntity s"),
    @NamedQuery(name = "SomethingNear.findById", query = "SELECT s FROM SomethingNearEntity s WHERE s.id = :id"),
    @NamedQuery(name = "SomethingNear.findByIdInformationAboutOrder", query = "SELECT s FROM SomethingNearEntity s WHERE s.idInformationAboutOrder = :idInformationAboutOrder"),
    @NamedQuery(name = "SomethingNear.findByNameProduct", query = "SELECT s FROM SomethingNearEntity s WHERE s.nameProduct = :nameProduct"),
    @NamedQuery(name = "SomethingNear.findByPrice", query = "SELECT s FROM SomethingNearEntity s WHERE s.price = :price"),
    @NamedQuery(name = "SomethingNear.findByCalories", query = "SELECT s FROM SomethingNearEntity s WHERE s.calories = :calories")})
public class SomethingNearEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Id
    @Basic(optional = false)
    @Column(name = "id_information_about_order")
    private Long idInformationAboutOrder;
    @Basic(optional = false)
    @Column(name = "name_product")
    private String nameProduct;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @Column(name = "calories")
    private double calories;

    public SomethingNearEntity() {
    }

    public SomethingNearEntity(Long idInformationAboutOrder) {
        this.idInformationAboutOrder = idInformationAboutOrder;
    }

    public SomethingNearEntity(Long idInformationAboutOrder, long id, String nameProduct, double price, double calories) {
        this.idInformationAboutOrder = idInformationAboutOrder;
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.calories = calories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getIdInformationAboutOrder() {
        return idInformationAboutOrder;
    }

    public void setIdInformationAboutOrder(Long idInformationAboutOrder) {
        this.idInformationAboutOrder = idInformationAboutOrder;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformationAboutOrder != null ? idInformationAboutOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SomethingNearEntity)) {
            return false;
        }
        SomethingNearEntity other = (SomethingNearEntity) object;
        if ((this.idInformationAboutOrder == null && other.idInformationAboutOrder != null) || (this.idInformationAboutOrder != null && !this.idInformationAboutOrder.equals(other.idInformationAboutOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.SomethingNear[ idInformationAboutOrder=" + idInformationAboutOrder + " ]";
    }
    
}
