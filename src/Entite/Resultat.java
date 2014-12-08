/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author jeoffrey
 */
public class Resultat {
    
    
    protected BigInteger res_id;
    private Date res_date;
    private String res_lib;
    private String res_cat;
    private String res_classement;
    private String res_nbr_participant;
    private Type_tournoi type_tournoi_id;
    private Equipe equipe_id;

    public BigInteger getRes_id() {
        return res_id;
    }

    public void setRes_id(BigInteger res_id) {
        this.res_id = res_id;
    }

    
    public Date getRes_date() {
        return res_date;
    }

    public void setRes_date(Date res_date) {
        this.res_date = res_date;
    }

    public String getRes_lib() {
        return res_lib;
    }

    public void setRes_lib(String res_lib) {
        this.res_lib = res_lib;
    }

    public String getRes_cat() {
        return res_cat;
    }

    public void setRes_cat(String res_cat) {
        this.res_cat = res_cat;
    }

    public String getRes_classement() {
        return res_classement;
    }

    public void setRes_classement(String res_classement) {
        this.res_classement = res_classement;
    }

    public String getRes_nbr_participant() {
        return res_nbr_participant;
    }

    public void setRes_nbr_participant(String res_nbr_participant) {
        this.res_nbr_participant = res_nbr_participant;
    }

    public Type_tournoi getType_tournoi_id() {
        return type_tournoi_id;
    }

    public void setType_tournoi_id(Type_tournoi type_tournoi_id) {
        this.type_tournoi_id = type_tournoi_id;
    }

    public Equipe getEquipe_id() {
        return equipe_id;
    }

    public void setEquipe_id(Equipe equipe_id) {
        this.equipe_id = equipe_id;
    }

    public Resultat(Date res_date, String res_lib, String res_cat, String res_classement, Type_tournoi type_tournoi_id, Equipe equipe_id) {
        this.res_date = res_date;
        this.res_lib = res_lib;
        this.res_cat = res_cat;
        this.res_classement = res_classement;
        this.type_tournoi_id = type_tournoi_id;
        this.equipe_id = equipe_id;
    }
    
    
    
    
    
}
