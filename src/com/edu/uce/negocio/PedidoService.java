package com.edu.uce.negocio;

public class PedidoService {
      public void registar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");
 
        NotificadorMail n1 = new NotificadorMail();
        if (pedido.getTotal() <= 100) {
            n1.enviarSMS(pedido.getTelefono(), "Su pedido esta siendo procesado");
        } else {
            n1.enviarMail(pedido.getCorreo(), "Su pedido esta siendo procesado");
        }
    }

}
