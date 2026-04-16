package com.edu.uce.negocio;

public class PedidoService {
    public void registar(Pedido pedido) {

        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        NotificadorMail n1 = new NotificadorMail();
        NotificadorSMS n2 = new NotificadorSMS();
        NotificadorWhatsapp n3 = new NotificadorWhatsapp();

        if (pedido.getTotal() >120 ) {
            n1.enviarMail(pedido.getTelefono(), "Su pedido esta siendo procesado y se le notificara por WhatsApp");
        } else if (pedido.getTotal() <50 ) {
            n3.enviarWhatsApp(pedido.getTelefono(), "Su pedido esta siendo procesado y se le notificara por SMS");
        } else {
            n2.enviarSMS(pedido.getCorreo(), "Su pedido esta siendo procesado y le notificara por correo");
        }
    }

}
