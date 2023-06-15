/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generacion_de_reportes;

import Commons.BDconexion;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class ControlReportes3 {
            
        public ResultSet obtenerCorte() {
        String SQL="SELECT * FROM pago";
        BDconexion conexion=new BDconexion();
        conexion.conectar();
        ResultSet resultado=conexion.ejecutarConsulta(SQL);
        return resultado;
    }
    

         ResultSet obtenerCorte(String text) {
        String SQL = "SELECT * FROM pago where idPago LIKE '%?1%' order by idPago";
        SQL = SQL.replace("?1", text);
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
