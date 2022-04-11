package exec3;

public class Assistente extends Funcionario {

	private int matricula;
	
	public Assistente(int matricula, String nome, String email, String endereco, String telefone) {
		
		super(nome, email, endereco, telefone);
		
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		
		return this.matricula;
	}
}
