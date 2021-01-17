
package Modelo;

import java.util.ArrayList;

public class Examen {
    private int numero;
    private String fecha;
    private String nombre;
    private ArrayList<Pregunta> preguntas;

    public Examen() {
        this.numero=0;
        this.fecha=null;
        this.nombre=null;
        this.preguntas=new ArrayList<>();
    }

    
    
    public void agregarPregunta(Pregunta p){
        preguntas.add(p);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    
}
