using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
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
        public string ClientesFrecuentes(string strFacturasEmitidas)
        {
            try
            {
                using (var frecuente = new DBProgIIEntities2())
                {
                    var cliente = frecuente.Cliente.Find(strFacturasEmitidas);
                    if (cliente == null)
                    {
                        frecuente.SaveChanges();
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
        public string Consulpuntajequejas()
        {
            try
            {
                using (var quejas = new DBProgIIEntities2())

                {
                    int numero = 5;

                    var info = quejas.comentarios_o_quejas.Find(numero);
                    if(info == null)
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

                return "Ha ocurrido un error: " + e;
            }

            return "El producto se agregó exitosamente";
        }

        [WebMethod]
        public string ActualizarProducto(string Codigo, string Nombre, int Precio, int Stock)
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
                    contextDB.Producto.AddOrUpdate(obj);
                    contextDB.SaveChanges();
                }
            }
            catch (Exception e)
            {

                return "Ha ocurrido un error: " + e;
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
                }
            }
            catch (Exception e)
            {

                return "Ha ocurrido un error: " + e;
            }

            return "Código: " + obj.Codigo + "Nombre: " + obj.Nombre + "Precio: " + obj.Precio + "Stock: " + obj.Stock;
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
                }
            }
            catch (Exception e)
            {

                return "Ha ocurrido un error: " + e;
            }

            return "El producto se ha eliminado exitosamente";
        }
    }
}

     
            

            
                
            



            


            
    


