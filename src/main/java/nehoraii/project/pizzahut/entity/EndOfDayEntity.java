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
@Table(name = "end_of_day")
@NamedQueries({
    @NamedQuery(name = "EndOfDay.findAll", query = "SELECT e FROM EndOfDay e"),
    @NamedQuery(name = "EndOfDay.findById", query = "SELECT e FROM EndOfDay e WHERE e.id = :id"),
    @NamedQuery(name = "EndOfDay.findByDate", query = "SELECT e FROM EndOfDay e WHERE e.date = :date"),
    @NamedQuery(name = "EndOfDay.findByPayInCraditCard", query = "SELECT e FROM EndOfDay e WHERE e.payInCraditCard = :payInCraditCard"),
    @NamedQuery(name = "EndOfDay.findByPayInCash", query = "SELECT e FROM EndOfDay e WHERE e.payInCash = :payInCash"),
    @NamedQuery(name = "EndOfDay.findByPayInOtherWay", query = "SELECT e FROM EndOfDay e WHERE e.payInOtherWay = :payInOtherWay"),
    @NamedQuery(name = "EndOfDay.findByLpan", query = "SELECT e FROM EndOfDay e WHERE e.lpan = :lpan"),
    @NamedQuery(name = "EndOfDay.findByLclassic", query = "SELECT e FROM EndOfDay e WHERE e.lclassic = :lclassic"),
    @NamedQuery(name = "EndOfDay.findBySpan", query = "SELECT e FROM EndOfDay e WHERE e.span = :span"),
    @NamedQuery(name = "EndOfDay.findBySclassic", query = "SELECT e FROM EndOfDay e WHERE e.sclassic = :sclassic"),
    @NamedQuery(name = "EndOfDay.findByXlpan", query = "SELECT e FROM EndOfDay e WHERE e.xlpan = :xlpan"),
    @NamedQuery(name = "EndOfDay.findByXlclassic", query = "SELECT e FROM EndOfDay e WHERE e.xlclassic = :xlclassic"),
    @NamedQuery(name = "EndOfDay.findBySpecialPizza", query = "SELECT e FROM EndOfDay e WHERE e.specialPizza = :specialPizza"),
    @NamedQuery(name = "EndOfDay.findByCountryPanPizza", query = "SELECT e FROM EndOfDay e WHERE e.countryPanPizza = :countryPanPizza"),
    @NamedQuery(name = "EndOfDay.findByCountryClassicPizza", query = "SELECT e FROM EndOfDay e WHERE e.countryClassicPizza = :countryClassicPizza"),
    @NamedQuery(name = "EndOfDay.findByBigSalad", query = "SELECT e FROM EndOfDay e WHERE e.bigSalad = :bigSalad"),
    @NamedQuery(name = "EndOfDay.findByPersonalSalad", query = "SELECT e FROM EndOfDay e WHERE e.personalSalad = :personalSalad"),
    @NamedQuery(name = "EndOfDay.findByWithOutGloten", query = "SELECT e FROM EndOfDay e WHERE e.withOutGloten = :withOutGloten"),
    @NamedQuery(name = "EndOfDay.findByTheHighestPizzaTopping1", query = "SELECT e FROM EndOfDay e WHERE e.theHighestPizzaTopping1 = :theHighestPizzaTopping1"),
    @NamedQuery(name = "EndOfDay.findByTheHighestPizzaTopping2", query = "SELECT e FROM EndOfDay e WHERE e.theHighestPizzaTopping2 = :theHighestPizzaTopping2"),
    @NamedQuery(name = "EndOfDay.findByTheHighestPizzaTopping3", query = "SELECT e FROM EndOfDay e WHERE e.theHighestPizzaTopping3 = :theHighestPizzaTopping3"),
    @NamedQuery(name = "EndOfDay.findByQuiche", query = "SELECT e FROM EndOfDay e WHERE e.quiche = :quiche"),
    @NamedQuery(name = "EndOfDay.findByCornNuggets", query = "SELECT e FROM EndOfDay e WHERE e.cornNuggets = :cornNuggets"),
    @NamedQuery(name = "EndOfDay.findByNionRings", query = "SELECT e FROM EndOfDay e WHERE e.nionRings = :nionRings"),
    @NamedQuery(name = "EndOfDay.findByPasta", query = "SELECT e FROM EndOfDay e WHERE e.pasta = :pasta"),
    @NamedQuery(name = "EndOfDay.findByGrossAmount", query = "SELECT e FROM EndOfDay e WHERE e.grossAmount = :grossAmount"),
    @NamedQuery(name = "EndOfDay.findByNetAmount", query = "SELECT e FROM EndOfDay e WHERE e.netAmount = :netAmount")})
