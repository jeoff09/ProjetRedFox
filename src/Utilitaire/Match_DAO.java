/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.Equipe;
import Entite.Match;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jeoffrey
 */
public class Match_DAO {
    
    public static void CreerMatch(Match match,Connection connection ) throws Exception
{
   
     
   Statement stmt = null;
    

    
    try
    {
        
    stmt = connection.createStatement();
        
        
  stmt.executeUpdate("Insert Into matchs(Match_lib_team1,Match_res_team1,Match_res_team2,Match_lib_team2,Match_typ,Match_info_tn,Equipe_Equ_id) Values('"
          + match.getMatch_lib_equ1() + "', '"
          + match.getMatch_res_equ1() +"',"
          + match.getMatch_res_equ2()+"," 
          + match.getMatch_lib_equ2()+","
          + match.getMatch_type()+","
          + match.getMatch_info_tn()+","
          + match.getEquipe_id().getEqu_id()+")");
        
     ResultSet res =  stmt.executeQuery("SELECT MAX(Match_id) FROM matchs");
       if(res.next())
       {
           
           int id = res.getInt(1);
           match.setMatch_id(id);
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
    
    public static void ModifMatch(Match match,Connection connection ) throws Exception
{
   
    
     Statement stmt = null;
    try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("UPDATE matchs "
      + "SET Match_lib_team1 ='"+ match.getMatch_lib_equ1()
      + "', Match_res_team1 ='" + match.getMatch_res_equ1()
      +"', Match_res_team2 =" + match.getMatch_res_equ2()
      +"', Match_lib_team2 =" + match.getMatch_lib_equ2()
      +"', Match_typ      =" + match.getMatch_type()
      +"', Match_info_tn =" + match.getMatch_info_tn()
      +"', Equipe_Equ_id =" + match.getEquipe_id().getEqu_id()
      +" where Match_id = " + match.getMatch_id());
     
             

      
      
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

    public static void DeleteMatch(Match match,Connection connection )throws Exception
{
    
     Statement stmt = null;
     try
    {
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE matchs "+
      "Where Match_id = " + match.getMatch_id());
      
     
      
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

    public static ArrayList<Match> ListerMatch(Connection connection)
{
    
    Statement stmt = null; 
    
    ArrayList<Match> listMatch = new ArrayList();
    try
    {
    stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("Select Match_id,Match_lib_team1,Match_res_team1,Match_res_team2,Match_lib_team2,match_date,Match_typ,Match_info_tn,Equipe_Equ_id FROM matchs;");
        
    while(rs.next())
            {
                int id = rs.getInt("Match_id");
                String libEqu1Match = rs.getString("Match_lib_team1");
                String resEqu1 = rs.getString("Match_res_team1");
                String resEqu2 = rs.getString("Match_res_team2");
                String libEqu2Match = rs.getString("Match_lib_team2");
                java.sql.Timestamp date_match = rs.getTimestamp("match_date");
                String matchType = rs.getString("Match_typ");
                String matchInfo = rs.getString("Match_info_tn");
                   int EquipId = rs.getInt("Equipe_Equ_id");
                
                   Equipe equipe = Equipe_DAO.TrouverEquipe(connection, EquipId);
                   
                // rentrer DATE
                Match match = new Match(libEqu1Match,libEqu2Match,date_match,resEqu1,resEqu2,matchType,matchInfo,equipe);
                
                listMatch.add(match);
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
return listMatch;
}
}
