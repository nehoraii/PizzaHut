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
@Table(name = "orders")
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM OrdersEntity o"),
    @NamedQuery(name = "Orders.findById", query = "SELECT o FROM OrdersEntity o WHERE o.id = :id"),
    @NamedQuery(name = "Orders.findByIdCustomersTable", query = "SELECT o FROM OrdersEntity o WHERE o.idCustomersTable = :idCustomersTable"),
    @NamedQuery(name = "Orders.findByTypePay", query = "SELECT o FROM OrdersEntity o WHERE o.typePay = :typePay"),
    @NamedQuery(name = "Orders.findByOrderAmoust", query = "SELECT o FROM OrdersEntity o WHERE o.orderAmoust = :orderAmoust"),
    @NamedQuery(name = "Orders.findByDate", query = "SELECT o FROM OrdersEntity o WHERE o.date = :date"),
    @NamedQuery(name = "Orders.findByDesiredHour", query = "SELECT o FROM OrdersEntity o WHERE o.desiredHour = :desiredHour"),
    @NamedQuery(name = "Orders.findByActualHour", query = "SELECT o FROM OrdersEntity o WHERE o.actualHour = :actualHour"),
    @NamedQuery(name = "Orders.findByNameEmployee", query = "SELECT o FROM OrdersEntity o WHERE o.nameEmployee = :nameEmployee"),
    @NamedQuery(name = "Orders.findBySatisfaction", query = "SELECT o FROM OrdersEntity o WHERE o.satisfaction = :satisfaction"),
    @NamedQuery(name = "Orders.findByRemarks", query = "SELECT o FROM OrdersEntity o WHERE o.remarks = :remarks")})
public class OrdersEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "id_customers_table")
    private long idCustomersTable;
    @Basic(optional = false)
    @Column(name = "type_pay")
    private String typePay;
    @Basic(optional = false)
    @Column(name = "order_amoust")
    private double orderAmoust;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "desired_hour")
    @Temporal(TemporalType.TIME)
    private Date desiredHour;
    @Basic(optional = false)
    @Column(name = "actual_hour")
    @Temporal(TemporalType.TIME)
    private Date actualHour;
    @Basic(optional = false)
    @Column(name = "name_employee")
    private String nameEmployee;
    @Basic(optional = false)
    @Column(name = "satisfaction")
    private int satisfaction;
    @Basic(optional = false)
    @Column(name = "remarks")
    private String remarks;

    public OrdersEntity() {
    }

    public OrdersEntity(Long id) {
        this.id = id;
    }

    public OrdersEntity(Long id, long idCustomersTable, String typePay, double orderAmoust, Date date, Date desiredHour, Date actualHour, String nameEmployee, int satisfaction, String remarks) {
        this.id = id;
        this.idCustomersTable = idCustomersTable;
        this.typePay = typePay;
        this.orderAmoust = orderAmoust;
        this.date = date;
        this.desiredHour = desiredHour;
        this.actualHour = actualHour;
        this.nameEmployee = nameEmployee;
        this.satisfaction = satisfaction;
        this.remarks = remarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdCustomersTable() {
        return idCustomersTable;
    }

    public void setIdCustomersTable(long idCustomersTable) {
        this.idCustomersTable = idCustomersTable;
    }

    public String getTypePay() {
        return typePay;
    }

    public void setTypePay(String typePay) {
        this.typePay = typePay;
    }

    public double getOrderAmoust() {
        return orderAmoust;
    }

    public void setOrderAmoust(double orderAmoust) {
        this.orderAmoust = orderAmoust;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDesiredHour() {
        return desiredHour;
    }

    public void setDesiredHour(Date desiredHour) {
        this.desiredHour = desiredHour;
    }

    public Date getActualHour() {
        return actualHour;
    }

    public void setActualHour(Date actualHour) {
        this.actualHour = actualHour;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        if (!(object instanceof OrdersEntity)) {
            return false;
        }
        OrdersEntity other = (OrdersEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Orders[ id=" + id + " ]";
    }
    
}
