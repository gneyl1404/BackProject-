
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
 *         &lt;element name="ConsultaPuntajeComentariosOQuejasResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "consultaPuntajeComentariosOQuejasResult"
})
@XmlRootElement(name = "ConsultaPuntajeComentariosOQuejasResponse")
public class ConsultaPuntajeComentariosOQuejasResponse {

    @XmlElement(name = "ConsultaPuntajeComentariosOQuejasResult")
    protected String consultaPuntajeComentariosOQuejasResult;

    /**
     * Obtiene el valor de la propiedad consultaPuntajeComentariosOQuejasResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultaPuntajeComentariosOQuejasResult() {
        return consultaPuntajeComentariosOQuejasResult;
    }

    /**
     * Define el valor de la propiedad consultaPuntajeComentariosOQuejasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultaPuntajeComentariosOQuejasResult(String value) {
        this.consultaPuntajeComentariosOQuejasResult = value;
    }

}
