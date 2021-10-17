package model;

import java.math.BigDecimal;
import java.util.Date;

//POJO Plain Old Java Object. It is an ordinary Java object
public class Compte {
    private String code;
    private double solde;
    private Date dateCreation;

    public Compte() {
    }

    public Compte(String code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
