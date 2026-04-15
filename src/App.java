import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
    
    
    //pedido <= 100
    Pedido p1 = new Pedido("Lorena", "Coca Cola","09810012", 100.0, "lorena@example.com");
    PedidoService pedidoService = new PedidoService();
    pedidoService.registar(p1);

    //pedido >100
    Pedido p2 = new Pedido("Ami", "Pesto","098121212", 10450.0, "ami@example.com");
    pedidoService.registar(p2);
    }
}
