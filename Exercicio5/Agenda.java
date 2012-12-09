import java.util.ArrayList;
import java.util.List;


public class Agenda implements AgendaIf{
	
	private List <Contato> contatos ;
	
	public Agenda(){
		this.contatos = new ArrayList<Contato>();
	}

	@Override
	public void adicionaContato(String nome, String tele) {
		contatos.add(new Contato(nome,tele));
		}

	@Override
	public void removeContato(String nome) throws ContatoInexistenteException {
		
			for (Contato c : contatos){
				if (c.getNome() == nome){
					contatos.remove(c);
				}
			}
		
			throw new ContatoInexistenteException("Contato Inexistente!");
	}
		
	

	@Override
	public Contato pesquisaContato(String nome) throws ContatoInexistenteException {
		
		for (Contato c: contatos){
			if(c.getNome().equals(nome)){
				return c;
			}
			
		}
		throw new ContatoInexistenteException("Contato Inexistente!");
		
	}		
		
		
	}

	

