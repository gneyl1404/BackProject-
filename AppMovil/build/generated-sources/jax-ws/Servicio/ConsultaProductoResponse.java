
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
 *         &lt;element name="ConsultaProductoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "consultaProductoResult"
})
@XmlRootElement(name = "ConsultaProductoResponse")
public class ConsultaProductoResponse {

    @XmlElement(name = "ConsultaProductoResult")
    protected String consultaProductoResult;

    /**
     * Obtiene el valor de la propiedad consultaProductoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultaProductoResult() {
        return consultaProductoResult;
    }

    /**
     * Define el valor de la propiedad consultaProductoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultaProductoResult(String value) {
        this.consultaProductoResult = value;
    }

}
