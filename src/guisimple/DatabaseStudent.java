/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guisimple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kishl_000
 */
public class DatabaseStudent {
   protected Statement stmt;
   protected Connection con;
   ResultSet rs;
    public DatabaseStudent()
    {
       try {
           //Initialise the Driver
           Class.forName("org.sqlite.JDBC");
           
           //Get a connection
           con = DriverManager.getConnection("jdbc:sqlite:student.db");
           
           //Create a statement
           stmt = con.createStatement();
           
           //Print Success Message
           System.out.println("Connection Successful");
       } catch (Exception ex) {
           System.err.println(ex);
       } 
    }
    
    public void closeConnections() 
    {
       try {
           stmt.close();
           con.close();
       } catch (SQLException ex) {
           System.err.println(ex);
       }
        
    }
}
