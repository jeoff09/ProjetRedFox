/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;



/**
 *
 * @author jeoffrey
 */
public class Admin_level {
    
    protected int admin_level_id;
    private int adm_cod ;

    public Admin_level(int adm_cod) {
        this.adm_cod = adm_cod;
    }

    public int getAdm_cod() {
        return adm_cod;
    }

    public void setAdm_cod(int adm_cod) {
        this.adm_cod = adm_cod;
    }

    public int getAdmin_level_id() {
        return admin_level_id;
    }

    public void setAdmin_level_id(int admin_level_id) {
        this.admin_level_id = admin_level_id;
    }
    
    
}
