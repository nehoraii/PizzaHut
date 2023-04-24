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
@Table(name = "information_about_pizza_toppings")
@NamedQueries({
    @NamedQuery(name = "InformationAboutPizzaToppings.findAll", query = "SELECT i FROM InformationAboutPizzaToppings i"),
    @NamedQuery(name = "InformationAboutPizzaToppings.findById", query = "SELECT i FROM InformationAboutPizzaToppings i WHERE i.id = :id"),
    @NamedQuery(name = "InformationAboutPizzaToppings.findByNameOfToppings", query = "SELECT i FROM InformationAboutPizzaToppings i WHERE i.nameOfToppings = :nameOfToppings"),
    @NamedQuery(name = "InformationAboutPizzaToppings.findByAmountLessThanThree", query = "SELECT i FROM InformationAboutPizzaToppings i WHERE i.amountLessThanThree = :amountLessThanThree"),
    @NamedQuery(name = "InformationAboutPizzaToppings.findByAmountMoreThanThree", query = "SELECT i FROM InformationAboutPizzaToppings i WHERE i.amountMoreThanThree = :amountMoreThanThree"),
    @NamedQuery(name = "InformationAboutPizzaToppings.findByCalories", query = "SELECT i FROM InformationAboutPizzaToppings i WHERE i.calories = :calories"),
    @NamedQuery(name = "InformationAboutPizzaToppings.findByPrice", query = "SELECT i FROM InformationAboutPizzaToppings i WHERE i.price = :price")})
public class InformationAboutPizzaToppings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name_of_toppings")
    private String nameOfToppings;
    @Basic(optional = false)
    @Column(name = "amount_less_than_three")
    private double amountLessThanThree;
    @Basic(optional = false)
    @Column(name = "amount_more_than_three")
    private double amountMoreThanThree;
    @Basic(optional = false)
    @Column(name = "calories")
    private double calories;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;

    public InformationAboutPizzaToppings() {
    }

    public InformationAboutPizzaToppings(Long id) {
        this.id = id;
    }

    public InformationAboutPizzaToppings(Long id, String nameOfToppings, double amountLessThanThree, double amountMoreThanThree, double calories, double price) {
        this.id = id;
        this.nameOfToppings = nameOfToppings;
        this.amountLessThanThree = amountLessThanThree;
        this.amountMoreThanThree = amountMoreThanThree;
        this.calories = calories;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfToppings() {
        return nameOfToppings;
    }

    public void setNameOfToppings(String nameOfToppings) {
        this.nameOfToppings = nameOfToppings;
    }

    public double getAmountLessThanThree() {
        return amountLessThanThree;
    }

    public void setAmountLessThanThree(double amountLessThanThree) {
        this.amountLessThanThree = amountLessThanThree;
    }

    public double getAmountMoreThanThree() {
        return amountMoreThanThree;
    }

    public void setAmountMoreThanThree(double amountMoreThanThree) {
        this.amountMoreThanThree = amountMoreThanThree;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        if (!(object instanceof InformationAboutPizzaToppings)) {
            return false;
        }
        InformationAboutPizzaToppings other = (InformationAboutPizzaToppings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.InformationAboutPizzaToppings[ id=" + id + " ]";
    }
    
}
