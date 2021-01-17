
package Facade;

import DAO.AlumnoActividadDAO;
import DAO.ExamenDAO;
import DAO.MateriaAlumnoDAO;
import DAO.MateriaAsignadaDAO;
import Modelo.Actividad;
import Modelo.Estudiante;
import Modelo.Examen;
import Modelo.Materia;
import java.util.ArrayList;


public class Fachada {
     
    public void guardarExamen(Examen examen){
        ExamenDAO e=new ExamenDAO();
        e.insertExamen(examen);
    
    }
     
     public ArrayList<Materia> buscarListaMateriaXProfesor(int idprofesor){
         MateriaAsignadaDAO ma= new MateriaAsignadaDAO();
         return ma.buscarListaMateriaXProfesor(idprofesor);
     } 
     
     public ArrayList<Estudiante> buscarListaAlumnoXMateria(int idmateria){
         MateriaAlumnoDAO ma=new MateriaAlumnoDAO();
         
         return ma.buscarListaAlumnoXMateria(idmateria);
     
     }
     
     public ArrayList<Actividad> buscarListaActividadXAlumno(String matricula){
          AlumnoActividadDAO ac=new AlumnoActividadDAO();
          return ac.buscarListaActividadXAlumno(matricula);
     
     }
}
