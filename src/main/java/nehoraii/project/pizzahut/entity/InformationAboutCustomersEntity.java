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
@Table(name = "infornation_about_customers")
@NamedQueries({
    @NamedQuery(name = "InfornationAboutCustomers.findAll", query = "SELECT i FROM InformationAboutCustomersEntity i"),
    @NamedQuery(name = "InfornationAboutCustomers.findById", query = "SELECT i FROM InformationAboutCustomersEntity i WHERE i.id = :id"),
    @NamedQuery(name = "InfornationAboutCustomers.findByNameOfCustomer", query = "SELECT i FROM InformationAboutCustomersEntity i WHERE i.nameOfCustomer = :nameOfCustomer"),
    @NamedQuery(name = "InfornationAboutCustomers.findBySecondNameCustomers", query = "SELECT i FROM InformationAboutCustomersEntity i WHERE i.secondNameCustomers = :secondNameCustomers"),
    @NamedQuery(name = "InfornationAboutCustomers.findByPhoneNumberCustomer", query = "SELECT i FROM InformationAboutCustomersEntity i WHERE i.phoneNumberCustomer = :phoneNumberCustomer"),
    @NamedQuery(name = "InfornationAboutCustomers.findByAvargeOrdersMoney", query = "SELECT i FROM InformationAboutCustomersEntity i WHERE i.avargeOrdersMoney = :avargeOrdersMoney"),
    @NamedQuery(name = "InfornationAboutCustomers.findByMaxOrderMoney", query = "SELECT i FROM InformationAboutCustomersEntity i WHERE i.maxOrderMoney = :maxOrderMoney")})
public class InformationAboutCustomersEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name_of_customer")
    private String nameOfCustomer;
    @Basic(optional = false)
    @Column(name = "second_name_customers")
    private String secondNameCustomers;
    @Basic(optional = false)
    @Column(name = "phone_number_customer")
    private String phoneNumberCustomer;
    @Basic(optional = false)
    @Column(name = "avarge_orders_money")
    private double avargeOrdersMoney;
    @Basic(optional = false)
    @Column(name = "max_order_money")
    private double maxOrderMoney;

    public InformationAboutCustomersEntity() {
    }

    public InformationAboutCustomersEntity(Long id) {
        this.id = id;
    }

    public InformationAboutCustomersEntity(Long id, String nameOfCustomer, String secondNameCustomers, String phoneNumberCustomer, double avargeOrdersMoney, double maxOrderMoney) {
        this.id = id;
        this.nameOfCustomer = nameOfCustomer;
        this.secondNameCustomers = secondNameCustomers;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.avargeOrdersMoney = avargeOrdersMoney;
        this.maxOrderMoney = maxOrderMoney;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getSecondNameCustomers() {
        return secondNameCustomers;
    }

    public void setSecondNameCustomers(String secondNameCustomers) {
        this.secondNameCustomers = secondNameCustomers;
    }

    public String getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(String phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public double getAvargeOrdersMoney() {
        return avargeOrdersMoney;
    }

    public void setAvargeOrdersMoney(double avargeOrdersMoney) {
        this.avargeOrdersMoney = avargeOrdersMoney;
    }

    public double getMaxOrderMoney() {
        return maxOrderMoney;
    }

    public void setMaxOrderMoney(double maxOrderMoney) {
        this.maxOrderMoney = maxOrderMoney;
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
        if (!(object instanceof InformationAboutCustomersEntity)) {
            return false;
        }
        InformationAboutCustomersEntity other = (InformationAboutCustomersEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.InfornationAboutCustomers[ id=" + id + " ]";
    }
    
}
