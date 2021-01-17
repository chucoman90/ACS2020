
package Modelo;

import java.util.ArrayList;


public class Pregunta {
    private String nombre;
    private ArrayList<String> repuestas;

    public Pregunta() {
        this.nombre=null;
        this.repuestas=new ArrayList<>();
    }
   
    public void agregarRespuesta(String respuesta){
        repuestas.add(respuesta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getRepuestas() {
        return repuestas;
    }

    public void setRepuestas(ArrayList<String> repuestas) {
        this.repuestas = repuestas;
    }
    
    
    
    
}
