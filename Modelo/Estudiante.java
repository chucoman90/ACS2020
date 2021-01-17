
package Modelo;

import java.util.ArrayList;


public class Estudiante extends Persona{
    private String matricula;
    private ArrayList<Actividad> listaActividades;
   

    public Estudiante(String matricula,String nombre, String paterno, String materno) {
        super(nombre,paterno,materno);
        this.matricula = matricula;
        listaActividades=new ArrayList<>();
        
    }
    
    public void agregarActividad(Actividad a){
    
        listaActividades.add(a);
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Matricula: "+getMatricula()+" Nombre: "+getNombre()+" Paterno: "+getAp_paterno()+" Materno: "+getAp_materno();
    }
   
    
    
   
    
}
