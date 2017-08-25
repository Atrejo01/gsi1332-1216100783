/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Agente {

    private int idAgente;
    private String nombre;
    private String rfc;
    private double comisiones;

    public Agente(int idAgente, String nombre, String rfc) {
        this.idAgente = idAgente;
        this.nombre = nombre;
        this.rfc = rfc;
    }

    public double getComisiones() {
        return comisiones;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