public class EndOfDay implements Serializable {

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
    @Column(name = "pay_in_cradit_card")
    private double payInCraditCard;
    @Basic(optional = false)
    @Column(name = "pay_in_cash")
    private double payInCash;
    @Basic(optional = false)
    @Column(name = "pay_in_other_way")
    private double payInOtherWay;
    @Basic(optional = false)
    @Column(name = "lpan")
    private int lpan;
    @Basic(optional = false)
    @Column(name = "lclassic")
    private int lclassic;
    @Basic(optional = false)
    @Column(name = "span")
    private int span;
    @Basic(optional = false)
    @Column(name = "sclassic")
    private int sclassic;
    @Basic(optional = false)
    @Column(name = "xlpan")
    private int xlpan;
    @Basic(optional = false)
    @Column(name = "xlclassic")
    private int xlclassic;
    @Basic(optional = false)
    @Column(name = "special_pizza")
    private int specialPizza;
    @Basic(optional = false)
    @Column(name = "country_pan_pizza")
    private int countryPanPizza;
    @Basic(optional = false)
    @Column(name = "country_classic_pizza")
    private int countryClassicPizza;
    @Basic(optional = false)
    @Column(name = "big_salad")
    private int bigSalad;
    @Basic(optional = false)
    @Column(name = "personal_salad")
    private int personalSalad;
    @Basic(optional = false)
    @Column(name = "with_out_gloten")
    private int withOutGloten;
    @Basic(optional = false)
    @Column(name = "the_highest_pizza_topping_1")
    private String theHighestPizzaTopping1;
    @Basic(optional = false)
    @Column(name = "the_highest_pizza_topping_2")
    private String theHighestPizzaTopping2;
    @Basic(optional = false)
    @Column(name = "the_highest_pizza_topping_3")
    private String theHighestPizzaTopping3;
    @Basic(optional = false)
    @Column(name = "quiche")
    private int quiche;
    @Basic(optional = false)
    @Column(name = "corn_nuggets")
    private int cornNuggets;
    @Basic(optional = false)
    @Column(name = "nion_rings")
    private int nionRings;
    @Basic(optional = false)
    @Column(name = "pasta")
    private int pasta;
    @Basic(optional = false)
    @Column(name = "gross_amount")
    private double grossAmount;
    @Basic(optional = false)
    @Column(name = "net_amount")
    private double netAmount;

    public EndOfDay() {
    }

    public EndOfDay(Long id) {
        this.id = id;
    }

