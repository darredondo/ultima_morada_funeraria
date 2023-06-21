/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

import Commons.BDconexion;

/**
 *
 * @author tilij
 */
public class ControlUsurio {
    
    public void agregarNuevoUsuario(String usu, String cont, String Tip, String Nom, String Corr) {
        //Generamos el SQL para insertar un nuevo departamento
        String SQL = "insert into usuario(Usuario, Contrasenna, Tipo, Nombre, Correo) values ('" + usu + "','" + cont + "','" + Tip + "','" + Nom + "','" + Corr + "')";

        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    void modificarUsuario(String usu, String cont, String Tip, String Nom, String Corr, String id) {
        //Generamos el SQL para insertar un nuevo departamento
        //String SQL = "UPDATE into usuario(Usuario, Contrasenna, Tipo, Nombre, Correo) values ('" + usu + "','" + cont + "','" + Tip + "','" + Nom + "','" + Corr + "')";
String SQL="UPDATE usuario SET Usuario = '"+usu+"', Contrasenna='"+cont+"', Tipo='"+Tip+"', Nombre='"+Nom+"', Correo='"+Corr+"' WHERE usuario.idUsuario = "+id;
        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public void EliminarUsuario(String id) {
        //Generamos el SQL para insertar un nuevo departamento
      
        String SQL="DELETE FROM usuario WHERE usuario.idUsuario = "+id;
        try {
            BDconexion conexion = new BDconexion();
            conexion.conectar();
            conexion.ejecutarActualizacion(SQL);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
}
