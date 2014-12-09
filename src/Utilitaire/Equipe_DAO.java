/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Adresse;
import Entite.Equipe;
import Entite.Jeu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
      public static ArrayList<Equipe> ListerEquipe(Connection connection)
{
    
    Statement stmt = null; 
    
    ArrayList<Equipe> listEquipe = new ArrayList();
    try
    {
    stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("Select equ_id,Equ_lib,Equ_desc,Jeux_Jeux_id,Medias_Med_id1 FROM equipe ;");
        
    while(rs.next())
            {
                int          id = rs.getInt("equ_id");
                String  equ_lib = rs.getString("Equ_lib");
                String equ_Desc = rs.getString("Equ_desc");
                int  equ_jeu_id = rs.getInt("Jeux_Jeux_id");
                int  equ_med_id = rs.getInt("Medias_Med_id1");
                
                Jeu jeu = Jeu_DAO.TrouverJeu(connection, equ_jeu_id);
                Equipe equipe = new Equipe (equ_lib,jeu);
               
                listEquipe.add(equipe);
                
              
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
return listEquipe;
}
     
      public static Equipe TrouverEquipe(Connection connection,int Identifiant )
{
    Equipe equipe = null;
    Statement stat = null;
    
    try
    { 
        stat = connection.createStatement();
        ResultSet res = stat.executeQuery("Select equ_id,Equ_lib,Equ_desc,Jeux_Jeux_id,Medias_Med_id1 From equipe Where equ_id ='" + Identifiant + "';");
        if (res.next())
        {
            long id = res.getInt("Id");
            
            String EquLib = res.getString("Equ_lib");
            String EquDesc = res.getString("Equ_desc");
            int jeuId = res.getInt("Jeux_Jeux_id");            
            int idMedia = res.getInt("Medias_Med_id1");
            int idjeux = res.getInt("equ_id");
            
            Jeu jeu = Jeu_DAO.TrouverJeu(connection, jeuId);
            
            equipe = new Equipe(EquLib,jeu);
            
            
        }
        
        
    }catch(Exception ex){ex.printStackTrace();}
    finally
    {
        if(stat != null)
        {
            try{
                
                stat.close();
               
            }catch(SQLException ex){}
        }
    }
 return equipe;
}

}

    

