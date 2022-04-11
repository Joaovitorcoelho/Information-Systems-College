package exec2;

public class CamaroteSuperior extends VIP {

	private double valorCamaroteSuperior;
	
	public CamaroteSuperior(double adicional, double valor, double valor_adicional) {
		
		super(valor, valor_adicional);
		
		this.valorCamaroteSuperior = super.getValor() + adicional;
	}
	
	public double getValor() {
		
		return this.valorCamaroteSuperior;
	}
}
