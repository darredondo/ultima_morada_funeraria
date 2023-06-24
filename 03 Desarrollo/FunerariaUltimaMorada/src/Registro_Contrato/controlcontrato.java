/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Contrato;

import Commons.BDconexion;

/**
 *
 * @author JAVIE
 */
public class controlcontrato {
    
     public void agregarNuevoContrato(String nom, String curp, String dire, String tel, String plan, String fech) {
        //Generamos el SQL para insertar un nuevo departamento
        String SQL = "insert into contrato(nombre, curp, direccion, telefono, plan, fecha_pago) values ('" + nom + "','" + curp + "','" + dire + "','" + tel + "','" + plan + "','" +fech+ "')";

        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
}
