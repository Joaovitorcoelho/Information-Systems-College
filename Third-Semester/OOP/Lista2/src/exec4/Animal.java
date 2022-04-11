package exec4;

public class Animal {

	private String nome, raca;
	
	public Animal(String nome, String raca) {
		
		this.nome = nome;
		this.raca = raca;
	}
	
	public String caminha() {
		
		return "caminhando...";
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public String getRaca() {
		
		return this.raca;
	}
}
