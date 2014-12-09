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
public class Jeu {
    
    protected int jeu_id;
    public String jeu_lib;
    public String jeu_desc;
    public String jeu_img;

    public int getJeu_id() {
        return jeu_id;
    }

    public void setJeu_id(int jeu_id) {
        this.jeu_id = jeu_id;
    }

    
    
    
    public String getJeu_lib() {
        return jeu_lib;
    }

    public void setJeu_lib(String jeu_lib) {
        this.jeu_lib = jeu_lib;
    }

    public String getJeu_desc() {
        return jeu_desc;
    }

    public void setJeu_desc(String jeu_desc) {
        this.jeu_desc = jeu_desc;
    }

    public String getJeu_img() {
        return jeu_img;
    }

    public void setJeux_img(String jeu_img) {
        this.jeu_img = jeu_img;
    }

    public Jeu(String jeu_lib) {
        this.jeu_lib = jeu_lib;
    }

    
}
