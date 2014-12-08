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
public class Match {
    
    protected BigInteger match_id;
    private String match_lib_equ1;
    private String match_lib_equ2;
    private Date   match_date;
    private String match_res_equ1;
    private String match_res_equ2;
    private String match_type;
    private String match_info_tn;
    private Equipe equipe_id;

    public String getMatch_lib_equ1() {
        return match_lib_equ1;
    }

    public void setMatch_lib_equ1(String match_lib_equ1) {
        this.match_lib_equ1 = match_lib_equ1;
    }

    public String getMatch_lib_equ2() {
        return match_lib_equ2;
    }

    public void setMatch_lib_equ2(String match_lib_equ2) {
        this.match_lib_equ2 = match_lib_equ2;
    }

    public Date getMatch_date() {
        return match_date;
    }

    public void setMatch_date(Date match_date) {
        this.match_date = match_date;
    }

    public String getMatch_res_equ1() {
        return match_res_equ1;
    }

    public void setMatch_res_equ1(String match_res_equ1) {
        this.match_res_equ1 = match_res_equ1;
    }

    public String getMatch_res_equ2() {
        return match_res_equ2;
    }

    public void setMatch_res_equ2(String match_res_equ2) {
        this.match_res_equ2 = match_res_equ2;
    }

    public String getMatch_type() {
        return match_type;
    }

    public void setMatch_type(String match_type) {
        this.match_type = match_type;
    }

    public String getMatch_info_tn() {
        return match_info_tn;
    }

    public void setMatch_info_tn(String match_info_tn) {
        this.match_info_tn = match_info_tn;
    }

    public Equipe getEquipe_id() {
        return equipe_id;
    }

    public void setEquipe_id(Equipe equipe_id) {
        this.equipe_id = equipe_id;
    }

    public Match(String match_lib_equ1, String match_lib_equ2, Date match_date, String match_res_equ1, String match_res_equ2, String match_type, String match_info_tn, Equipe equipe_id) {
        this.match_lib_equ1 = match_lib_equ1;
        this.match_lib_equ2 = match_lib_equ2;
        this.match_date = match_date;
        this.match_res_equ1 = match_res_equ1;
        this.match_res_equ2 = match_res_equ2;
        this.match_type = match_type;
        this.match_info_tn = match_info_tn;
        this.equipe_id = equipe_id;
    }
    
    
    
    
    
    
    
}
