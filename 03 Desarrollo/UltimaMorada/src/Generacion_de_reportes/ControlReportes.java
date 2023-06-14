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
class ControlReportes {

    public ResultSet obtenerContratos() {
        String SQL="SELECT * FROM contrato";
        BDconexion conexion=new BDconexion();
        conexion.conectar();
        ResultSet resultado=conexion.ejecutarConsulta(SQL);
        return resultado;
    }
    
}
