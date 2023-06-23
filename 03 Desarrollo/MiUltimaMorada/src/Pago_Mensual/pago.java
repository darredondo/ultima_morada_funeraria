/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pago_Mensual;

/**
 *
 * @author JAVIE
 */
public class pago {
   
   int id_pago;
   String num_folio;
   String num_contrato;
   String fecha;
   String monto;
   String restante;
            
    

    @Override
    public String toString() {
        return "pago{" + "id_pago=" + id_pago+ ", num_folio=" + num_folio + ", num_contrato=" + num_contrato + "fecha=" +fecha+ "monto=" +monto+ "restante=" +restante+'}';
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public String getNum_folio() {
        return num_folio;
    }

    public void setNum_folio(String num_folio) {
        this.num_folio = num_folio;
    }

    public String getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(String num_contrato) {
        this.num_contrato = num_contrato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getRestante() {
        return restante;
    }

    public void setRestante(String restante) {
        this.restante = restante;
    }
            
}
