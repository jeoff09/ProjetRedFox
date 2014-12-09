/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Media;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jeoffrey
 */
public class Media_DAO {
    
    
    
     public static void CreerMedia(Media media,Connection connection ) throws Exception
{
     
   Statement stmt = null;
    
    
    
    try
    {
        
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into medias(Med_lib,Med_vol,Type_Typ_med_id) Values('"
          + media.getMed_lib() + "', '"
          + media.getMed_vol()+"',"
          + media.getMedia_Type_id().getMedia_type_id()+")");
        
     ResultSet res =  stmt.executeQuery("SELECT MAX(Id) FROM Personne");
       if(res.next())
       {
           
           int id = res.getInt(1);
           media.setMedia_id(id);
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
    
     public static void ModifMedia(Media media,Connection connection ) throws Exception
{
    
     Statement stmt = null;
    try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("UPDATE medias "
      + "SET Med_lib ='"+media.getMed_lib()
      + "', Med_vol ='" + media.getMed_vol()
      +"',Type_Typ_med_id =" + media.getMedia_Type_id().getMedia_type_id()
      +" where Med_id = " + media.getMedia_id());
     
             

      
      
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
    
     public static void DeleteMedia(Media media ,Connection connection )throws Exception
{
    
     Statement stmt = null;
     try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE medias "+
              "Where Med_id = " + media.getMedia_id());
      
     
      
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
