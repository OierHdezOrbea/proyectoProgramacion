package ExcepcionesCustom;


public class CentroNoEncontradoException extends Exception
{
    
    private String mensaje;
    
     public CentroNoEncontradoException(int n)
     {
          switch(n){
            case 2: 
                mensaje = "No se puede modificar los datos de un Centro de trabajo que no ha sido dado de alta previamente";
                break;
            case 1:
                mensaje = "No se puede borrar los datos de un Centro de trabajo que no ha sido dado de alta previamente";
                break;
        }
     }
     
     
    
    
    
    public String getMessage(){
        return mensaje;
    }
    
    
}
