/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Adresse;
import Entite.Equipe;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jeoffrey
 */
public class Equipe_DAO {
    
  
    
     public static void CreerEquipe(Equipe equipe ,Connection connection )
{
    
    Statement stmt = null;
      try
    {  
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into equipe(Equ_lib,Equ_desc,Jeux_Jeux_id,Medias_Med_id1) Values('"
          + equipe.getEqu_lib() +","
          + equipe.getEqu_desc()+ ","
          + equipe.getJeu_id().getJeu_id()+"," 
          + equipe.getMedia_id().getMedia_id()+"');");
  
        
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
     public static void ModifEquipe(Equipe equipe,Connection connection )
{
     Statement stmt = null;
    try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("UPDATE equipe "
      + "SET Equ_lib ='"+equipe.getEqu_lib()
      + "', Equ_desc =" + equipe.getEqu_desc()
      +", Jeux_Jeux_id ='" + equipe.getJeu_id().getJeu_id()
      +"',Medias_Med_id1 = "+ equipe.getMedia_id().getMedia_id()
      +" where Equ_id = " + equipe.getEqu_id());
     
             

      
      
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
     
     public static void DeleteEquipe(Equipe equipe,Connection connection )
{
      Statement stmt = null;
     try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE equipe " + "Where Adr_id = " + equipe.getEqu_id());
      
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

    

