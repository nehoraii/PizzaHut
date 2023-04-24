/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nehoraii.project.pizzahut.entity;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "pizza_topping")
@NamedQueries({
    @NamedQuery(name = "PizzaTopping.findAll", query = "SELECT p FROM PizzaToppingEntity p"),
    @NamedQuery(name = "PizzaTopping.findById", query = "SELECT p FROM PizzaToppingEntity p WHERE p.id = :id"),
    @NamedQuery(name = "PizzaTopping.findByIdInformationAboutPizzaTopping", query = "SELECT p FROM PizzaToppingEntity p WHERE p.idInformationAboutPizzaTopping = :idInformationAboutPizzaTopping")})
public class PizzaToppingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "id_information_about_pizza_topping")
    private long idInformationAboutPizzaTopping;

    public PizzaToppingEntity() {
    }

    public PizzaToppingEntity(Long id) {
        this.id = id;
    }

    public PizzaToppingEntity(Long id, long idInformationAboutPizzaTopping) {
        this.id = id;
        this.idInformationAboutPizzaTopping = idInformationAboutPizzaTopping;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdInformationAboutPizzaTopping() {
        return idInformationAboutPizzaTopping;
    }

    public void setIdInformationAboutPizzaTopping(long idInformationAboutPizzaTopping) {
        this.idInformationAboutPizzaTopping = idInformationAboutPizzaTopping;
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
        if (!(object instanceof PizzaToppingEntity)) {
            return false;
        }
        PizzaToppingEntity other = (PizzaToppingEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.PizzaTopping[ id=" + id + " ]";
    }
    
}
