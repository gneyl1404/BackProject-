
package Servicio;

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
 *         &lt;element name="ActualizarPedidoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "actualizarPedidoResult"
})
@XmlRootElement(name = "ActualizarPedidoResponse")
public class ActualizarPedidoResponse {

    @XmlElement(name = "ActualizarPedidoResult")
    protected String actualizarPedidoResult;

    /**
     * Obtiene el valor de la propiedad actualizarPedidoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualizarPedidoResult() {
        return actualizarPedidoResult;
    }

    /**
     * Define el valor de la propiedad actualizarPedidoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualizarPedidoResult(String value) {
        this.actualizarPedidoResult = value;
    }

}
