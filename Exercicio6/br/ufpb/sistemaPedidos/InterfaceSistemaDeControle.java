package br.ufpb.sistemaPedidos;
import java.util.List;

/**
 * Essa é a uma interface criada para gerenciar uma lista de pedidos
 * possui os metodos adicionar, pesquisar e remover
 * @author Jeffeson
 *
 */
public interface InterfaceSistemaDeControle {

	/**
	 * Esse metodo recebe um pedido e adiciona a lista
	 * @param p é o parametro o pedido recebido para ser adicionado a lista
	 */
	public void adicionaPedido (Pedido p);
	
	/**
	 * O metodo abaixo pesquisa um pedido na lista de pedidos tendo como parametro
	 * @param codproduto que serapassado como chave de busca para os pedidos desejados
	 * @return e tem como retorno uma lista de pedidos contendo o produto desejado
	 */
	public List <Pedido> pesquisaPedidosIncluindoProduto(long codproduto);
	public void removePedido (long numPedido);
	
}
