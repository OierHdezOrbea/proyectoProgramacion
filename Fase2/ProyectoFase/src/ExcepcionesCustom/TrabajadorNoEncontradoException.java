
package ExcepcionesCustom;


public class TrabajadorNoEncontradoException extends Exception
{
    
    private String mensaje;
    
    public TrabajadorNoEncontradoException(int n){
        switch(n){
            case 2: 
                mensaje = "No se pueden modificar los datos de un trabajador que no existe en el sistema";
                break;
            case 1:
                mensaje = "No se pueden borrar los datos de un trabajador que no existe en el sistema";
                break;
        }
    }
    
    public String getMessage(){
        return mensaje;
    }
    
    
}
