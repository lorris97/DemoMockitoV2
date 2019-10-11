/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class BDD {

    public BDD() {
    }


    public  java.sql.Connection Connection() throws SQLException{
        java.sql.Connection conn = null;
         try {
            Class.forName ("com.mysql.jdbc.Driver");
            
             conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost/santepublic?user=root&password=");            
            
        } catch (ClassNotFoundException e) {
            
             System.out.println(e);
        }
         return conn;
         
    }
    public void Deconnection(java.sql.Connection conn)
    {
    try {
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
}