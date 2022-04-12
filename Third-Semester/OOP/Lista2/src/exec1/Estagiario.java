package exec1;

public class Estagiario extends Empregado {
    
    private int descontos;
    
    public Estagiario(int cod, String nom, String mail, float sal, int desc){
    
        super(cod, nom, mail, sal);
        this.descontos = desc;
    }
    
    public void aumentoSalarial(float percentual){
    
        super.aumentoSalarial(percentual, 0 - this.descontos);
    }
}
