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
@Table(name = "pizza")
@NamedQueries({
    @NamedQuery(name = "Pizza.findAll", query = "SELECT p FROM PizzaEntity p"),
    @NamedQuery(name = "Pizza.findById", query = "SELECT p FROM PizzaEntity p WHERE p.id = :id"),
    @NamedQuery(name = "Pizza.findByIdInformationAboutItems", query = "SELECT p FROM PizzaEntity p WHERE p.idInformationAboutItems = :idInformationAboutItems")})
public class PizzaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "id_information_about_items")
    private long idInformationAboutItems;

    public PizzaEntity() {
    }

    public PizzaEntity(Long id) {
        this.id = id;
    }

    public PizzaEntity(Long id, long idInformationAboutItems) {
        this.id = id;
        this.idInformationAboutItems = idInformationAboutItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdInformationAboutItems() {
        return idInformationAboutItems;
    }

    public void setIdInformationAboutItems(long idInformationAboutItems) {
        this.idInformationAboutItems = idInformationAboutItems;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PizzaEntity)) {
            return false;
        }
        PizzaEntity other = (PizzaEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Pizza[ id=" + id + " ]";
    }
    
}
