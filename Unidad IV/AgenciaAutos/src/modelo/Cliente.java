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
public class Cliente {
    private String idCliente;   //RFC del cliente
    private String nombre;
    private String domicilio;
    private String telefono;
    private String numLiencia;
    private String email;

    public Cliente(String idCliente, String nombre, String domicilio, String telefono, String numLiencia, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.numLiencia = numLiencia;
        this.email = email;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumLiencia(String numLiencia) {
        this.numLiencia = numLiencia;
    }



    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getEmail() {
        return email;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumLiencia() {
        return numLiencia;
    }

    public String getTelefono() {
        return telefono;
    }

   
    }
