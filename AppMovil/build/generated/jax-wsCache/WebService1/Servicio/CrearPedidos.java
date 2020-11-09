
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
 *         &lt;element name="strCodigo_Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNumero_pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNombre_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodigo_producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strPrecio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDirección" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strCodigoCliente",
    "strFecha",
    "strNumeroPedido",
    "strNombreCliente",
    "strCodigoProducto",
    "strproducto",
    "strPrecio",
    "strEstado",
    "strDirecci\u00f3n"
})
@XmlRootElement(name = "CrearPedidos")
public class CrearPedidos {

    @XmlElement(name = "strCodigo_Cliente")
    protected String strCodigoCliente;
    protected String strFecha;
    @XmlElement(name = "strNumero_pedido")
    protected String strNumeroPedido;
    @XmlElement(name = "strNombre_cliente")
    protected String strNombreCliente;
    @XmlElement(name = "strCodigo_producto")
    protected String strCodigoProducto;
    protected String strproducto;
    protected int strPrecio;
    protected String strEstado;
    protected String strDirección;

    /**
     * Obtiene el valor de la propiedad strCodigoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigoCliente() {
        return strCodigoCliente;
    }

    /**
     * Define el valor de la propiedad strCodigoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigoCliente(String value) {
        this.strCodigoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad strFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFecha() {
        return strFecha;
    }

    /**
     * Define el valor de la propiedad strFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFecha(String value) {
        this.strFecha = value;
    }

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
     * Obtiene el valor de la propiedad strNombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNombreCliente() {
        return strNombreCliente;
    }

    /**
     * Define el valor de la propiedad strNombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNombreCliente(String value) {
        this.strNombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad strCodigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigoProducto() {
        return strCodigoProducto;
    }

    /**
     * Define el valor de la propiedad strCodigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigoProducto(String value) {
        this.strCodigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad strproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrproducto() {
        return strproducto;
    }

    /**
     * Define el valor de la propiedad strproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrproducto(String value) {
        this.strproducto = value;
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

    /**
     * Obtiene el valor de la propiedad strDirección.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDirección() {
        return strDirección;
    }

    /**
     * Define el valor de la propiedad strDirección.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDirección(String value) {
        this.strDirección = value;
    }

}
