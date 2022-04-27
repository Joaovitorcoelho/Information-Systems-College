package contas;

class CEspecial extends CCorrente {
	private int limite;

	public CEspecial(int num, double sal, Clientes cli, int lim) {
		super(num, sal, cli);
		this.limite = lim;
	}
	
	@Override
	public void debitar(double valor) {
		if (valor <= (super.getSaldo() + this.limite)) {
			super.setSaldo(super.getSaldo() - valor);
		}
		else {
			System.out.print("Saldo Insuficiente");
		}
	}
}