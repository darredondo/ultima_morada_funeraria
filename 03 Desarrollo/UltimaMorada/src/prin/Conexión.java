package prin;
import Commons.BDconexion;
import java.sql.Connection;
import java.sql.ResultSet;

public class Conexión {
    //Obetern la lista de tomas de agua activas
    public ResultSet obtenerTabla() {
        String SQL = "SELECT * FROM usuario";
        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            ResultSet resultado = conexion.ejecutarConsulta(SQL);
            return resultado;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    

}