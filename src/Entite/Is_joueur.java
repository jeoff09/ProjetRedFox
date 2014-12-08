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
public class Is_joueur {
    
    private User user_id;
    private Equipe equ_id;

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Equipe getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(Equipe equ_id) {
        this.equ_id = equ_id;
    }

    public Is_joueur(User user_id, Equipe equ_id) {
        this.user_id = user_id;
        this.equ_id = equ_id;
    }
    
    
    
}
