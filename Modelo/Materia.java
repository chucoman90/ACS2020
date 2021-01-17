
package Modelo;

import java.util.ArrayList;


public class Materia {
    private String nombre;
    private int id;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Examen> listaExamenes;

    public Materia() {
        this.nombre=null;
        listaEstudiantes=new ArrayList<>();
        listaExamenes=new ArrayList<>();
    }
    
    public void agregarEstudiante(Estudiante e){
        listaEstudiantes.add(e);
    }
    public void agregarExamen(Examen e){
        listaExamenes.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public ArrayList<Examen> getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(ArrayList<Examen> listaExamenes) {
        this.listaExamenes = listaExamenes;
    }

    @Override
    public String toString() {
        return "idmateria: "+getId()+" nombre: "+getNombre();
    }
    
    
}
