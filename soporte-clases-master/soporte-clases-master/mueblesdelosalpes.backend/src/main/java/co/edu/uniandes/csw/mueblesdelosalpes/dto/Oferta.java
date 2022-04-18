/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author PAULASABOGAL
 */
public class Oferta {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Id de la oferta.
     */
    private long idOferta;

    /**
     * Valor de la oferta.
     */
    private double oferta;

    /**
     * Referencia del mueble.
     */
    private long referenciaMueble;

    /**
     * Tipo de usuario
     */
    private String loginUsuarioOfertante;

    public Oferta() {
    }

    public Oferta(long idOferta, String loginUsuarioOfertante, long referenciaMueble, double oferta ) {
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
        
    }
    
    
    
    
    public long getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(long idOferta) {
        this.idOferta = idOferta;
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }

    public long getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(long referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    public void setLoginUsuarioOfertante(String loginUsuarioOfertante) {
        this.loginUsuarioOfertante = loginUsuarioOfertante;
    }
    
    
    
}
