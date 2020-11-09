
package Servicio;

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
 *         &lt;element name="strCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strPrecio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strStock" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "strCodigo",
    "strNombre",
    "strPrecio",
    "strStock"
})
@XmlRootElement(name = "ActualizarProducto")
public class ActualizarProducto {

    protected String strCodigo;
    protected String strNombre;
    protected int strPrecio;
    protected int strStock;

    /**
     * Obtiene el valor de la propiedad strCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigo() {
        return strCodigo;
    }

    /**
     * Define el valor de la propiedad strCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigo(String value) {
        this.strCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad strNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNombre() {
        return strNombre;
    }

    /**
     * Define el valor de la propiedad strNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNombre(String value) {
        this.strNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad strPrecio.
     * 
     */
    public int getStrPrecio() {
        return strPrecio;
    }

    /**
     * Define el valor de la propiedad strPrecio.
     * 
     */
    public void setStrPrecio(int value) {
        this.strPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad strStock.
     * 
     */
    public int getStrStock() {
        return strStock;
    }

    /**
     * Define el valor de la propiedad strStock.
     * 
     */
    public void setStrStock(int value) {
        this.strStock = value;
    }

}
