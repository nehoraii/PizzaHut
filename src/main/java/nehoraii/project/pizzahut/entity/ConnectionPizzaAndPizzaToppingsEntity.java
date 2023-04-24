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
@Table(name = "connection_pizza_and_pizza_toppings")
@NamedQueries({
    @NamedQuery(name = "ConnectionPizzaAndPizzaToppings.findAll", query = "SELECT c FROM ConnectionPizzaAndPizzaToppings c"),
    @NamedQuery(name = "ConnectionPizzaAndPizzaToppings.findById", query = "SELECT c FROM ConnectionPizzaAndPizzaToppings c WHERE c.id = :id"),
    @NamedQuery(name = "ConnectionPizzaAndPizzaToppings.findByIdInformationAboutTheItems", query = "SELECT c FROM ConnectionPizzaAndPizzaToppings c WHERE c.idInformationAboutTheItems = :idInformationAboutTheItems"),
    @NamedQuery(name = "ConnectionPizzaAndPizzaToppings.findByIdInformationAboutPizzaToppings", query = "SELECT c FROM ConnectionPizzaAndPizzaToppings c WHERE c.idInformationAboutPizzaToppings = :idInformationAboutPizzaToppings"),
    @NamedQuery(name = "ConnectionPizzaAndPizzaToppings.findByIdInformationAboutOrder", query = "SELECT c FROM ConnectionPizzaAndPizzaToppings c WHERE c.idInformationAboutOrder = :idInformationAboutOrder"),
    @NamedQuery(name = "ConnectionPizzaAndPizzaToppings.findByRightPizzaTopping", query = "SELECT c FROM ConnectionPizzaAndPizzaToppings c WHERE c.rightPizzaTopping = :rightPizzaTopping"),
    @NamedQuery(name = "ConnectionPizzaAndPizzaToppings.findByLeftPizzaTopping", query = "SELECT c FROM ConnectionPizzaAndPizzaToppings c WHERE c.leftPizzaTopping = :leftPizzaTopping")})
public class ConnectionPizzaAndPizzaToppings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "id_information_about_the_items")
    private long idInformationAboutTheItems;
    @Basic(optional = false)
    @Column(name = "id_information_about_pizza_toppings")
    private long idInformationAboutPizzaToppings;
    @Basic(optional = false)
    @Column(name = "id_information_about_order")
    private long idInformationAboutOrder;
    @Basic(optional = false)
    @Column(name = "right_pizza_topping")
    private boolean rightPizzaTopping;
    @Basic(optional = false)
    @Column(name = "left_pizza_topping")
    private boolean leftPizzaTopping;

    public ConnectionPizzaAndPizzaToppings() {
    }

    public ConnectionPizzaAndPizzaToppings(Long id) {
        this.id = id;
    }

    public ConnectionPizzaAndPizzaToppings(Long id, long idInformationAboutTheItems, long idInformationAboutPizzaToppings, long idInformationAboutOrder, boolean rightPizzaTopping, boolean leftPizzaTopping) {
        this.id = id;
        this.idInformationAboutTheItems = idInformationAboutTheItems;
        this.idInformationAboutPizzaToppings = idInformationAboutPizzaToppings;
        this.idInformationAboutOrder = idInformationAboutOrder;
        this.rightPizzaTopping = rightPizzaTopping;
        this.leftPizzaTopping = leftPizzaTopping;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdInformationAboutTheItems() {
        return idInformationAboutTheItems;
    }

    public void setIdInformationAboutTheItems(long idInformationAboutTheItems) {
        this.idInformationAboutTheItems = idInformationAboutTheItems;
    }

    public long getIdInformationAboutPizzaToppings() {
        return idInformationAboutPizzaToppings;
    }

    public void setIdInformationAboutPizzaToppings(long idInformationAboutPizzaToppings) {
        this.idInformationAboutPizzaToppings = idInformationAboutPizzaToppings;
    }

    public long getIdInformationAboutOrder() {
        return idInformationAboutOrder;
    }

    public void setIdInformationAboutOrder(long idInformationAboutOrder) {
        this.idInformationAboutOrder = idInformationAboutOrder;
    }

    public boolean getRightPizzaTopping() {
        return rightPizzaTopping;
    }

    public void setRightPizzaTopping(boolean rightPizzaTopping) {
        this.rightPizzaTopping = rightPizzaTopping;
    }

    public boolean getLeftPizzaTopping() {
        return leftPizzaTopping;
    }

    public void setLeftPizzaTopping(boolean leftPizzaTopping) {
        this.leftPizzaTopping = leftPizzaTopping;
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
        if (!(object instanceof ConnectionPizzaAndPizzaToppings)) {
            return false;
        }
        ConnectionPizzaAndPizzaToppings other = (ConnectionPizzaAndPizzaToppings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ConnectionPizzaAndPizzaToppings[ id=" + id + " ]";
    }
    
}
