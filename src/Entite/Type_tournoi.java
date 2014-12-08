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
public class Type_tournoi {
    
    protected BigInteger type_tournoi_id;
    private String typ_tn_lib;

    public BigInteger getType_tournoi_id() {
        return type_tournoi_id;
    }

    public void setType_tournoi_id(BigInteger type_tournoi_id) {
        this.type_tournoi_id = type_tournoi_id;
    }

    
    
    public String getTyp_tn_lib() {
        return typ_tn_lib;
    }

    public void setTyp_tn_lib(String typ_tn_lib) {
        this.typ_tn_lib = typ_tn_lib;
    }

    public Type_tournoi(String typ_tn_lib) {
        this.typ_tn_lib = typ_tn_lib;
    }
    
    
    
}
