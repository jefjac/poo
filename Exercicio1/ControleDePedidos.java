import java.util.ArrayList;
import java.util.List;


public class ControleDePedidos implements InterfaceSistemaDeControle {

	private List <Pedido> pedidos;
	
	public ControleDePedidos (){
		this.pedidos = new ArrayList <Pedido> ();
	}
	
	public int calculaQuantidadeDePedidosDoCliente (String nomeCliente){
		int numeroDePedidos = 0;
		for (Pedido p : pedidos){
			if (p.getCliente().getNome()== nomeCliente){
				numeroDePedidos++;
			}
		}
		return  numeroDePedidos;
	}

	@Override
	public void adicionaPedido(Pedido p) {
		this.pedidos.add(p);
	}

	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codproduto) {
		List <Pedido> listPedidos = new ArrayList <Pedido>();
			for (int i = 0; i < pedidos.size(); i++){
				for (int j = 0; j < pedidos.get(i).getItens().size();j++){
					if (pedidos.get(i).getItens().get(j).getCodProduto() == codproduto){
						listPedidos.add(pedidos.get(i));
					}
				}
			}
		return listPedidos;
	}

	@Override
	public void removePedido(long numPedido) {
		for (Pedido p : pedidos){
			if (p.getNumeroDoPedido()==numPedido){
				pedidos.remove(p);
			}
		}
		
	}
}
