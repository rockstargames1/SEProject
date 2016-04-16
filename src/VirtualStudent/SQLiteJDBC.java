package VirtualStudent;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kishl_000
 */
public class SQLiteJDBC {
     public static void main( String args[] )
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:student.db");
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
     /*String sql = "DROP TABLE ATTENDANCE";
     stmt.executeUpdate(sql);
     System.out.println("Dropped successfully"); 
     sql = "DROP TABLE TIMETABLE";
     stmt.executeUpdate(sql);
     System.out.println("Dropped successfully");*/
     
      String sql = "select * from timetable;";
      
      ResultSet rs = stmt.executeQuery(sql);
      rs.next();
      do{
      System.out.println(rs.getString(1)+" "+rs.getString(2));    
      }
      while(rs.next());
      
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
  }
}
