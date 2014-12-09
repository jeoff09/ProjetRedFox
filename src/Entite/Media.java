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
public class Media {

    protected int media_id;
    private String med_lib ;
    private String med_vol;
    private Media_type media_Type_id ;

    public int getMedia_id() {
        return media_id;
    }

    public void setMedia_id(int media_id) {
        this.media_id = media_id;
    }

    public String getMed_lib() {
        return med_lib;
    }

    public void setMed_lib(String med_lib) {
        this.med_lib = med_lib;
    }

    public String getMed_vol() {
        return med_vol;
    }

    public void setMed_vol(String med_vol) {
        this.med_vol = med_vol;
    }

    public Media_type getMedia_Type_id() {
        return media_Type_id;
    }

    public void setMedia_Type_id(Media_type media_Type_id) {
        this.media_Type_id = media_Type_id;
    }

    public Media(String med_lib) {
        this.med_lib = med_lib;
    }
    
}
