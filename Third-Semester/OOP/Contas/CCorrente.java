class CCorrente {

    private int numero;
    private float saldo;
    private String cliente;
    
    public CCorrente (int num, float sal, String cli){
 
        this.numero = num;
        this.saldo = sal;
        this.cliente = cli;
    }

    public void creditar(double valor){
    
        this.saldo = this.saldo + valor;
    }

    public void debitar(double valor){
    
        if (valor <= this.saldo) {
    
            this.saldo = this.saldo - valor;
        }
        else {
    
            System.out.println("Saldo Insuficiente");
        }
    }

    public double getSaldo(){
        
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
    
        this.saldo = saldo;
    }
}
