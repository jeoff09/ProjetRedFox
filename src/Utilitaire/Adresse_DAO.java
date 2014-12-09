/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Adresse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jeoffrey
 */
public class Adresse_DAO {
    
    
    // Toujours un problème avec les BigInteger
    public static void CreerAdresse(Adresse adresse,Connection connection )
{
    
    Statement stmt = null;
      try
    {  
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into adresse(Adr_num,Adr_rue,Adr_CP,Adr_ville) Values('"
          + adresse.getAdr_num()+ "', "
          + adresse.getAdr_rue()+",'"
          + adresse.getAdr_CP()+"'," 
          + adresse.getAdr_ville()+")");
        
     ResultSet res =  stmt.executeQuery("SELECT MAX(id) FROM adresse");
       if(res.next())
       {
           
           int id = res.getInt(1);
           adresse.setAdr_id(id);
       }
        
     
        
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
    
    public static void ModifAdresse(Adresse adresse,Connection connection )
{
     Statement stmt = null;
    try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("UPDATE adresse "
      + "SET Adr_num ='"+adresse.getAdr_num()
      + "', Adr_rue =" + adresse.getAdr_rue()
      +", Adr_CP ='" + adresse.getAdr_CP()
      +"',Adr_ville = "+ adresse.getAdr_ville()
      +" where Adr_id = " + adresse.getAdr_id());
     
             

      
      
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
    
    public static void DeleteAdresse(Adresse adresse,Connection connection )
{
      Statement stmt = null;
     try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE adresse " + "Where Adr_id = " + adresse.getAdr_id());
      
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
