
public interface AgendaIf {

	public void adicionaContato(String nome, String tele);
	public void removeContato(String nome) throws ContatoInexistenteException;
	public Contato pesquisaContato (String nome) throws ContatoInexistenteException;
	
}
