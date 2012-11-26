import java.util.List;




public class Pedido {


	private long numeroDoPedido;
	private Cliente cliente;
	private List <ItemDePedido> itens;

	public Pedido(long numPedido){
		this.numeroDoPedido = numPedido;
	}
	
	public List<ItemDePedido> getItens() {
		return this.itens;
	}

	public void adicionaItem (ItemDePedido item){
		itens.add(item);
	}
	
	public long getNumeroDoPedido(){
		return	this.numeroDoPedido;
	}
	
	public void setNumeroDoPedido(long numPedido){
		this.numeroDoPedido = numPedido;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public void setCliente (Cliente client){
		this.cliente = client;
	}
	
}
