
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class GenericoBD {
    
    private Connection con;
    
    public Connection abrirConexion()throws Exception{       
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/"+"bdPersonas";
            String usuario = "root";
            String password = "usbw";
            con = DriverManager.getConnection(url,usuario,password);
            return con;
    }
    
    public void cerrarConexion() throws Exception{
            con.close();
    }
        
    
}
