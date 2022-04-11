package exec1;

public class Estagiario extends Empregado {
    
    private int descontos;
    
    public Estagiario(int cod, String nom, String mail, float sal, int qtd){
    
        super(cod, nom, mail, sal);
        this.descontos = 0 - qtd;
    }
    
    public void aumentoSalarial(int percentual){
    
        super.aumentoSalarial(percentual, this.descontos);
    }
}
