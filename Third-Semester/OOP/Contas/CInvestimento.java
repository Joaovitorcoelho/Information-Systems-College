import java.util.*;

public class CInvestimento extends CCorrente {

    private int dia_investimento;
    private int periodo;
    
    public CInvestimento(int num, float sal, Clientes cli, int dinv, int per) {
        
        super(num, sal, cli);
        this.dia_investimento = dinv;
        this.periodo = per;
    }
    
    public void atualizarSaldo() {
        
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
        
        if (dia == (this.dia_investimento+periodo)) {
        
            super.setSaldo((float) (super.getSaldo() * 1.20));
        }
        else {
        
            System.out.println("Ainda n dia do investimento");
        }
    }
}
