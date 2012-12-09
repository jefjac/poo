package br.ufpb.sistemaPedidos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class GravadorDePedidos {

	public List <Pedido> lePedido() throws IOException, ClassNotFoundException {
		ObjectInputStream input = null;
		try{
			input = new ObjectInputStream(new FileInputStream("pedidos.txt"));
			return ((List<Pedido>) input.readObject());
		}catch (FileNotFoundException e){
			throw new IOException("Arquivo não encontrado", e);
		}catch (IOException e){
			throw new IOException(e);
		}catch (ClassNotFoundException e){
			throw new IOException ("A Classe que esta tentando gravar não existe", e);
		}
	}
	
	public void gravaPedidos (List <Pedido>pedidos)throws IOException{
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("pedidos.txt"));
			out.writeObject(pedidos);
		}catch (FileNotFoundException e){
			throw new IOException("Arquivo não encontrado");
		}catch (IOException e){
			throw new IOException(e);
		}
		
	}
}
