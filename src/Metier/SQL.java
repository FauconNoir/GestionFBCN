/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrateur
 */
public class SQL {
    
      private static String      pilote = "org.gjt.mm.mysql.Driver";
      private static String      url = "jdbc:mysql://localhost/gestionfbcn";			        
      private static Connection  conn;
      private static Statement   stmt;
      private static ResultSet   rs;
      
    private static Connection connexion()
    {
        try
	{
            Class.forName(pilote);           			            
            Connection  conn = DriverManager.getConnection(url,"root","");		              
        }			        
	catch (SQLException |   ClassNotFoundException sqle)
	{
            System.out.println(sqle.getMessage());
	}
        return conn;
    }
    
    public static Connection getConnection()
    {
        return connexion();
    }
     
    public static ResultSet select(String requete) throws SQLException
    { 
           stmt = getConnection().createStatement();			            
           rs = stmt.executeQuery(requete);
           return rs;
    }
    
    public static void insert(String requete) throws SQLException
    { 
            stmt = getConnection().createStatement();			            
            stmt.executeUpdate(requete);
            stmt.close();
    }
    
    
    
}
