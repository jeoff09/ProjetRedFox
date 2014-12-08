/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;


import Entite.Jeu;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jeoffrey
 */
public class Jeu_DAO {
    
    
     public static void CreerJeu(Jeu jeu,Connection connection )
{
    
    Statement stmt = null;
      try
    {  
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into jeux(jeux_lib,jeux_desc,jeux_img) Values('"
          + jeu.getJeu_lib() +
          ","+ jeu.getJeu_desc() +
          ","+jeu.getJeu_img() +
          "');");
  
        
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
     
      public static void DeleteJeu(BigInteger id,Connection connection )
{
      Statement stmt = null;
     try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE admin_level " + "Where Jeux_id = " + id + ";");
      
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
     
    
     public static void Modifjeu(Jeu jeu,Connection connection )
{
     Statement stmt = null;
    try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("UPDATE jeux"+ 
      "SET Jeux_lib ='"+jeu.getJeu_lib()
      + "', Jeux_desc =" + jeu.getJeu_desc()
      +", Jeux_img ='" + jeu.getJeu_img()
      +" where Jeux_id = " + jeu.getJeu_id());
     
             

      
      
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
    
     
     // Problème de relation avec le result set avec BigInteger
     public static ArrayList<Jeu> ListerJeu(Connection connection)
{
    
    Statement stmt = null; 
    
    ArrayList<Jeu> listJeu = new ArrayList();
    try
    {
    stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("Select Jeux_id,Jeux_lib,Jeux_desc,Jeux_img FROM jeux;");
        
    while(rs.next())
            {
//                BigInteger id = rs.getInt("Jeux_id");
                String jeu_lib = rs.getString("Jeux_lib");
                String jeu_Desc = rs.getString("Jeux_desc");
                String jeu_img = rs.getString("Jeux_img");
                
                
                Jeu jeu = new Jeu(jeu_lib);
                jeu.jeu_desc = jeu_Desc;
                jeu.jeu_img = jeu_img;
                
                
                
                listJeu.add(jeu);
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
return listJeu;
}
     
}
