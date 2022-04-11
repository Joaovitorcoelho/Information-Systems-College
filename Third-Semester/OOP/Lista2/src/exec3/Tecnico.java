package exec3;

public class Tecnico extends Assistente {

	private double bonus_salarial;
	
	public Tecnico(double bns_sal, int matricula, String nome, String email, String endereco, String telefone) {
		
		super(matricula, nome, email, endereco, telefone);
		
		this.bonus_salarial = bns_sal;
	}
	
	public double getBonuSalarial() {
		
		return this.bonus_salarial;
	}
}
