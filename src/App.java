import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
    
    
    //pedido  CASO 1
    System.out.println("--------------CASO 1---------------");
    Pedido p1 = new Pedido("Lorena", "Coca Cola","09810012", 100.0, "lorena@example.com");
    PedidoService pedidoService = new PedidoService();
    pedidoService.registar(p1);

    //pedido CASO 2
        System.out.println("--------------CASO 2---------------");

    Pedido p2 = new Pedido("Ami", "Pesto","098121212", 10450.0, "ami@example.com");
    pedidoService.registar(p2);

    //pedido CASO 3
        System.out.println("--------------CASO 3---------------");

     Pedido p3 = new Pedido("Juli", "Pizza","098565", 10.0, "juli@example.com");
    pedidoService.registar(p3);
    
    }
}
