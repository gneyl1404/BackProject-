
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
 *         &lt;element name="Codigo_pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "codigoPedido"
})
@XmlRootElement(name = "ConsultaPedidos")
public class ConsultaPedidos {

    @XmlElement(name = "Codigo_pedido")
    protected String codigoPedido;

    /**
     * Obtiene el valor de la propiedad codigoPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPedido() {
        return codigoPedido;
    }

    /**
     * Define el valor de la propiedad codigoPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPedido(String value) {
        this.codigoPedido = value;
    }

}
