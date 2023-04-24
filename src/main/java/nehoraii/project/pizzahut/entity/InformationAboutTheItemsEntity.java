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
@Table(name = "Information_about_the_items")
@NamedQueries({
    @NamedQuery(name = "Informationabouttheitems.findAll", query = "SELECT i FROM InformationAboutTheItemsEntity i"),
    @NamedQuery(name = "Informationabouttheitems.findById", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.id = :id"),
    @NamedQuery(name = "Informationabouttheitems.findByCountDoughReadyToWork", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.countDoughReadyToWork = :countDoughReadyToWork"),
    @NamedQuery(name = "Informationabouttheitems.findByCodeOfDough", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.codeOfDough = :codeOfDough"),
    @NamedQuery(name = "Informationabouttheitems.findByAmountOfCheeseInGram", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.amountOfCheeseInGram = :amountOfCheeseInGram"),
    @NamedQuery(name = "Informationabouttheitems.findByAmountOfSauceInMl", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.amountOfSauceInMl = :amountOfSauceInMl"),
    @NamedQuery(name = "Informationabouttheitems.findByVegan", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.vegan = :vegan"),
    @NamedQuery(name = "Informationabouttheitems.findByCalories", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.calories = :calories"),
    @NamedQuery(name = "Informationabouttheitems.findByPrice", query = "SELECT i FROM InformationAboutTheItemsEntity i WHERE i.price = :price")})
public class InformationAboutTheItemsEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "count_dough_ready_to_work")
    private int countDoughReadyToWork;
    @Basic(optional = false)
    @Column(name = "code_of_dough")
    private String codeOfDough;
    @Basic(optional = false)
    @Column(name = "amount_of_cheese_in gram")
    private double amountOfCheeseInGram;
    @Basic(optional = false)
    @Column(name = "amount_of_sauce_in_ml")
    private double amountOfSauceInMl;
    @Basic(optional = false)
    @Column(name = "vegan")
    private boolean vegan;
    @Basic(optional = false)
    @Column(name = "calories")
    private double calories;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;

    public InformationAboutTheItemsEntity() {
    }

    public InformationAboutTheItemsEntity(Long id) {
        this.id = id;
    }

    public InformationAboutTheItemsEntity(Long id, int countDoughReadyToWork, String codeOfDough, double amountOfCheeseInGram, double amountOfSauceInMl, boolean vegan, double calories, double price) {
        this.id = id;
        this.countDoughReadyToWork = countDoughReadyToWork;
        this.codeOfDough = codeOfDough;
        this.amountOfCheeseInGram = amountOfCheeseInGram;
        this.amountOfSauceInMl = amountOfSauceInMl;
        this.vegan = vegan;
        this.calories = calories;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCountDoughReadyToWork() {
        return countDoughReadyToWork;
    }

    public void setCountDoughReadyToWork(int countDoughReadyToWork) {
        this.countDoughReadyToWork = countDoughReadyToWork;
    }

    public String getCodeOfDough() {
        return codeOfDough;
    }

    public void setCodeOfDough(String codeOfDough) {
        this.codeOfDough = codeOfDough;
    }

    public double getAmountOfCheeseInGram() {
        return amountOfCheeseInGram;
    }

    public void setAmountOfCheeseInGram(double amountOfCheeseInGram) {
        this.amountOfCheeseInGram = amountOfCheeseInGram;
    }

    public double getAmountOfSauceInMl() {
        return amountOfSauceInMl;
    }

    public void setAmountOfSauceInMl(double amountOfSauceInMl) {
        this.amountOfSauceInMl = amountOfSauceInMl;
    }

    public boolean getVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
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
        if (!(object instanceof InformationAboutTheItemsEntity)) {
            return false;
        }
        InformationAboutTheItemsEntity other = (InformationAboutTheItemsEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Informationabouttheitems[ id=" + id + " ]";
    }
    
}
