package com.edu.uce.negocio;

public class NotificadorMail {

   public void enviarMail(String correo, String mensaje) {
       
        System.out.println("Se envia el email al correo: " + correo);
        System.out.println("Con el mensaje: " + mensaje);
    }
 
    public void enviarSMS(String telefono, String mensaje) {
       
        System.out.println("Se envia el SMS al telefono: " + telefono);
        System.out.println("Con el mensaje: " + mensaje);
    }
 

}
