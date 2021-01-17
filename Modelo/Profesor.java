
package Modelo;



public class Profesor extends Persona{
    private int num_empleado;
    

    public Profesor(String nombre,String ap_paterno,String ap_materno) {
        super(nombre,ap_paterno,ap_materno);
        
    }
    
    

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

   
    
    
    
    
}
