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
        public string Crear_Cliente(string strCodigo, string strDireccion, string strNombre)
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
        public string ActualizarCliente(string strDireccion, string strNombre, string strCodigo)
        {
            try
            {
                using (var ContextoBD = new DBProgIIEntities2())
                {
                    Cliente actualizar = ContextoBD.Cliente.Find(strCodigo);
                    if (actualizar != null)
                    {
                        actualizar.Nombre = strNombre;
                        actualizar.Dirección = strDireccion;
                        ContextoBD.SaveChanges();
                        return "DATOS GUARDADOS CORRECTAMENTE";

                    }
                    return "DATOS NO ENCONTRADOS";
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
        public string Crear_Pedidos(string strCodigo_Cliente, string strFecha, string strNumero_pedido, string strNombre_cliente, string strCodigo_producto, string strproducto, int strPrecio, string strEstado, string strDirección)
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
        public string Consultapedidos(string Codigo_pedido)
        {
            try
            {
                using (var pedidos = new DBProgIIEntities2())
                {
                    var info = pedidos.pedidos.Find(Codigo_pedido);
                    if (info == null)
                    {
                        pedidos.SaveChanges();
                        return "No Existe Ningun Tipo de Pedido ";
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
                using (var estoyMuerto = new DBProgIIEntities2())
                {
                    var pro = estoyMuerto.Producto.Find(Codigo);
                    if (pro == null)
                    {
                        //estoyMuerto.SaveChanges();
                        return "PRODUCTO NO DISPONIBLE ";
                    }
                    else
                    {
                        return pro.Codigo + pro.Nombre + "; " + pro.Precio + "; " + pro.Stock;
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
                using (var quejas = new DBProgIIEntities2())
                {
                    var info = quejas.comentarios_o_quejas.Find(Fecha);
                    if (info == null)
                    {
                        quejas.SaveChanges();
                        return "No Existe Ningun Tipo De Queja ";
                    }
                    else
                    {
                        return info.Fecha + "; " + info.Tipo + "; " + info.Descripción + "; " + info.Calificación + "; ";
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
                    return "Comentario GUARDADO: ";
                }
            }
            catch (Exception ex)
            {
                return "ERROR:  " + ex.Message;
            }
        }


        [WebMethod]
        public string Consulpuntajequejas(int puntaje)
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
                        return "No Existe Ningun Tipo De Queja ";
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
        public string InsertarProducto(string Codigo, string Nombre, int Precio, int Stock)
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
                return "Ha ocurrido un error: " + e.Message;
            }
            return "El producto se agregó exitosamente";
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
                return "Ha ocurrido un error: " + e.Message;
            }
            return "El producto se agregó exitosamente";
        }

        [WebMethod]
        public string ObtenerProducto(string Codigo)
        {
            try
            {
                using (var contextDB = new DBProgIIEntities2())
                {
                    Producto obj = contextDB.Producto.Find(Codigo);
                    if (obj == null)
                    {
                        return null;
                    }
                    else
                    {
                        string Respuesta = ToXml(obj, false);
                        return Respuesta;
                    }
                }
            }
            catch (Exception e)
            {
                return null;
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
                return "Ha ocurrido un error: " + e.Message;
            }
            return "El producto se ha eliminado exitosamente";
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
                return "Ha ocurrido un error: " + e.Message;
            }
        }
        [WebMethod]
        public string Listadepedidosporcodigo(string codigocliente)
        {
            List<pedidos> SortedList = null;
            try
            {
                using (var Listado = new DBProgIIEntities2())

                {
                    List<pedidos> list = Listado.pedidos.Where(L => L.Codigo_cliente == codigocliente).ToList();
                    SortedList = list.OrderBy(o => o.Codigo_producto).ToList();
                    if (SortedList.Count > 1)
                    {
                        return "No Existe Ningun Tipo De Pedido ";
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
                    List<pedidos> list = contextDB.pedidos.Where(q => q.Estado == "en proceso").ToList();
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