package contas;

public class CPoupanca extends CCorrente {

    private double saldo_minimo;

    public CPoupanca(int num, float sal, String cli, float salmin) {
        
        super(num, sal, cli);
        this.saldo_minimo = salmin;
    }

    @Override
    public void debitar(double valor) {
        
        if (valor <= super.getSaldo()) {
           
            super.setSaldo(super.getSaldo() - valor);
        }
        
        if (super.getSaldo() < this.saldo_minimo) {
            
            this.saldo_minimo = super.getSaldo();
        }
        else {
           
            System.out.println("Saldo Insuficiente");
        }
    }
        
    public void atualizarSaldo(){
    
    	super.setSaldo((double) (super.getSaldo() + (this.saldo_minimo * 0.05)));
        this.saldo_minimo = super.getSaldo();
    }

    public double getSaldoMinimo(){
        
        return this.saldo_minimo;
    }
}