package exec2;

public class VIP extends Ingresso {

	private double valor;
	
	public VIP(double valor, double valor_adicional) {
		
		super(valor);
		
		this.valor = super.getValor() + valor_adicional;
	}
}
