package br.ufpb.sistemaPedidos;
import java.util.List;


public interface InterfaceSistemaDeControle {

	public void adicionaPedido (Pedido p);
	public List <Pedido> pesquisaPedidosIncluindoProduto(long codproduto);
	public void removePedido (long numPedido);
	
}
