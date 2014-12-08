/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.math.BigInteger;

/**
 *
 * @author jeoffrey
 */
public class Equipe {
    
    protected BigInteger equ_id;
    private String  equ_lib;
    private String equ_desc;
    private Jeu      jeu_id;
    private Media  media_id;

    public BigInteger getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(BigInteger equ_id) {
        this.equ_id = equ_id;
    }

    
    
    public String getEqu_lib() {
        return equ_lib;
    }

    public void setEqu_lib(String equ_lib) {
        this.equ_lib = equ_lib;
    }

    public String getEqu_desc() {
        return equ_desc;
    }

    public void setEqu_desc(String equ_desc) {
        this.equ_desc = equ_desc;
    }

    public Jeu getJeu_id() {
        return jeu_id;
    }

    public void setJeu_id(Jeu jeu_id) {
        this.jeu_id = jeu_id;
    }

    public Media getMedia_id() {
        return media_id;
    }

    public void setMedia_id(Media media_id) {
        this.media_id = media_id;
    }

    public Equipe(String equ_lib, Jeu jeu_id) {
        this.equ_lib = equ_lib;
        this.jeu_id = jeu_id;
    }
    
    
    
    
    
}
