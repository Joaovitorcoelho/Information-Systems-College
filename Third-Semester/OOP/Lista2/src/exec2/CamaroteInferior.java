package exec2;

public class CamaroteInferior extends VIP {

	private String localizacao;
	
	public CamaroteInferior(String localizacao, double valor, double valor_adicional) {
		
		super(valor, valor_adicional);
		
		this.localizacao = localizacao;
	}
	
	public String getLocalizacao() {
		
		return this.localizacao;
	}
}
