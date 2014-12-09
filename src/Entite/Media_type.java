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
public class Media_type {
    
    protected int media_type_id;
    private String lib_type_media ;

    public String getLib_type_media() {
        return lib_type_media;
    }

    public void setLib_type_media(String lib_type_media) {
        this.lib_type_media = lib_type_media;
    }

    public Media_type(String lib_type_media) {
        this.lib_type_media = lib_type_media;
    }

    public int getMedia_type_id() {
        return media_type_id;
    }

    public void setMedia_type_id(int media_type_id) {
        this.media_type_id = media_type_id;
    }
    
    
    
}
