package exec3;

public class Administrativo extends Assistente {

	private double adicional_noturno;
	private boolean turno; // false = noite, true = dia
	
	public Administrativo(boolean turno, double ad_notr, int matricula, String nome, String email, String endereco, String telefone) {
		
		super(matricula, nome, email, endereco, telefone);
		
		this.turno = turno;
		this.adicional_noturno = (
				
			this.turno
				? 0.00
				: ad_notr
		);
	}
	
	public double getAdicionalNoturno() {
		
		return this.adicional_noturno;
	}
	
	public String getTurno() {
		
		return (
				
			this.turno
				? "diurno"
				: "noturno"
		);
	}
}
