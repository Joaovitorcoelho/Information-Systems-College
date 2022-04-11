package exec1;

public class Chefe extends Empregado {
	
	private float beneficio;
    
    public Chefe(int cod, String nom, String mail, float sal, float ben){
    
        super(cod, nom, mail, sal);
        this.beneficio = ben;
    }
    
    public void aumentoSalarial(int percentual){
    
        super.aumentoSalarial(percentual, this.beneficio);
    }
}
