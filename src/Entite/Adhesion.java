/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;


import java.math.BigInteger;
import java.security.Timestamp;

/**
 *
 * @author jeoffrey
 */
public class Adhesion {
    
    protected int adh_id;
    private Timestamp adh_dat_sign ; 
    private Timestamp adh_dat_fin ; 
    private int adh_prix;
    private int adh_don;
    private String adh_type_paiement;
    private User user ;

    public int getAdh_id() {
        return adh_id;
    }

    public void setAdh_id(int adh_id) {
        this.adh_id = adh_id;
    }

    
    public Timestamp getAdh_dat_sign() {
        return adh_dat_sign;
    }

    public void setAdh_dat_sign(Timestamp adh_dat_sign) {
        this.adh_dat_sign = adh_dat_sign;
    }

    public Timestamp getAdh_dat_fin() {
        return adh_dat_fin;
    }

    public void setAdh_dat_fin(Timestamp adh_dat_fin) {
        this.adh_dat_fin = adh_dat_fin;
    }

    public int getAdh_prix() {
        return adh_prix;
    }

    public void setAdh_prix(int adh_prix) {
        this.adh_prix = adh_prix;
    }

    public int getAdh_don() {
        return adh_don;
    }

    public void setAdh_don(int adh_don) {
        this.adh_don = adh_don;
    }

    public String getAdh_type_paiement() {
        return adh_type_paiement;
    }

    public void setAdh_type_paiement(String adh_type_paiement) {
        this.adh_type_paiement = adh_type_paiement;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Adhesion(Timestamp adh_dat_sign, int adh_prix, String adh_type_paiement, User user) {
        this.adh_dat_sign = adh_dat_sign;
        this.adh_prix = adh_prix;
        this.adh_type_paiement = adh_type_paiement;
        this.user = user;
    }
    
    
    
    
    
}
