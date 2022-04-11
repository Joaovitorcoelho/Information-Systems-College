package exec1;

public class Empregado {

	private String nome, email;
    private float salario;
    private int codigo;
    
    public Empregado(int cod, String nom, String mail, float sal){
    
        this.codigo = cod;
        this.nome = nom;
        this.email = mail;
        this.salario = sal;
    }
    
    public void aumentoSalarial(int percentual, float beneficio){
        
        this.salario += (this.salario*(percentual/100)) + beneficio;
    }
    
    public String getNome() {
    	
    	return this.nome;
    }
    
    public String getEmail() {
    	
    	return this.email;
    }
    
    public float getSalario(){
    
        return this.salario;
    }

    public int getCodigo() {
    	
    	return this.codigo;
    }
}
