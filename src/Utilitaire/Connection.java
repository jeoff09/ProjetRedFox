/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import Entite.User;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kitsune
 */
//public class Connection {
//     // TODO code application logic here
//
//            String driver = "com.mysql.jdbc.Driver";
//            String url = "jdbc:mysql://localhost/TP_DAO";
//            String utilisateur = "root";
//            String password = "";
//
//            try
//    private Object UserDAO;
//{
//                // Chargement des drivers mySQL(introspection)
//                Class.forName(driver);
//            } catch (ClassNotFoundException ex) {
//                ex.printStackTrace();
//            }
//
//            java.sql.Connection connection = null;
//            try {
//                connection = DriverManager.getConnection( url, utilisateur , password);
//
////                Adresse adr1 = new Adresse(2, "rue des ceriseiers ", 53000 , "Laval");
////                Adresse adr2 = new Adresse(3, "rue des ceriseiers ", 53000 , "Laval");
////                Personne pierre = new Personne("Dupont", "Pierre", adr1);
////                pierre.setPers_age(30);

//                UserDAO.creerPersonne(connection, pierre);
//                UserDAO.creerPersonne(connection, kevin);
//                UserDAO.creerPersonne(connection, jb);
//                
//                List<User> listePersonne = UserDAO.lister(connection);
//                for(User p: listePersonne){
//                    System.out.println(p);
//                }
//            } catch (Exception ex) {
//
//            } finally {
//                if (connection != null) {
//                    try {
//                        connection.close();
//                    } catch (SQLException ex) {
//
//                    }
//                }
//
//            }
//}


public class Connection {
    private static  Connection instance = null;
    Connection connection = null;
    String url = "jdbc:mysql://localhost/unilan_redfox_db";
    String driver = "com.mysql.jdbc.Driver";
    String utilisateur = "root";
    String password = "";
    
    private Connection(){
        try{
            Class.forName("driver");
            System.out.println("Chargement du driver réussi !");
            
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
        }
        return instance;
    }
    
    public Connection getConnection(){
        if(connection == null){
            try{
                connection = (Connection) DriverManager.getConnection( url, utilisateur , password);
                System.out.println("Connexion réussie ! ");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return connection;
    }
    
    public void close(){
        if (connection != null) {
            connection.close();
                }
        connection = null;
    }
}