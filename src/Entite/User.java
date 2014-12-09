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
public class User {
    
    protected int user_id;
    private String user_pseudo;
    private String user_email;
    private String user_password;
    private String user_nom;
    private String user_prenom;
    private Date user_date_nais;
    private String user_tel_port;
    private String user_tel_fix;
    private boolean user_is_adherent;
    private String user_avatar;
    private Admin_level user_admin_level;
    private Media user_media_id;
    private Adresse user_adresse_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
    
    
    public String getUser_pseudo() {
        return user_pseudo;
    }

    public void setUser_pseudo(String user_pseudo) {
        this.user_pseudo = user_pseudo;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_nom() {
        return user_nom;
    }

    public void setUser_nom(String user_nom) {
        this.user_nom = user_nom;
    }

    public String getUser_prenom() {
        return user_prenom;
    }

    public void setUser_prenom(String user_prenom) {
        this.user_prenom = user_prenom;
    }

    public Date getUser_date_nais() {
        return user_date_nais;
    }

    public void setUser_date_nais(Date user_date_nais) {
        this.user_date_nais = user_date_nais;
    }

    public String getUser_tel_port() {
        return user_tel_port;
    }

    public void setUser_tel_port(String user_tel_port) {
        this.user_tel_port = user_tel_port;
    }

    public String getUser_tel_fix() {
        return user_tel_fix;
    }

    public void setUser_tel_fix(String user_tel_fix) {
        this.user_tel_fix = user_tel_fix;
    }

    public boolean isUser_is_adherent() {
        return user_is_adherent;
    }

    public void setUser_is_adherent(boolean user_is_adherent) {
        this.user_is_adherent = user_is_adherent;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public Admin_level getUser_admin_level() {
        return user_admin_level;
    }

    public void setUser_admin_level(Admin_level user_admin_level) {
        this.user_admin_level = user_admin_level;
    }

    public Media getUser_media_id() {
        return user_media_id;
    }

    public void setUser_media_id(Media user_media_id) {
        this.user_media_id = user_media_id;
    }

    public Adresse getUser_adresse_id() {
        return user_adresse_id;
    }

    public void setUser_adresse_id(Adresse user_adresse_id) {
        this.user_adresse_id = user_adresse_id;
    }

    public User(String user_pseudo, String user_email, String user_password, Date user_date_nais, Admin_level user_admin_level, Adresse user_adresse_id) {
        this.user_pseudo = user_pseudo;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_date_nais = user_date_nais;
        this.user_admin_level = user_admin_level;
        this.user_adresse_id = user_adresse_id;
    }
    
    
    
}
