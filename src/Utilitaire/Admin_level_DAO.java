/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Admin_level;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jeoffrey
 */
public class Admin_level_DAO {
    
     public static void CreerAdmin_level(int admin_code,Connection connection )
{
    
    Statement stmt = null;
      try
    {  
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into admin_level(Adm_cod) Values('"
          + admin_code +"');");
  
        
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
     
      public static void DeleteAdmin_level(Admin_level admin,Connection connection )
{
      Statement stmt = null;
     try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE admin_level " + "Where adm_lev_id = " + admin.getAdmin_level_id() + ";");
      
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
