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
@Table(name = "hours_table")
@NamedQueries({
    @NamedQuery(name = "HoursTable.findAll", query = "SELECT h FROM HoursTable h"),
    @NamedQuery(name = "HoursTable.findById", query = "SELECT h FROM HoursTable h WHERE h.id = :id"),
    @NamedQuery(name = "HoursTable.findByIdToEmployeesTable", query = "SELECT h FROM HoursTable h WHERE h.idToEmployeesTable = :idToEmployeesTable"),
    @NamedQuery(name = "HoursTable.findByEntranceTime", query = "SELECT h FROM HoursTable h WHERE h.entranceTime = :entranceTime"),
    @NamedQuery(name = "HoursTable.findByLeavingTime", query = "SELECT h FROM HoursTable h WHERE h.leavingTime = :leavingTime"),
    @NamedQuery(name = "HoursTable.findByDate", query = "SELECT h FROM HoursTable h WHERE h.date = :date")})
public class HoursTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Id
    @Basic(optional = false)
    @Column(name = "id_to_employees_table")
    private Long idToEmployeesTable;
    @Basic(optional = false)
    @Column(name = "entrance_time")
    @Temporal(TemporalType.TIME)
    private Date entranceTime;
    @Basic(optional = false)
    @Column(name = "leaving_time")
    @Temporal(TemporalType.TIME)
    private Date leavingTime;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public HoursTable() {
    }

    public HoursTable(Long idToEmployeesTable) {
        this.idToEmployeesTable = idToEmployeesTable;
    }

    public HoursTable(Long idToEmployeesTable, long id, Date entranceTime, Date leavingTime, Date date) {
        this.idToEmployeesTable = idToEmployeesTable;
        this.id = id;
        this.entranceTime = entranceTime;
        this.leavingTime = leavingTime;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getIdToEmployeesTable() {
        return idToEmployeesTable;
    }

    public void setIdToEmployeesTable(Long idToEmployeesTable) {
        this.idToEmployeesTable = idToEmployeesTable;
    }

    public Date getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(Date entranceTime) {
        this.entranceTime = entranceTime;
    }

    public Date getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(Date leavingTime) {
        this.leavingTime = leavingTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idToEmployeesTable != null ? idToEmployeesTable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HoursTable)) {
            return false;
        }
        HoursTable other = (HoursTable) object;
        if ((this.idToEmployeesTable == null && other.idToEmployeesTable != null) || (this.idToEmployeesTable != null && !this.idToEmployeesTable.equals(other.idToEmployeesTable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.HoursTable[ idToEmployeesTable=" + idToEmployeesTable + " ]";
    }
    
}
