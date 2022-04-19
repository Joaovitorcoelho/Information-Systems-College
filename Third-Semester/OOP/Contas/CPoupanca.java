public class CPoupanca extends CCorrente {

    private float saldo_minimo;

    public CPoupanca(int num, float sal, String cli, float salmin) {
        
        super(num, sal, cli);
        this.saldo_minimo = salmin;
    }

    @Override
    public void debitar(float valor) {
        
        if (valor <= super.getSaldo()) {
           
            super.setSaldo(super.getSaldo() - valor);
        }
        if (super.getSaldo() < this.saldo_minimo) {
            
            this.saldo_minimo = super.getSaldo();
        }
        else {
           
            System.out.println("Saldo Insuficiente");
        }
        
        public void atualizarSaldo(){
        super.setSaldo((float) (super.getSaldo() + (this.saldo_minimo * 0.05)));
        this.saldo_minimo = super.getSaldo();
    }

    public float getSaldoMinimo(){
        
        return this.saldo_minimo;
    }
}
