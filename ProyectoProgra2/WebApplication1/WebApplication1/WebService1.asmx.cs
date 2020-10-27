using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Web;
using System.Web.Services;
using System.Web.UI.WebControls;
using System.Xml.Serialization;
using WebApplication1.Capa_de_datos;

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
        public string CrearCliente(string strCodigo, string strDireccion, string strNombre)
        {
            try
            {
                using (var contextoBD = new DBProgIIEntities2())
                {
                    Cliente objClientes = new Cliente();
                    objClientes.Codigo = strCodigo;
                    objClientes.Dirección = strDireccion;
                    objClientes.Nombre = strNombre;
                    contextoBD.Cliente.Add(objClientes);
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
        public string ActualizarCliente(string strCodigo, string strNombre, string strDireccion)
        {
            try
            {
                using (var ContextoBD = new DBProgIIEntities2())
                {
                    Cliente actualizar = ContextoBD.Cliente.SingleOrDefault(p => p.Codigo == strCodigo);
                    if (actualizar != null)
                    {
                        actualizar.Nombre = strNombre;
                        actualizar.Dirección = strDireccion;
                        ContextoBD.SaveChanges();
                        return "DATOS ACTUALIZADOS CORRECTAMENTE";

                    }
                    return "CÓDIGO NO ENCONTRADO";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }

        [WebMethod]
        public string ActualizarProducto(string strCodigo, string strNombre, int strPrecio, int strStock)
        {
            try
            {
                using (var ContextoBD = new DBProgIIEntities2())
                {
                    Producto actualizar = ContextoBD.Producto.SingleOrDefault(p => p.Codigo == strCodigo);
                    if (actualizar != null)
                    {
                        actualizar.Nombre = strNombre;
                        actualizar.Precio = strPrecio;
                        actualizar.Stock = strStock;
                        ContextoBD.SaveChanges();
                        return "DATOS ACTUALIZADOS CORRECTAMENTE";

                    }
                    return "CÓDIGO NO ENCONTRADO";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }

        [WebMethod]
        public string ActualizarPedido(string strNumeroPedido, string strEstado)
        {
            try
            {
                using (var ContextoBD = new DBProgIIEntities2())
                {
                    pedidos actualizar = ContextoBD.pedidos.SingleOrDefault(p => p.Numero_pedido == strNumeroPedido);
                    if (actualizar != null)
                    {
                        actualizar.Estado = strEstado;
                        ContextoBD.SaveChanges();
                        return "PEDIDO ACTUALIZADO CORRECTAMENTE";

                    }
                    return "NÚMERO DE PEDIDO NO ENCONTRADO";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }



        [WebMethod]
        public string ConsultaCliente(string Codigo)
        {
            try
            {
                using (var contextoBD = new DBProgIIEntities2())
                {
                    var cliente = contextoBD.Cliente.Find(Codigo);
                    if (cliente == null)
                    {
                        //contextoBD.SaveChanges();
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
        public string CrearPedidos(string strCodigo_Cliente, string strFecha, string strNumero_pedido, string strNombre_cliente, string strCodigo_producto, string strproducto, int strPrecio, string strEstado, string strDirección)
        {
            try
            {
                using (var contextoBD = new DBProgIIEntities2())
                {
                    pedidos Objpedido = new pedidos();
                    Objpedido.Codigo_cliente = strCodigo_Cliente;
                    Objpedido.Fecha = strFecha;
                    Objpedido.Numero_pedido = strNumero_pedido;
                    Objpedido.Nombre_cliente = strNombre_cliente;
                    Objpedido.Codigo_producto = strCodigo_producto;
                    Objpedido.Producto = strproducto;
                    Objpedido.Estado = strEstado;
                    Objpedido.Precio = strPrecio;
                    Objpedido.Dirección = strDirección;
                    contextoBD.pedidos.Add(Objpedido);
                    contextoBD.SaveChanges();
                    return "PEDIDO GUARDADO : ";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;


            }
        }

        [WebMethod]
        public string ConsultaPedidos(string Codigo_pedido)
        {
            try
            {
                using (var pedidos = new DBProgIIEntities2())
                {
                    var info = pedidos.pedidos.Find(Codigo_pedido);
                    if (info == null)
                    {
                        pedidos.SaveChanges();
                        return "NO HAY PEDIDOS";
                    }
                    else
                    {
                        return info.Fecha + "; " + info.Numero_pedido + "; " + info.Codigo_cliente + "; " + info.Nombre_cliente + "; " + info.Codigo_producto + "; " + info.Producto + "; " + info.Precio + "; " + info.Estado + "; " + info.Dirección + "; ";
                    }
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }

        [WebMethod]
        public string ConsultaProducto(string Codigo)
        {
            try
            {
                using (var consult = new DBProgIIEntities2())
                {
                    var pro = consult.Producto.Find(Codigo);
                    if (pro == null)
                    {
                        return "PRODUCTO NO DISPONIBLE ";
                    }
                    else
                    {
                        return  pro.Nombre + "; " + pro.Precio + "; " + pro.Stock;
                    }
                }
            }
            catch (Exception ex)
            {
                return "OCURRIO UN ERROR " + ex.Message;
            }
        }

        [WebMethod]
        public string ReporteDeQuejasOComenterios()
        {
            List<comentarios_o_quejas> SortedList = null;
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    List<comentarios_o_quejas> list = contextDB.comentarios_o_quejas.ToList();
                    SortedList = list.OrderBy(o => o.Fecha).ToList();
                    if (SortedList.Capacity < 1)
                    {
                        return null;
                    }
                }
            }
            catch (Exception e)
            {
                return null;
            }
            string Respuesta = ToXml(SortedList, false);
            return Respuesta;
        }
        //Edgardo Saul Martinez Velasquez

        [WebMethod]
        public string AñadirComentario(string Fecha, string Tipo, string Descripcion, int Calificacion)
        {
            try
            {
                using (var contextoBD = new DBProgIIEntities2())
                {
                    comentarios_o_quejas objComentario = new comentarios_o_quejas();
                    objComentario.Fecha = Fecha;
                    objComentario.Calificación = Calificacion;
                    objComentario.Descripción = Descripcion;
                    objComentario.Tipo = Tipo;
                    contextoBD.comentarios_o_quejas.Add(objComentario);
                    contextoBD.SaveChanges();
                    return "COMENTARIO GUARDADO";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }


        [WebMethod]
        public string ConsultaPuntajeComentariosOQuejas(int puntaje)
        {
            List<comentarios_o_quejas> SortedList = null;
            try
            {
                using (var quejas = new DBProgIIEntities2())

                {
                    List<comentarios_o_quejas> list = quejas.comentarios_o_quejas.Where(q => q.Calificación == puntaje).ToList();
                    SortedList = list.OrderBy(o => o.Código).ToList();
                    if (SortedList.Count < 1)
                    {
                        return "NO HAY COMENTARIOS NI QUEJAS";
                    }

                    else
                    {
                        string Respuesta = ToXml(SortedList, false);
                        return Respuesta;
                    }
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }
      

        [WebMethod]
        public string AgregarProducto(string Codigo, string Nombre, int Precio, int Stock)
        {
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    Producto obj = new Producto();
                    obj.Codigo = Codigo;
                    obj.Nombre = Nombre;
                    obj.Precio = Precio;
                    obj.Stock = Stock;
                    contextDB.Producto.Add(obj);
                    contextDB.SaveChanges();
                }
            }
            catch (Exception e)
            {
                return "HA OCURRIDO UN ERROR: " + e.Message;
            }
            return "EL PRODUCTO SE AGREGÓ EXITOSAMENTE";
        }

        [WebMethod]
        public string ReporteStockProducto(string Codigo)
        {
            try
            {
                using (var consult = new DBProgIIEntities2())
                {
                    var pro = consult.Producto.Find(Codigo);
                    if (pro == null)
                    {
                        return "PRODUCTO NO DISPONIBLE ";
                    }
                    else
                    {
                        return  "UNIDADES DISPONIBLES :" + pro.Stock;
                    }
                }
            }
            catch (Exception ex)
            {
                return "OCURRIO UN ERROR " + ex.Message;
            }
        }

        [WebMethod]
        public string EliminarProducto(string Codigo)
        {
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    Producto obj = contextDB.Producto.Find(Codigo);
                    contextDB.Producto.Remove(obj);
                    contextDB.SaveChanges();
                }
            }
            catch (Exception e)
            {
                return "HA OCURRIDO UN ERROR: " + e.Message;
            }
            return "EL PRODUCTO HA SIDO ELIMINADO";
        }


        [WebMethod]
        public string ClientesFrecuentes()
        {
            List<ClientesFrecuentes> SortedList = new List<ClientesFrecuentes>();
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    var query = (from p in contextDB.pedidos
                                 group p by p.Nombre_cliente into g
                                 select new
                                 {
                                     name = g.Key,
                                     count = g.Count()
                                 }).ToList();

                    ClientesFrecuentes cf;
                    foreach (var item in query)
                    {
                        cf = new ClientesFrecuentes();
                        cf.name = item.name;
                        cf.count = item.count;
                        SortedList.Add(cf);
                    }
                    if (query != null)
                    {
                        string Respuesta = ToXml(SortedList, false);
                        return Respuesta;
                    }
                    else
                    {
                        return "0";
                    }
                }
            }
            catch (Exception e)
            {
                return "HA OCURRIDO UN ERROR: " + e.Message;
            }
        }
        [WebMethod]
        public string ListaDePedidosPorCodigo(string codigocliente)
        {
            List<pedidos> SortedList = null;
            try
            {
                using (var Listado = new DBProgIIEntities2())

                {
                    List<pedidos> list = Listado.pedidos.Where(L => L.Codigo_cliente == codigocliente).ToList();
                    SortedList = list.OrderBy(o => o.Numero_pedido).ToList();
                    if (SortedList.Count < 1)
                    {
                        return "NO HAY PEDIDOS PARA ESE CLIENTE";
                    }

                    else
                    {
                        string Respuesta = ToXml(SortedList, false);
                        return Respuesta;
                    }
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }


        [WebMethod]
        public string ListaDePedidosOCompras()
        {
            List<pedidos> SortedList = null;
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    List<pedidos> list = contextDB.pedidos.ToList();
                    SortedList = list.OrderBy(o => o.Numero_pedido).ToList();
                    if (SortedList.Capacity < 1)
                    {
                        return null;
                    }
                }
            }
            catch (Exception e)
            {
                return null;
            }
            string Respuesta = ToXml(SortedList, false);
            return Respuesta;
        }


        [WebMethod]
        public string ReporteDeClientes()
        {
            List<Cliente> SortedList = null;
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    List<Cliente> list = contextDB.Cliente.ToList();
                    SortedList = list.OrderBy(o => o.Codigo).ToList();
                    if (SortedList.Capacity < 1)
                    {
                        return null;
                    }
                }
            }
            catch (Exception e)
            {
                return null;
            }
            string Respuesta = ToXml(SortedList, false);
            return Respuesta;
        }

        [WebMethod]
        public string ReporteDeVentasFinalizado()
        {
            List<pedidos> SortedList = null;
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    List<pedidos> list = contextDB.pedidos.Where(q => q.Estado == "Finalizado").ToList();
                    //foreach (pedidos obj in list)
                    //{
                    //    if (!obj.Estado.Contains("Finalizado"))
                    //    {
                    //        list.Remove(obj);
                    //    }
                    //}
                    SortedList = list.OrderBy(o => o.Numero_pedido).ToList();
                    if (SortedList.Capacity < 1)
                    {
                        return "no existen pedidos";
                    }
                }
            }
            catch (Exception e)
            {
                return null;
            }
            string Respuesta = ToXml(SortedList, false);
            return Respuesta;
        }

        [WebMethod]
        public string ReporteDeVentasProceso()
        {
            List<pedidos> SortedList = null;
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    List<pedidos> list = contextDB.pedidos.Where(q => q.Estado == "EN PROCESO").ToList();
                    SortedList = list.OrderBy(o => o.Numero_pedido).ToList();
                    if (SortedList.Capacity < 1)
                    {
                        return "NO HAY PEDIDOS EN PROCESO";
                    }
                }
            }
            catch (Exception e)
            {
                return null;
            }
            string Respuesta = ToXml(SortedList, false);
            return Respuesta;
        }


        private string ToXml(Object objToXml,
                     bool includeNameSpace)
        {
            StreamWriter stWriter = null;
            XmlSerializer xmlSerializer;
            string buffer;
            try
            {
                xmlSerializer =
                      new XmlSerializer(objToXml.GetType());
                MemoryStream memStream = new MemoryStream();
                stWriter = new StreamWriter(memStream);
                if (!includeNameSpace)
                {

                    System.Xml.Serialization.XmlSerializerNamespaces xs =
                                         new XmlSerializerNamespaces();

                    //To remove namespace and any other inline
                    //information tag                     
                    xs.Add("", "");
                    xmlSerializer.Serialize(stWriter, objToXml, xs);
                }
                else
                {
                    xmlSerializer.Serialize(stWriter, objToXml);
                }
                //buffer = Encoding.ASCII.GetString(memStream.GetBuffer());
                buffer = Encoding.UTF8.GetString(memStream.GetBuffer());
            }
            catch (Exception Ex)
            {
                throw Ex;
            }
            finally
            {
                if (stWriter != null) stWriter.Close();
            }
            return buffer.Replace("\0", "");
        }


    }
}