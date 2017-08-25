/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 * Version 1.0
 *
 * @author Miguel
 */
public class rentaAuto {

    private int idAuto;           //Matricula
    private String idCliente;     //Rfc
    private Date fechaRenta;
    private Date fechaEntrega;
    private int idPoliza;
    private char estatus;           //'V'=Vigente, 'R'=Retraso
    private double monto;
    private int idAgente;

    public rentaAuto(int idAuto, String idCliente, Date fechaRenta, Date fechaEntrega, int idAgente) {
        this.idAuto = idAuto;
        this.idCliente = idCliente;
        this.fechaRenta = fechaRenta;
        this.fechaEntrega = fechaEntrega;
        this.idAgente = idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public char getEstatus() {
        return estatus;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public Date getFechaRenta() {
        return fechaRenta;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public double getMonto() {
        return monto;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setFechaRenta(Date fechaRenta) {
        this.fechaRenta = fechaRenta;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
