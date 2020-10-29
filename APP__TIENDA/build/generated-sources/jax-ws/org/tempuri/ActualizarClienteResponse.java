
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualizarClienteResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "actualizarClienteResult"
})
@XmlRootElement(name = "ActualizarClienteResponse")
public class ActualizarClienteResponse {

    @XmlElement(name = "ActualizarClienteResult")
    protected String actualizarClienteResult;

    /**
     * Obtiene el valor de la propiedad actualizarClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualizarClienteResult() {
        return actualizarClienteResult;
    }

    /**
     * Define el valor de la propiedad actualizarClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualizarClienteResult(String value) {
        this.actualizarClienteResult = value;
    }

}
