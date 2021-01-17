
package DAO;

import Modelo.Actividad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlumnoActividadDAO {
    private Connection conexion;
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;
    
    public AlumnoActividadDAO(){
        this.conexion=null;
        this.pstm=null;
        this.rs=null;
        this.sql=null;
    
    }
    
     public ArrayList<Actividad> buscarListaActividadXAlumno(String matricula){
        ArrayList<Actividad> lista=new ArrayList<>();
        Actividad actividad;
        
            try {
            
            //establezco la conexion de la base de datos con el metodo static de la clase Conexion
            //Conexion implementa patron singleton,es decir, una sola conexion 
            //y se cierra automaticamente cuando se cierra la aplicacion java
            //conexion=Conexion.getConexion();
            conexion=Conexion.getConnection();
            //desactivo autoCommit
            conexion.setAutoCommit(false);
            
            //declaro la consulta sql que se enviara por medio del PreparedStatement
            sql="SELECT nombre,descripcion,fechaentrega,calificacion "; 
            sql+="FROM alumno_actividades ";
            sql+="NATURAL JOIN actividades ";
            sql+="WHERE matricula=? ";
            sql+="ORDER BY idactividad;";

            //preparo la consulta por medio de PreparedStatement 
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1,matricula);
            //devuelve las tuplas de la consulta sql en uno bjeto ResultSet 
            rs=pstm.executeQuery();
            
            while(rs.next()){
                actividad=new Actividad(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                lista.add(actividad);
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            try {
                
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();
                
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
             
            
        }
        
        
        
     return lista;
    }
    
    
}
