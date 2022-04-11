package exec2;

public class VIP extends Ingresso {

	private double valorVIP;
	
	public VIP(double valor, double valor_adicional) {
		
		super(valor);
		
		this.valorVIP = super.getValor() + valor_adicional;
	}
	
	public double getValor() {
		
		return this.valorVIP;
	}
}