    public EndOfDay(Long id, Date date, double payInCraditCard, double payInCash, double payInOtherWay, int lpan, int lclassic, int span, int sclassic, int xlpan, int xlclassic, int specialPizza, int countryPanPizza, int countryClassicPizza, int bigSalad, int personalSalad, int withOutGloten, String theHighestPizzaTopping1, String theHighestPizzaTopping2, String theHighestPizzaTopping3, int quiche, int cornNuggets, int nionRings, int pasta, double grossAmount, double netAmount) {
        this.id = id;
        this.date = date;
        this.payInCraditCard = payInCraditCard;
        this.payInCash = payInCash;
        this.payInOtherWay = payInOtherWay;
        this.lpan = lpan;
        this.lclassic = lclassic;
        this.span = span;
        this.sclassic = sclassic;
        this.xlpan = xlpan;
        this.xlclassic = xlclassic;
        this.specialPizza = specialPizza;
        this.countryPanPizza = countryPanPizza;
        this.countryClassicPizza = countryClassicPizza;
        this.bigSalad = bigSalad;
        this.personalSalad = personalSalad;
        this.withOutGloten = withOutGloten;
        this.theHighestPizzaTopping1 = theHighestPizzaTopping1;
        this.theHighestPizzaTopping2 = theHighestPizzaTopping2;
        this.theHighestPizzaTopping3 = theHighestPizzaTopping3;
        this.quiche = quiche;
        this.cornNuggets = cornNuggets;
        this.nionRings = nionRings;
        this.pasta = pasta;
        this.grossAmount = grossAmount;
        this.netAmount = netAmount;
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

    public double getPayInCraditCard() {
        return payInCraditCard;
    }

    public void setPayInCraditCard(double payInCraditCard) {
        this.payInCraditCard = payInCraditCard;
    }

    public double getPayInCash() {
        return payInCash;
    }

    public void setPayInCash(double payInCash) {
        this.payInCash = payInCash;
    }

    public double getPayInOtherWay() {
        return payInOtherWay;
    }

    public void setPayInOtherWay(double payInOtherWay) {
        this.payInOtherWay = payInOtherWay;
    }

    public int getLpan() {
        return lpan;
    }

    public void setLpan(int lpan) {
        this.lpan = lpan;
    }

    public int getLclassic() {
        return lclassic;
    }

    public void setLclassic(int lclassic) {
        this.lclassic = lclassic;
    }

    public int getSpan() {
        return span;
    }

    public void setSpan(int span) {
        this.span = span;
    }

    public int getSclassic() {
        return sclassic;
    }

    public void setSclassic(int sclassic) {
        this.sclassic = sclassic;
    }

    public int getXlpan() {
        return xlpan;
    }

    public void setXlpan(int xlpan) {
        this.xlpan = xlpan;
    }

    public int getXlclassic() {
        return xlclassic;
    }

    public void setXlclassic(int xlclassic) {
        this.xlclassic = xlclassic;
    }

    public int getSpecialPizza() {
        return specialPizza;
    }

    public void setSpecialPizza(int specialPizza) {
        this.specialPizza = specialPizza;
    }

    public int getCountryPanPizza() {
        return countryPanPizza;
    }

    public void setCountryPanPizza(int countryPanPizza) {
        this.countryPanPizza = countryPanPizza;
    }

    public int getCountryClassicPizza() {
        return countryClassicPizza;
    }

    public void setCountryClassicPizza(int countryClassicPizza) {
        this.countryClassicPizza = countryClassicPizza;
    }

    public int getBigSalad() {
        return bigSalad;
    }

    public void setBigSalad(int bigSalad) {
        this.bigSalad = bigSalad;
    }

    public int getPersonalSalad() {
        return personalSalad;
    }

    public void setPersonalSalad(int personalSalad) {
        this.personalSalad = personalSalad;
    }

    public int getWithOutGloten() {
        return withOutGloten;
    }

    public void setWithOutGloten(int withOutGloten) {
        this.withOutGloten = withOutGloten;
    }

    public String getTheHighestPizzaTopping1() {
        return theHighestPizzaTopping1;
    }

    public void setTheHighestPizzaTopping1(String theHighestPizzaTopping1) {
        this.theHighestPizzaTopping1 = theHighestPizzaTopping1;
    }

    public String getTheHighestPizzaTopping2() {
        return theHighestPizzaTopping2;
    }

    public void setTheHighestPizzaTopping2(String theHighestPizzaTopping2) {
        this.theHighestPizzaTopping2 = theHighestPizzaTopping2;
    }

    public String getTheHighestPizzaTopping3() {
        return theHighestPizzaTopping3;
    }

    public void setTheHighestPizzaTopping3(String theHighestPizzaTopping3) {
        this.theHighestPizzaTopping3 = theHighestPizzaTopping3;
    }

    public int getQuiche() {
        return quiche;
    }

    public void setQuiche(int quiche) {
        this.quiche = quiche;
    }

    public int getCornNuggets() {
        return cornNuggets;
    }

    public void setCornNuggets(int cornNuggets) {
        this.cornNuggets = cornNuggets;
    }

    public int getNionRings() {
        return nionRings;
    }

    public void setNionRings(int nionRings) {
        this.nionRings = nionRings;
    }

    public int getPasta() {
        return pasta;
    }

    public void setPasta(int pasta) {
        this.pasta = pasta;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EndOfDay)) {
            return false;
        }
        EndOfDay other = (EndOfDay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.EndOfDay[ id=" + id + " ]";
    }
    
}
