/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioOfertaMockLocal.java
 * Universidad Piloto de Colombia (Bogotá - Colombia)
 * Escuela TIC
 *
 * Ejercicio: Muebles de los Alpes
 * Autor: Paula Sabogal
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import java.util.List;
import javax.ejb.Local;

/**
 * Contrato funcional de los servicios para la oferta de muebles
 *
 * @author Paula Sabogal
 */
@Local
public interface IServicioOfertaMockLocal {

    /**
     * Devuelve todos las ofertas del sistema
     *
     * @return ofertas Lista de ofertas
     */
    public List<Oferta> darOfertas();

    /**
     * Agrega una oferta al sistema
     *
     * @param oferta Nueva oferta
     */
    public void agregarOferta(Oferta oferta);

    /**
     * Elima la oferta que hay disponible
     *
     * @param id Identificador único de la oferta
     */
    public void elimarOferta(long id);

}
