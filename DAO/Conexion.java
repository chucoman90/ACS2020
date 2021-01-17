
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static Connection con=null;
    private static String driver="org.postgresql.Driver";
    private static String pwd="123";
    private static String usuario="postgres";
    private static String url="jdbc:postgresql://localhost/postgres";
    
    public static Connection getConnection(){

        try {  
             if(con==null){
                Runtime.getRuntime().addShutdownHook(new MiShDown());
                Class.forName(driver);
                con=DriverManager.getConnection(url,usuario,pwd);
             }
            } catch (ClassNotFoundException | SQLException ex) {
           
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        
    
    }
    return con;
}
    
static class MiShDown extends Thread{

    public void run(){

  
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
 
}
