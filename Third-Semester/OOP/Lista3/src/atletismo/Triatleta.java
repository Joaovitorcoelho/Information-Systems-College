package atletismo;

public class Triatleta extends Pessoa implements Atleta, Ciclista, Corredor, Nadador{
    public Triatleta(String nome, String endereco){
    	super(nome, endereco);
    }
    
    @Override
    public void pedalar() {
        System.out.println(this.getNome() + " está pedalando");
    }
    
    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo");
    }
    
    @Override
    public void aquecer() {
        System.out.println(this.getNome() + " está aquecendo");
    }
    
    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando");
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome do atleta: "+super.getNome()+"\n" + "Endereço do atleta:" + super.getEndereco());
    }
}