/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class Cuenta {
    
    private int idcuenta;
    private String clave;
    private String direccion;
    private String referencia;
    private String no_contador;
    private String identificacion;
    private String voltios;
    private String marchamo;
    private String poste;
    private int lecAcumulada;
    private String lector;
    private Date fechaLectura;
    private String tipo;
    private String email;

    public Cuenta(int idcuenta, String clave, String direccion, String referencia, String no_contador, String identificacion, String voltios, String marchamo, 
                    String poste, int lecAcumulada, String lector, Date fechaLectura, String tipo, String email) {
        
        this.idcuenta = idcuenta;
        this.clave = clave;
        this.direccion = direccion;
        this.referencia = referencia;
        this.no_contador = no_contador;
        this.identificacion = identificacion;
        this.voltios = voltios;
        this.marchamo = marchamo;
        this.poste = poste;
        this.lecAcumulada = lecAcumulada;
        this.lector = lector;
        this.fechaLectura = fechaLectura;
        this.tipo = tipo;
        this.email = email;
    }

    public Cuenta() {
    }
    

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNo_contador() {
        return no_contador;
    }

    public void setNo_contador(String no_contador) {
        this.no_contador = no_contador;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getVoltios() {
        return voltios;
    }

    public void setVoltios(String voltios) {
        this.voltios = voltios;
    }

    public String getMarchamo() {
        return marchamo;
    }

    public void setMarchamo(String marchamo) {
        this.marchamo = marchamo;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getLecAcumulada() {
        return lecAcumulada;
    }

    public void setLecAcumulada(int lecAcumulada) {
        this.lecAcumulada = lecAcumulada;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public Date getFechaLectura() {
        return fechaLectura;
    }

    public void setFechaLectura(Date fechaLectura) {
        this.fechaLectura = fechaLectura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
