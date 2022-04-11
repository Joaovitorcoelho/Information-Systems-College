package exec3;

public class Funcionario {

	private String nome, email, endereco, telefone;

	public Funcionario(String nome, String email, String endereco, String telefone) {
		
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone= telefone;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public String getEmail() {
		
		return this.email;
	}
	
	public String getEndereco() {
		
		return this.endereco;
	}
	
	public String getTelefone() {
		
		return this.telefone;
	}
}
