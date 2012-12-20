/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Szakal
 */
@Entity
@Table(name = "drugs_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DrugsList.findAll", query = "SELECT d FROM DrugsList d"),
    @NamedQuery(name = "DrugsList.findById", query = "SELECT d FROM DrugsList d WHERE d.id = :id"),
    @NamedQuery(name = "DrugsList.findBySubstancjaCzynna", query = "SELECT d FROM DrugsList d WHERE d.substancjaCzynna = :substancjaCzynna"),
    @NamedQuery(name = "DrugsList.findByNazwaHandlowa", query = "SELECT d FROM DrugsList d WHERE d.nazwaHandlowa = :nazwaHandlowa"),
    @NamedQuery(name = "DrugsList.findByTyp", query = "SELECT d FROM DrugsList d WHERE d.typ = :typ"),
    @NamedQuery(name = "DrugsList.findBySzczegoly", query = "SELECT d FROM DrugsList d WHERE d.szczegoly = :szczegoly"),
    @NamedQuery(name = "DrugsList.findByZawartosc", query = "SELECT d FROM DrugsList d WHERE d.zawartosc = :zawartosc"),
    @NamedQuery(name = "DrugsList.findByKodEAN", query = "SELECT d FROM DrugsList d WHERE d.kodEAN = :kodEAN")})
public class DrugsList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "substancja_czynna")
    private String substancjaCzynna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nazwa_handlowa")
    private String nazwaHandlowa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "typ")
    private String typ;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "szczegoly")
    private String szczegoly;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "zawartosc")
    private String zawartosc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "kod_EAN")
    private String kodEAN;

    public DrugsList() {
    }

    public DrugsList(Integer id) {
        this.id = id;
    }

    public DrugsList(Integer id, String substancjaCzynna, String nazwaHandlowa, String typ, String szczegoly, String zawartosc, String kodEAN) {
        this.id = id;
        this.substancjaCzynna = substancjaCzynna;
        this.nazwaHandlowa = nazwaHandlowa;
        this.typ = typ;
        this.szczegoly = szczegoly;
        this.zawartosc = zawartosc;
        this.kodEAN = kodEAN;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubstancjaCzynna() {
        return substancjaCzynna;
    }

    public void setSubstancjaCzynna(String substancjaCzynna) {
        this.substancjaCzynna = substancjaCzynna;
    }

    public String getNazwaHandlowa() {
        return nazwaHandlowa;
    }

    public void setNazwaHandlowa(String nazwaHandlowa) {
        this.nazwaHandlowa = nazwaHandlowa;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getSzczegoly() {
        return szczegoly;
    }

    public void setSzczegoly(String szczegoly) {
        this.szczegoly = szczegoly;
    }

    public String getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public String getKodEAN() {
        return kodEAN;
    }

    public void setKodEAN(String kodEAN) {
        this.kodEAN = kodEAN;
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
        if (!(object instanceof DrugsList)) {
            return false;
        }
        DrugsList other = (DrugsList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DrugsList[ id=" + id + " ]";
    }
    
}
