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
@Table(name = "Information_about_the_dough")
@NamedQueries({
    @NamedQuery(name = "Informationaboutthedough.findAll", query = "SELECT i FROM InformationAboutTheDoughEntity i"),
    @NamedQuery(name = "Informationaboutthedough.findById", query = "SELECT i FROM InformationAboutTheDoughEntity i WHERE i.id = :id"),
    @NamedQuery(name = "Informationaboutthedough.findByCountDough", query = "SELECT i FROM InformationAboutTheDoughEntity i WHERE i.countDough = :countDough"),
    @NamedQuery(name = "Informationaboutthedough.findByCodeOfDough", query = "SELECT i FROM InformationAboutTheDoughEntity i WHERE i.codeOfDough = :codeOfDough"),
    @NamedQuery(name = "Informationaboutthedough.findByTimeForSwelledUp", query = "SELECT i FROM InformationAboutTheDoughEntity i WHERE i.timeForSwelledUp = :timeForSwelledUp"),
    @NamedQuery(name = "Informationaboutthedough.findByCountPan", query = "SELECT i FROM InformationAboutTheDoughEntity i WHERE i.countPan = :countPan"),
    @NamedQuery(name = "Informationaboutthedough.findByCountCoverPan", query = "SELECT i FROM InformationAboutTheDoughEntity i WHERE i.countCoverPan = :countCoverPan"),
    @NamedQuery(name = "Informationaboutthedough.findByIdInformationAboutItems", query = "SELECT i FROM InformationAboutTheDoughEntity i WHERE i.idInformationAboutItems = :idInformationAboutItems")})
public class InformationAboutTheDoughEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "count_dough")
    private int countDough;
    @Basic(optional = false)
    @Column(name = "code_of_dough")
    private String codeOfDough;
    @Basic(optional = false)
    @Column(name = "time_for_swelled_up")
    @Temporal(TemporalType.TIME)
    private Date timeForSwelledUp;
    @Basic(optional = false)
    @Column(name = "count_pan")
    private int countPan;
    @Basic(optional = false)
    @Column(name = "count_cover_pan")
    private int countCoverPan;
    @Basic(optional = false)
    @Column(name = "id_information_about_items")
    private long idInformationAboutItems;

    public InformationAboutTheDoughEntity() {
    }

    public InformationAboutTheDoughEntity(Long id) {
        this.id = id;
    }

    public InformationAboutTheDoughEntity(Long id, int countDough, String codeOfDough, Date timeForSwelledUp, int countPan, int countCoverPan, long idInformationAboutItems) {
        this.id = id;
        this.countDough = countDough;
        this.codeOfDough = codeOfDough;
        this.timeForSwelledUp = timeForSwelledUp;
        this.countPan = countPan;
        this.countCoverPan = countCoverPan;
        this.idInformationAboutItems = idInformationAboutItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCountDough() {
        return countDough;
    }

    public void setCountDough(int countDough) {
        this.countDough = countDough;
    }

    public String getCodeOfDough() {
        return codeOfDough;
    }

    public void setCodeOfDough(String codeOfDough) {
        this.codeOfDough = codeOfDough;
    }

    public Date getTimeForSwelledUp() {
        return timeForSwelledUp;
    }

    public void setTimeForSwelledUp(Date timeForSwelledUp) {
        this.timeForSwelledUp = timeForSwelledUp;
    }

    public int getCountPan() {
        return countPan;
    }

    public void setCountPan(int countPan) {
        this.countPan = countPan;
    }

    public int getCountCoverPan() {
        return countCoverPan;
    }

    public void setCountCoverPan(int countCoverPan) {
        this.countCoverPan = countCoverPan;
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
        if (!(object instanceof InformationAboutTheDoughEntity)) {
            return false;
        }
        InformationAboutTheDoughEntity other = (InformationAboutTheDoughEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Informationaboutthedough[ id=" + id + " ]";
    }
    
}
