package br.ufpb.sistemaPedidos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ControleDePedidos implements InterfaceSistemaDeControle {

	private List <Pedido> pedidos;
	GravadorDePedidos gravador = new GravadorDePedidos();
	
	public ControleDePedidos (){
		try {
			this.pedidos = gravador.lePedido();
		} catch (IOException e) {			
			e.getMessage();
			this.pedidos = new ArrayList();
		} catch (ClassNotFoundException e) {			
			e.getMessage();
		}
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
		try {
			gravador.gravaPedidos(pedidos);
		} catch (IOException e) {
			e.getMessage();
		}
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
	
	public void fecharPrograma(){
		try {
			gravador.gravaPedidos(this.pedidos);
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
