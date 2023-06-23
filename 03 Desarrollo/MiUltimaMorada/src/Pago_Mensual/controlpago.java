/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pago_Mensual;

import Commons.BDconexion;

/**
 *
 * @author JAVIE
 */
public class controlpago {
 
    public void agregarNuevoPago(String fol, String cont, String fech, String mon, String rest) {
        //Generamos el SQL para insertar un nuevo departamento
        String SQL = "insert into pago(num_folio, num_contrato, fecha, monto, restante) values ('" + fol + "','" + cont + "','" + fech + "','" + mon + "','" + rest + "')";

        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
