using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace WebApplication1
{
    /// <summary>
    /// Descripción breve de WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {
        private object contextoBD;

        [WebMethod]
        public string Crear_Cliente(string strCodigo, string strDireccion, string strNombre)
        {
            try
            {
                using (var contextoBD = new DBProgIIEntities()) ;
                {
                    Clientes objClientes = new Clientes();
                    objClientes.Codigo = strCodigo;
                    objClientes.Dirección = strDireccion;
                    objClientes.Nombre = strNombre;
                    contextoBD.Clientes(objClientes);
                    contextoBD.SaveChanges();
                    return "CLIENTE GUARDADO : ";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }

        [WebMethod]
        public string Consulta(string Codigo)
        {
            try
            {
                using (var estoyMuerto = new DBProgIIEntities())
                {
                    var cliente = estoyMuerto.Cliente.Find(Codigo);
                    if (cliente == null)
                    {
                        estoyMuerto.SaveChanges();
                        return "NO HAY REGISTRO ALGUNO ";
                    }
                    else
                    {
                        return cliente.Dirección + "; " + cliente.Nombre;
                    }
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }

        [WebMethod]
        public string Crear_Pedidos(string strCodigo_Cliente, string strFecha, string strNumero_pedido, string strNombre_cliente, string strCodigo_producto, string strproducto, string strPrecio, string strEstado, string strDirección)
        {
            try
            {
                using (var contextoBD = new DBProgIIEntities())
                {
                    Reserva Objpedido = new Reserva();
                    Objpedido.Codigo_Cliente = strCodigo_Cliente;
                    Objpedido.fecha = strFecha;
                    Objpedido.Nuemero_Pedido = strNumero_pedido;
                    Objpedido.Nombre_cliente = strNombre_cliente;
                    Objpedido.Codigo_Producto = strCodigo_producto;
                    Objpedido.Estado = strEstado;
                    Objpedido.precio = strPrecio;
                    Objpedido.Direccion = strDirección;
                    contextoBD.Reserva(Objpedido);
                    contextoBD.SaveChanges();
                    return "CLIENTE GUARDADO : ";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;


            }
        }

        [WebMethod]
        public string actualizar_Tabla(string Codigo)
        {
            try
            {
                using (var estoyMuerto = new DBProgIIEntities())
                {
                    var cliente = estoyMuerto.Cliente.Find(Codigo);
                    if (cliente == null)
                    {
                        estoyMuerto.SaveChanges();
                        return "ACTUALIZACION DEL PRODUCTO DISPONIBLE ";
                    }
                    else
                    {
                        return cliente.Dirección + cliente.Nombre + "; " + cliente.Codigo;
                    }
                }
            }
            catch (Exception ex)
            {
                return "OCURRIO UN ERROR " + ex.Message;
            }
        }
        [WebMethod]
        public string Consultaquejas(string Fecha)
        {
            try
            {
                using (var quejas = new DBProgIIEntities())
                {
                    var info = quejas.Cliente.Find(Fecha);
                    if (info == null)
                    {
                        quejas.SaveChanges();
                        return "No Existe Ningun Tipo De Queja ";
                    }
                    else
                    {
                        return info.Fecha + "; " + info.Tipo + "; " + info.Descripcion + "; " + info.Calificacion + "; ";
                    }
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }
        //Edgardo Saul Martinez Velasquez
        [WebMethod]
        public DBProgIIEntities Consultapedidos(string Codigo_cliente)
        {
            try
            {
                using (var pedidos = new DBProgIIEntities())
                {
                    var info = pedidos.pedidos.Find(Codigo_cliente);
                    if (info == null)
                    {
                        pedidos.SaveChanges();
                        return "No Existe Ningun Tipo de Pedido ";
                    }
                    else
                    {
                        return info.Fecha + "; " + info.Numero_pedido + "; " + info.Codigo_cliente + "; " + info.Calificacion + "; " + info.Codigo_producto + "; " + info.Producto + "; " + info.Precio + "; " + info.Estado + "; " + info.Direccion + "; ";
                    }
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }
    [WebMethod]
    public string Tablacomentarios(string Fecha, string Tipo, string Descripcion, string Calificacion)
    {
        try
        {
                using (var contextoBD = new DBProgIIEntities())
                {
                    comentario objComentario = new comentario();
                    objComentario.Codigo = Fecha;
                    objComentario.Dirección = Tipo;
                    objComentario.Nombre = Descripcion;
                    objComentario.Nombre = Calificacion;
                    contextoBD.Comentario(objComentario);
                    contextoBD.SaveChanges();
                    return "Comentario GUARDADO : ";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }
    
    }
}

