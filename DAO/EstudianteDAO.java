
package DAO;

import Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class EstudianteDAO {
    private Connection conexion;
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;
    
    public EstudianteDAO() {
        conexion=null;
        pstm=null;
        rs=null;
        sql=null;
    }
    
    
     public void insertEstudiante(Estudiante estudiante) {
        
        
        try {
            
            //establezco la conexion de la base de datos con el metodo static de la clase Conexion
            //Conexion implementa patron singleton,es decir, una sola conexion 
            //y se cierra automaticamente cuando se cierra la aplicacion java
            //conexion=Conexion.getConexion();
            conexion=Conexion.getConnection();
            //desactivo autoCommit
            conexion.setAutoCommit(false);
            
            //declaro la consulta sql que se enviara por medio del PreparedStatement
            sql="INSERT INTO alumnos(matricula,nombre,paterno,materno) ";
            sql+=" VALUES(?,?,?,?);";
            
            //preparo la consulta por medio de PreparedStatement 
            pstm=conexion.prepareStatement(sql);
            
            //seteamos(actualizamos) los valores de la sentencia  sql parametrizada(?,?,?...etc)
            //pasandole en orden los parametros de un EstudianteDTO de acuerdo a la tabla que vamos insertar
            pstm.setString(1, estudiante.getMatricula());
            pstm.setString(2, estudiante.getNombre());
            pstm.setString(3, estudiante.getAp_paterno());
            pstm.setString(4, estudiante.getAp_materno());
            
            
            //executeUpdate() devuelve el número de filas afectadas
            int resultado=pstm.executeUpdate();
            if (resultado>0) {
                //// todo OK entonces commiteo la operacion
                conexion.commit();
                JOptionPane.showMessageDialog(null,"Alumno insertado correctamente");
            } else {
                throw new RuntimeException("No se pudo insertar alumno ");
            }
            
            
        
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            try {
                //rollback por las dudas
                if(conexion!=null) conexion.rollback();
                if(pstm!=null) pstm.close();
                
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
             
            
        }
    
    }
}
