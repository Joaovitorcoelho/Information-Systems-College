package exec5;

public class Rica extends Pessoa {

	private double dinheiro;
	
	public Rica(double dinheiro, String nome, int idade) {
		
		super(nome, idade);
		
		this.dinheiro = dinheiro;
	}
	
	public void fazCompras(double gastos) {
		
		this.dinheiro -= gastos;
	}
	
	public double getDinheiro() {
		
		return this.dinheiro;
	}
}
