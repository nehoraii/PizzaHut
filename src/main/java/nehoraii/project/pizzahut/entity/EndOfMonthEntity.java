/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nehoraii.project.pizzahut.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
@Table(name = "end_of_month")
@NamedQueries({
    @NamedQuery(name = "EndOfMonth.findAll", query = "SELECT e FROM EndOfMonth e"),
    @NamedQuery(name = "EndOfMonth.findById", query = "SELECT e FROM EndOfMonth e WHERE e.id = :id"),
    @NamedQuery(name = "EndOfMonth.findByDate", query = "SELECT e FROM EndOfMonth e WHERE e.date = :date"),
    @NamedQuery(name = "EndOfMonth.findByGrossAmount", query = "SELECT e FROM EndOfMonth e WHERE e.grossAmount = :grossAmount"),
    @NamedQuery(name = "EndOfMonth.findByNetAmount", query = "SELECT e FROM EndOfMonth e WHERE e.netAmount = :netAmount"),
    @NamedQuery(name = "EndOfMonth.findByCountOfOrders", query = "SELECT e FROM EndOfMonth e WHERE e.countOfOrders = :countOfOrders")})
public class EndOfMonth implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "gross_amount")
    private double grossAmount;
    @Basic(optional = false)
    @Column(name = "net_amount")
    private double netAmount;
    @Basic(optional = false)
    @Column(name = "count_of_orders")
    private int countOfOrders;

    public EndOfMonth() {
    }

    public EndOfMonth(Long id) {
        this.id = id;
    }

    public EndOfMonth(Long id, Date date, double grossAmount, double netAmount, int countOfOrders) {
        this.id = id;
        this.date = date;
        this.grossAmount = grossAmount;
        this.netAmount = netAmount;
        this.countOfOrders = countOfOrders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public int getCountOfOrders() {
        return countOfOrders;
    }

    public void setCountOfOrders(int countOfOrders) {
        this.countOfOrders = countOfOrders;
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
        if (!(object instanceof EndOfMonth)) {
            return false;
        }
        EndOfMonth other = (EndOfMonth) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.EndOfMonth[ id=" + id + " ]";
    }
    
}
