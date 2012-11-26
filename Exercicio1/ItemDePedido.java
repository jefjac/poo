
public class ItemDePedido {

	private int quantidade;
	private long codProduto;
	private double valorUnitario;
	
	public ItemDePedido (int quant, long codProdut, double valorUnit){
		this.quantidade = quant;
		this.valorUnitario = valorUnit;
		this.codProduto = codProdut;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public long getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(long codProduto) {
		this.codProduto = codProduto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	
}
