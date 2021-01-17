
package DAO;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MateriaAsignadaDAO {
    private Connection conexion;
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;

    public MateriaAsignadaDAO() {
        this.conexion = null;
        this.pstm = null;
        this.rs = null;
        this.sql = null;
    }
    
    public ArrayList<Materia> buscarListaMateriaXProfesor(int idprofesor){
        ArrayList<Materia> lista=new ArrayList<>();
        Materia materia;
        
            try {
            
            //establezco la conexion de la base de datos con el metodo static de la clase Conexion
            //Conexion implementa patron singleton,es decir, una sola conexion 
            //y se cierra automaticamente cuando se cierra la aplicacion java
            //conexion=Conexion.getConexion();
            conexion=Conexion.getConnection();
            //desactivo autoCommit
            conexion.setAutoCommit(false);
            
            //declaro la consulta sql que se enviara por medio del PreparedStatement
            sql="SELECT idmateria,nombre "; 
            sql+="FROM materias_asignadas ";
            sql+="NATURAL JOIN materias ";
            sql+="WHERE idprofesor=?; ";

            //preparo la consulta por medio de PreparedStatement 
            pstm=conexion.prepareStatement(sql);
            pstm.setInt(1,idprofesor);
            //devuelve las tuplas de la consulta sql en uno bjeto ResultSet 
            rs=pstm.executeQuery();
            
            while(rs.next()){
                materia=new Materia();
                materia.setId(rs.getInt(1));
                materia.setNombre(rs.getString(2));
                lista.add(materia);
                
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
