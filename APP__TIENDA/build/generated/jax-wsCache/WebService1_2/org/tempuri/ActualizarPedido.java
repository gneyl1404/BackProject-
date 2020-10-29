
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="strNumeroPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strNumeroPedido",
    "strEstado"
})
@XmlRootElement(name = "ActualizarPedido")
public class ActualizarPedido {

    protected String strNumeroPedido;
    protected String strEstado;

    /**
     * Obtiene el valor de la propiedad strNumeroPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNumeroPedido() {
        return strNumeroPedido;
    }

    /**
     * Define el valor de la propiedad strNumeroPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNumeroPedido(String value) {
        this.strNumeroPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad strEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrEstado() {
        return strEstado;
    }

    /**
     * Define el valor de la propiedad strEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrEstado(String value) {
        this.strEstado = value;
    }

}
