
package Servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebService1Soap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService1Soap {


    /**
     * 
     * @param strDireccion
     * @param strCodigo
     * @param strNombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CrearCliente", action = "http://tempuri.org/CrearCliente")
    @WebResult(name = "CrearClienteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CrearCliente", targetNamespace = "http://tempuri.org/", className = "Servicio.CrearCliente")
    @ResponseWrapper(localName = "CrearClienteResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.CrearClienteResponse")
    public String crearCliente(
        @WebParam(name = "strCodigo", targetNamespace = "http://tempuri.org/")
        String strCodigo,
        @WebParam(name = "strDireccion", targetNamespace = "http://tempuri.org/")
        String strDireccion,
        @WebParam(name = "strNombre", targetNamespace = "http://tempuri.org/")
        String strNombre);

    /**
     * 
     * @param strDireccion
     * @param strCodigo
     * @param strNombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarCliente", action = "http://tempuri.org/ActualizarCliente")
    @WebResult(name = "ActualizarClienteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ActualizarCliente", targetNamespace = "http://tempuri.org/", className = "Servicio.ActualizarCliente")
    @ResponseWrapper(localName = "ActualizarClienteResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ActualizarClienteResponse")
    public String actualizarCliente(
        @WebParam(name = "strCodigo", targetNamespace = "http://tempuri.org/")
        String strCodigo,
        @WebParam(name = "strNombre", targetNamespace = "http://tempuri.org/")
        String strNombre,
        @WebParam(name = "strDireccion", targetNamespace = "http://tempuri.org/")
        String strDireccion);

    /**
     * 
     * @param strPrecio
     * @param strCodigo
     * @param strNombre
     * @param strStock
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarProducto", action = "http://tempuri.org/ActualizarProducto")
    @WebResult(name = "ActualizarProductoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ActualizarProducto", targetNamespace = "http://tempuri.org/", className = "Servicio.ActualizarProducto")
    @ResponseWrapper(localName = "ActualizarProductoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ActualizarProductoResponse")
    public String actualizarProducto(
        @WebParam(name = "strCodigo", targetNamespace = "http://tempuri.org/")
        String strCodigo,
        @WebParam(name = "strNombre", targetNamespace = "http://tempuri.org/")
        String strNombre,
        @WebParam(name = "strPrecio", targetNamespace = "http://tempuri.org/")
        int strPrecio,
        @WebParam(name = "strStock", targetNamespace = "http://tempuri.org/")
        int strStock);

    /**
     * 
     * @param strEstado
     * @param strNumeroPedido
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarPedido", action = "http://tempuri.org/ActualizarPedido")
    @WebResult(name = "ActualizarPedidoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ActualizarPedido", targetNamespace = "http://tempuri.org/", className = "Servicio.ActualizarPedido")
    @ResponseWrapper(localName = "ActualizarPedidoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ActualizarPedidoResponse")
    public String actualizarPedido(
        @WebParam(name = "strNumeroPedido", targetNamespace = "http://tempuri.org/")
        String strNumeroPedido,
        @WebParam(name = "strEstado", targetNamespace = "http://tempuri.org/")
        String strEstado);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultaCliente", action = "http://tempuri.org/ConsultaCliente")
    @WebResult(name = "ConsultaClienteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaCliente", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaCliente")
    @ResponseWrapper(localName = "ConsultaClienteResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaClienteResponse")
    public String consultaCliente(
        @WebParam(name = "Codigo", targetNamespace = "http://tempuri.org/")
        String codigo);

    /**
     * 
     * @param strFecha
     * @param strPrecio
     * @param strCodigoProducto
     * @param strEstado
     * @param strDirección
     * @param strproducto
     * @param strNombreCliente
     * @param strCodigoCliente
     * @param strNumeroPedido
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CrearPedidos", action = "http://tempuri.org/CrearPedidos")
    @WebResult(name = "CrearPedidosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CrearPedidos", targetNamespace = "http://tempuri.org/", className = "Servicio.CrearPedidos")
    @ResponseWrapper(localName = "CrearPedidosResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.CrearPedidosResponse")
    public String crearPedidos(
        @WebParam(name = "strCodigo_Cliente", targetNamespace = "http://tempuri.org/")
        String strCodigoCliente,
        @WebParam(name = "strFecha", targetNamespace = "http://tempuri.org/")
        String strFecha,
        @WebParam(name = "strNumero_pedido", targetNamespace = "http://tempuri.org/")
        String strNumeroPedido,
        @WebParam(name = "strNombre_cliente", targetNamespace = "http://tempuri.org/")
        String strNombreCliente,
        @WebParam(name = "strCodigo_producto", targetNamespace = "http://tempuri.org/")
        String strCodigoProducto,
        @WebParam(name = "strproducto", targetNamespace = "http://tempuri.org/")
        String strproducto,
        @WebParam(name = "strPrecio", targetNamespace = "http://tempuri.org/")
        int strPrecio,
        @WebParam(name = "strEstado", targetNamespace = "http://tempuri.org/")
        String strEstado,
        @WebParam(name = "strDirecci\u00f3n", targetNamespace = "http://tempuri.org/")
        String strDirección);

    /**
     * 
     * @param codigoPedido
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultaPedidos", action = "http://tempuri.org/ConsultaPedidos")
    @WebResult(name = "ConsultaPedidosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaPedidos", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaPedidos")
    @ResponseWrapper(localName = "ConsultaPedidosResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaPedidosResponse")
    public String consultaPedidos(
        @WebParam(name = "Codigo_pedido", targetNamespace = "http://tempuri.org/")
        String codigoPedido);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultaProducto", action = "http://tempuri.org/ConsultaProducto")
    @WebResult(name = "ConsultaProductoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaProducto", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaProducto")
    @ResponseWrapper(localName = "ConsultaProductoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaProductoResponse")
    public String consultaProducto(
        @WebParam(name = "Codigo", targetNamespace = "http://tempuri.org/")
        String codigo);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReporteDeQuejasOComenterios", action = "http://tempuri.org/ReporteDeQuejasOComenterios")
    @WebResult(name = "ReporteDeQuejasOComenteriosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReporteDeQuejasOComenterios", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeQuejasOComenterios")
    @ResponseWrapper(localName = "ReporteDeQuejasOComenteriosResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeQuejasOComenteriosResponse")
    public String reporteDeQuejasOComenterios();

    /**
     * 
     * @param descripcion
     * @param fecha
     * @param tipo
     * @param calificacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "A\u00f1adirComentario", action = "http://tempuri.org/A\u00f1adirComentario")
    @WebResult(name = "A\u00f1adirComentarioResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "A\u00f1adirComentario", targetNamespace = "http://tempuri.org/", className = "Servicio.A\u00f1adirComentario")
    @ResponseWrapper(localName = "A\u00f1adirComentarioResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.A\u00f1adirComentarioResponse")
    public String añadirComentario(
        @WebParam(name = "Fecha", targetNamespace = "http://tempuri.org/")
        String fecha,
        @WebParam(name = "Tipo", targetNamespace = "http://tempuri.org/")
        String tipo,
        @WebParam(name = "Descripcion", targetNamespace = "http://tempuri.org/")
        String descripcion,
        @WebParam(name = "Calificacion", targetNamespace = "http://tempuri.org/")
        int calificacion);

    /**
     * 
     * @param puntaje
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ConsultaPuntajeComentariosOQuejas", action = "http://tempuri.org/ConsultaPuntajeComentariosOQuejas")
    @WebResult(name = "ConsultaPuntajeComentariosOQuejasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ConsultaPuntajeComentariosOQuejas", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaPuntajeComentariosOQuejas")
    @ResponseWrapper(localName = "ConsultaPuntajeComentariosOQuejasResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ConsultaPuntajeComentariosOQuejasResponse")
    public String consultaPuntajeComentariosOQuejas(
        @WebParam(name = "puntaje", targetNamespace = "http://tempuri.org/")
        int puntaje);

    /**
     * 
     * @param codigo
     * @param precio
     * @param stock
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AgregarProducto", action = "http://tempuri.org/AgregarProducto")
    @WebResult(name = "AgregarProductoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AgregarProducto", targetNamespace = "http://tempuri.org/", className = "Servicio.AgregarProducto")
    @ResponseWrapper(localName = "AgregarProductoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.AgregarProductoResponse")
    public String agregarProducto(
        @WebParam(name = "Codigo", targetNamespace = "http://tempuri.org/")
        String codigo,
        @WebParam(name = "Nombre", targetNamespace = "http://tempuri.org/")
        String nombre,
        @WebParam(name = "Precio", targetNamespace = "http://tempuri.org/")
        int precio,
        @WebParam(name = "Stock", targetNamespace = "http://tempuri.org/")
        int stock);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReporteStockProducto", action = "http://tempuri.org/ReporteStockProducto")
    @WebResult(name = "ReporteStockProductoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReporteStockProducto", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteStockProducto")
    @ResponseWrapper(localName = "ReporteStockProductoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteStockProductoResponse")
    public String reporteStockProducto(
        @WebParam(name = "Codigo", targetNamespace = "http://tempuri.org/")
        String codigo);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EliminarProducto", action = "http://tempuri.org/EliminarProducto")
    @WebResult(name = "EliminarProductoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EliminarProducto", targetNamespace = "http://tempuri.org/", className = "Servicio.EliminarProducto")
    @ResponseWrapper(localName = "EliminarProductoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.EliminarProductoResponse")
    public String eliminarProducto(
        @WebParam(name = "Codigo", targetNamespace = "http://tempuri.org/")
        String codigo);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ClientesFrecuentes", action = "http://tempuri.org/ClientesFrecuentes")
    @WebResult(name = "ClientesFrecuentesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ClientesFrecuentes", targetNamespace = "http://tempuri.org/", className = "Servicio.ClientesFrecuentes")
    @ResponseWrapper(localName = "ClientesFrecuentesResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ClientesFrecuentesResponse")
    public String clientesFrecuentes();

    /**
     * 
     * @param codigocliente
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ListaDePedidosPorCodigo", action = "http://tempuri.org/ListaDePedidosPorCodigo")
    @WebResult(name = "ListaDePedidosPorCodigoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListaDePedidosPorCodigo", targetNamespace = "http://tempuri.org/", className = "Servicio.ListaDePedidosPorCodigo")
    @ResponseWrapper(localName = "ListaDePedidosPorCodigoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ListaDePedidosPorCodigoResponse")
    public String listaDePedidosPorCodigo(
        @WebParam(name = "codigocliente", targetNamespace = "http://tempuri.org/")
        String codigocliente);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ListaDePedidosOCompras", action = "http://tempuri.org/ListaDePedidosOCompras")
    @WebResult(name = "ListaDePedidosOComprasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListaDePedidosOCompras", targetNamespace = "http://tempuri.org/", className = "Servicio.ListaDePedidosOCompras")
    @ResponseWrapper(localName = "ListaDePedidosOComprasResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ListaDePedidosOComprasResponse")
    public String listaDePedidosOCompras();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReporteDeClientes", action = "http://tempuri.org/ReporteDeClientes")
    @WebResult(name = "ReporteDeClientesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReporteDeClientes", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeClientes")
    @ResponseWrapper(localName = "ReporteDeClientesResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeClientesResponse")
    public String reporteDeClientes();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReporteDeVentasFinalizado", action = "http://tempuri.org/ReporteDeVentasFinalizado")
    @WebResult(name = "ReporteDeVentasFinalizadoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReporteDeVentasFinalizado", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeVentasFinalizado")
    @ResponseWrapper(localName = "ReporteDeVentasFinalizadoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeVentasFinalizadoResponse")
    public String reporteDeVentasFinalizado();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ReporteDeVentasProceso", action = "http://tempuri.org/ReporteDeVentasProceso")
    @WebResult(name = "ReporteDeVentasProcesoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReporteDeVentasProceso", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeVentasProceso")
    @ResponseWrapper(localName = "ReporteDeVentasProcesoResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ReporteDeVentasProcesoResponse")
    public String reporteDeVentasProceso();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ListProductos", action = "http://tempuri.org/ListProductos")
    @WebResult(name = "ListProductosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListProductos", targetNamespace = "http://tempuri.org/", className = "Servicio.ListProductos")
    @ResponseWrapper(localName = "ListProductosResponse", targetNamespace = "http://tempuri.org/", className = "Servicio.ListProductosResponse")
    public String listProductos();

}
