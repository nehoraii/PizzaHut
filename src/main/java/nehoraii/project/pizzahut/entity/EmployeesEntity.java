/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nehoraii.project.pizzahut.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.
import jakarta.persistence.Basic;
import jakarta.persistence.Column;;
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
@Table(name = "employees")
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findById", query = "SELECT e FROM Employees e WHERE e.id = :id"),
    @NamedQuery(name = "Employees.findByIdOfEmployee", query = "SELECT e FROM Employees e WHERE e.idOfEmployee = :idOfEmployee"),
    @NamedQuery(name = "Employees.findByName", query = "SELECT e FROM Employees e WHERE e.name = :name"),
    @NamedQuery(name = "Employees.findBySecName", query = "SELECT e FROM Employees e WHERE e.secName = :secName"),
    @NamedQuery(name = "Employees.findByPhone", query = "SELECT e FROM Employees e WHERE e.phone = :phone"),
    @NamedQuery(name = "Employees.findByPayForHours", query = "SELECT e FROM Employees e WHERE e.payForHours = :payForHours"),
    @NamedQuery(name = "Employees.findByBankAccountNumber", query = "SELECT e FROM Employees e WHERE e.bankAccountNumber = :bankAccountNumber"),
    @NamedQuery(name = "Employees.findByDateOfBirth", query = "SELECT e FROM Employees e WHERE e.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "Employees.findByCodeEmployee", query = "SELECT e FROM Employees e WHERE e.codeEmployee = :codeEmployee")})
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "id_of_employee")
    private String idOfEmployee;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "sec_name")
    private String secName;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "pay_for_hours")
    private double payForHours;
    @Basic(optional = false)
    @Column(name = "bank_account_number")
    private String bankAccountNumber;
    @Basic(optional = false)
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Basic(optional = false)
    @Column(name = "code_employee")
    private String codeEmployee;

    public Employees() {
    }

    public Employees(Long id) {
        this.id = id;
    }

    public Employees(Long id, String idOfEmployee, String name, String secName, String phone, double payForHours, String bankAccountNumber, Date dateOfBirth, String codeEmployee) {
        this.id = id;
        this.idOfEmployee = idOfEmployee;
        this.name = name;
        this.secName = secName;
        this.phone = phone;
        this.payForHours = payForHours;
        this.bankAccountNumber = bankAccountNumber;
        this.dateOfBirth = dateOfBirth;
        this.codeEmployee = codeEmployee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdOfEmployee() {
        return idOfEmployee;
    }

    public void setIdOfEmployee(String idOfEmployee) {
        this.idOfEmployee = idOfEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPayForHours() {
        return payForHours;
    }

    public void setPayForHours(double payForHours) {
        this.payForHours = payForHours;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(String codeEmployee) {
        this.codeEmployee = codeEmployee;
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
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Employees[ id=" + id + " ]";
    }
    
}
