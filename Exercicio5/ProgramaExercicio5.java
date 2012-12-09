
public class ProgramaExercicio5 {

	public static void main (String[]args){
		Agenda agenda = new Agenda();
		
		agenda.adicionaContato("pedro", "9999");
		try{
		agenda.pesquisaContato("pedro");
		}catch(ContatoInexistenteException e){
			System.err.println(e.getMessage());
		}try{
		agenda.pesquisaContato("jose");
		}catch(ContatoInexistenteException e){
			System.err.println(e.getMessage());
		}
	}
}
