
import com.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
   Pedido p1 = new Pedido("Lorena", "Coca Cola", 100.0, "lorena@example.com");
    PedidoService pedidoService = new PedidoService();
    pedidoService.procesarPedido(p1);
    }
}
