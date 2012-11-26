
public class ProgramaPrincipal {

	public static void main (String[]args){
		ControleDePedidos cdp = new ControleDePedidos();
		
		Pedido p1 = new Pedido (1);
		Pedido p2 = new Pedido (2);
		Cliente c1 = new Cliente ("jeffeson");
		cdp.adicionaPedido(p1);
		cdp.adicionaPedido(p2);
		
		p1.setCliente(c1);
		p2.setCliente(c1);
		
		int quantidade = cdp.calculaQuantidadeDePedidosDoCliente("jeffeson");
		if(quantidade==2){
			System.out.println("Programa Correto");
		}else {
			System.out.println("Programa incorreto");
		}
		
	}
}
