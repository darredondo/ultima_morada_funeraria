/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Contrato;

/**
 *
 * @author JAVIE
 */
public class contrato {
   
   int id_contrato;
   String T_nombre;
   String T_curp;
   String T_dire;
   String T_tel;
   String T_plan;
   String T_fech;
   
   @Override
    public String toString() {
        return "contrato{" + "id_contrato=" + id_contrato+ ", nombre=" + T_nombre + ", curp=" +T_curp+ "direccion=" +T_dire+ "telefono=" +T_tel+ "plan=" +T_plan+ "fecha_pago"+T_fech+'}';
        
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getT_nombre() {
        return T_nombre;
    }

    public void setT_nombre(String T_nombre) {
        this.T_nombre = T_nombre;
    }

    public String getT_curp() {
        return T_curp;
    }

    public void setT_curp(String T_curp) {
        this.T_curp = T_curp;
    }

    public String getT_dire() {
        return T_dire;
    }

    public void setT_dire(String T_dire) {
        this.T_dire = T_dire;
    }

    public String getT_tel() {
        return T_tel;
    }

    public void setT_tel(String T_tel) {
        this.T_tel = T_tel;
    }

    public String getT_plan() {
        return T_plan;
    }

    public void setT_plan(String T_plan) {
        this.T_plan = T_plan;
    }

    public String getT_fech() {
        return T_fech;
    }

    public void setT_fech(String T_fech) {
        this.T_fech = T_fech;
    }
   
    
}
