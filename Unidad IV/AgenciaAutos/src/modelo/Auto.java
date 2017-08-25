/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Versión 1.0
 *
 * @author Miguel
 */
public class Auto {

    private String idAuto;  //Matricula
    private String modelo;
    private String Categoría;
    private int idMarca;
    private char tipo;      //'A'=Automatico 'S'=Standar
    private String info;
    private int km;
    private String color;
    private double reantaDia;
    private String[] fotos = new String[3];
    private char estatus;           //'D'=Disponible, 'R'=Rentado, 'X'=Fuera de servicio.

    public Auto(String idAuto, String modelo,String categoría, int idMarca, char tipo, String info, int km, String color, double reantaDia) {
        this.idAuto = idAuto;
        this.modelo = modelo;
        this.Categoría= categoría;
        this.idMarca = idMarca;
        this.tipo = tipo;
        this.info = info;
        this.km = km;
        this.color = color;
        this.reantaDia = reantaDia;
    }

    public void setCategoría(String Categoría) {
        this.Categoría = Categoría;
    }

    public String getCategoría() {
        return Categoría;
    }

    public String getColor() {
        return color;
    }

    public void setTipo(char tipo) {
        if (tipo == 'A' || tipo == 'S') {
            this.tipo = tipo;
        }
    }

    public void setKm(int km) {
        if (km > 0) {
            this.km = km;
        }

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIdAuto(String idAuto) {
        this.idAuto = idAuto;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setReantaDia(double reantaDia) {
        this.reantaDia = reantaDia;
    }

    public String getIdAuto() {
        return idAuto;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public String getInfo() {
        return info;
    }

    public int getKm() {
        return km;
    }

    public String getModelo() {
        return modelo;
    }

    public double getReantaDia() {
        return reantaDia;
    }

    public char getTipo() {
        return tipo;
    }

    public void setFoto(int pos, String nuevaFoto) {
        this.fotos[pos] = nuevaFoto;
    }

    public String getFoto(int pos) {
        return fotos[pos];

    }

    public void setEstatus(char estatus) {
        if (estatus == 'D' || estatus == 'R' || estatus == 'X') {
            this.estatus = estatus;
        }
    }

    public char getEstatus() {
        return estatus;
    }
    
}
