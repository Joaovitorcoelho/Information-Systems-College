class CEspecial extends CCorrente {

  private int limite;

  public CEspecial(int num, double sal, String cli, int lim) {
  
    super(num, sal, cli);
    this.limite = lim;
  }

  @Override
  public void debitar(double valor) {
    
    if (valor <=(super.get_saldo() + this.limite)) {
    
      super.set_saldo(super.get_saldo() - valor);
    }
    else {
      
      System.out.print("Saldo Insuficiente");
    }
  }
}
