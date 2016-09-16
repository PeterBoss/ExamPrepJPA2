/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Peter
 */
@Entity
public class Employee extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    int soSecNr;
    float wage;
    String taxClass;

    public Employee() {
    }

    public Employee(int soSecNr, float wage, String taxClass, String firstName, String lastName, Date birthDate, int age, boolean isMarried) {
        super(firstName, lastName, birthDate, age, isMarried);
        this.soSecNr = soSecNr;
        this.wage = wage;
        this.taxClass = taxClass;
    }
    
    @OneToMany(mappedBy = "supervisor")
    List<Student> supervised;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoSecNr() {
        return soSecNr;
    }

    public void setSoSecNr(int soSecNr) {
        this.soSecNr = soSecNr;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    
}
