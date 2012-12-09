import java.util.Scanner;


public class ProgramaPrincipal {

	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
	
		int quant=0;
		long codproduto=-1;
		double valorUnitario=0.0;
		double valorTotal = 0;
		Pedido pedido = new Pedido(1);
		
		while((codproduto = sc.nextLong())!=0){
			quant = sc.nextInt();
			valorUnitario = sc.nextDouble();
			ItemDePedido item1 = new ItemDePedido(quant,codproduto,valorUnitario);
			pedido.adicionaItem(item1);
			valorTotal += + quant * valorUnitario;
		}
		
		System.out.println("Valor Total : R$ "+valorTotal);
	}
}
