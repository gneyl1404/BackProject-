/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import Servicio.WebService1;

/**
 *
 * @author Jorge Mayorga
 */
public class WebService {
   WebService1 service = new WebService1();
       

        String Respuesta;
          
          public WebService(){
              
          }
          
          public String RegistrarUsuario(String strCode, String strNombre, String strDireccion){
           Respuesta = service.getWebService1Soap().crearCliente(strCode, strDireccion, strNombre);
          return Respuesta;
          } 
}
