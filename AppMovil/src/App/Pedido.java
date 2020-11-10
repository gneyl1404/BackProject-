/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Jorge Mayorga
 */
public class Pedido {

    private static String Producto = "";
    private static String CodigoProducto = "";
    private static String Precio = "";
    private static String Stock = "";

    public static String getProducto() {
        return Producto;
    }

    public static void setProducto(String Producto) {
        Pedido.Producto = Producto;
    }

    public static String getCodigoProducto() {
        return CodigoProducto;
    }

    public static void setCodigoProducto(String CodigoProducto) {
        Pedido.CodigoProducto = CodigoProducto;
    }

    public static String getPrecio() {
        return Precio;
    }

    public static void setPrecio(String Precio) {
        Pedido.Precio = Precio;
    }


    public static String getStock() {
        return Stock;
    }

    public static void setStock(String Stock) {
        Pedido.Stock = Stock;
    }

}
