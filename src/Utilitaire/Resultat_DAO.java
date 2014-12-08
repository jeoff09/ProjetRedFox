/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Resultat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jeoffrey
 */
public class Resultat_DAO {
    
     public static void CreerResultat(Resultat resultat,Connection connection )
{
    
    Statement stmt = null;
      try
    {  
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into resultats(Res_date,Res_lib,Res_cat,Res_classement,Res_nb_participants,Type_Tournoi_Typ_tn_id,Equipe_Equ_id) Values('"
          + resultat.getRes_date()+ "', "
          + resultat.getRes_lib()+",'"
          + resultat.getRes_cat()+"'," 
          + resultat.getRes_classement()+"',"
          + resultat.getRes_nbr_participant()+"',"
          + resultat.getType_tournoi_id()+"',"
          + resultat.getEquipe_id()+"',");
        
     ResultSet res =  stmt.executeQuery("SELECT MAX(Res_id) FROM resultats");
       if(res.next())
       {
           
//           long id = res.getLong(1);
//           resultat.getEquipe_id(id);
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
}
