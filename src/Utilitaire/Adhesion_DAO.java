/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Adhesion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jeoffrey
 */
public class Adhesion_DAO {
    
    
    
    // Problème Biginteger
    public static void CreerAdhesion(Adhesion adhesion,Connection connection )
{
    
    Statement stmt = null;
      try
    {  
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into adhesions(Adh_dat_sign,Adh_dat_fin,Adh_prix,Adh_don,Users_Users_id,Adh_type_paiement) Values('"
          + adhesion.getAdh_dat_sign()+ "', "
          + adhesion.getAdh_dat_fin()+",'"
          + adhesion.getAdh_prix()+"'," 
          + adhesion.getAdh_don()+" ',"
          + adhesion.getUser()+" )"
          + adhesion.getAdh_type_paiement()+" )");
     ResultSet res =  stmt.executeQuery("SELECT MAX(Adh_id) FROM adhesions");
       if(res.next())
       {
           
//           long id = res.getLong(1);
//           adhesion.setAdh_id(id);
       }
        
                
        

        System.out.println("Insertion réusssite " );
        
    } catch(Exception ex){ex.printStackTrace();}
    
    finally
    {
        if (stmt != null)
        {
            try 
            {
                stmt.close();
            }catch( SQLException ex){
            
            }
        }
    
    }
}
    
    
    public static void DeleteAdhésion(Adhesion adhesion,Connection connection )
{
      Statement stmt = null;
     try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE adhesions " + "Where Adh_id = " + adhesion.getAdh_id());
      
      } catch(Exception ex){ex.printStackTrace();}
    
    finally
    {
        if (stmt != null)
        {
            try 
            {
                stmt.close();
            }catch( SQLException ex){
            
            }
        }
    }
    }
    





}
    
    
    
    
    
    
    

