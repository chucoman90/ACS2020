
package Modelo;


public class Actividad {
    private String nombre;
    private String descripcion;
    private String fecha_entrega;
    private String calificacion;

    public Actividad(String nombre, String descripcion, String fecha_entrega, String calificacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_entrega = fecha_entrega;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Descripcion: "+getDescripcion()+" Fecha: "+getFecha_entrega()+" Calificacion: "+getCalificacion();
    }
    
    
    
    
}
