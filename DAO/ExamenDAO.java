
package DAO;

import Modelo.Examen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ExamenDAO {
    private Connection conexion;
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;
    
    public ExamenDAO() {
        conexion=null;
        pstm=null;
        rs=null;
        sql=null;
    }
    
    
     public void insertExamen(Examen examen) {
        
        
        try {
            
            /*establezco la conexion de la base de datos con el metodo static de la clase Conexion
            Conexion implementa patron singleton,es decir, una sola conexion 
            y se cierra automaticamente cuando se cierra la aplicacion java*/
            
            conexion=Conexion.getConnection();
            //desactivo autoCommit
            conexion.setAutoCommit(false);
            
            //declaro la consulta sql que se enviara por medio del PreparedStatement
            sql="INSERT INTO examenes(fecha,nombre,idmateria) ";
            sql+=" VALUES(?,?,?);";
            
            //preparo la consulta por medio de PreparedStatement 
            pstm=conexion.prepareStatement(sql);
            
            //seteamos(actualizamos) los valores de la sentencia  sql parametrizada(?,?,?...etc)
            //pasandole en orden los parametros de un EstudianteDTO de acuerdo a la tabla que vamos insertar
            pstm.setString(1, examen.getFecha());
            pstm.setString(2, examen.getNombre());
            pstm.setInt(3,4);//agrego el id de materia(2° parametro) para simular
            
            
            //el metodo executeUpdate() devuelve el número de filas afectadas
            int resultado=pstm.executeUpdate();
            if (resultado>0) {
                // todo OK entonces commiteo la operacion
                //conexion.commit();
                sql="SELECT currval('examenes_idexamen_seq');";
                //preparo la consulta por medio de PreparedStatement 
                pstm=conexion.prepareStatement(sql);
                //devuelve las tuplas de la consulta sql en uno bjeto ResultSet 
                rs=pstm.executeQuery();
                int aux1=0;
                while(rs.next()){
                    aux1=rs.getInt(1);
                }
                System.out.println("Ultimo id de examenes"+aux1);
                
                for (int i = 0; i < examen.getPreguntas().size(); i++){
                    //declaro la consulta sql que se enviara por medio del PreparedStatement
                    sql="INSERT INTO preguntas(nombre,idexamen) ";
                    sql+=" VALUES(?,?);";
                    //preparo la consulta por medio de PreparedStatement 
                    pstm=conexion.prepareStatement(sql);
                    pstm.setString(1,examen.getPreguntas().get(i).getNombre());
                    pstm.setInt(2,aux1);
                    resultado=pstm.executeUpdate();
                    if(resultado>0){
                         sql="SELECT currval('preguntas_idpregunta_seq');";
                         pstm=conexion.prepareStatement(sql);
                         rs=pstm.executeQuery();
                         int aux2=0;
                         while(rs.next()){
                            aux2=rs.getInt(1);
                        }
                          System.out.println("Ultimo id de preguntas"+aux2);  
                          sql="INSERT INTO respuestas(nombre,idpregunta) ";
                          sql+=" VALUES(?,?);";
                          pstm=conexion.prepareStatement(sql);
                          for (int j = 0; j < examen.getPreguntas().get(i).getRepuestas().size(); j++) {
                                pstm.setString(1,examen.getPreguntas().get(i).getRepuestas().get(j));
                                pstm.setInt(2,aux2);
                                resultado=pstm.executeUpdate();
                                
                          }
                    }
                }
                conexion.commit();
                JOptionPane.showMessageDialog(null,"Examen insertado correctamente");
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
