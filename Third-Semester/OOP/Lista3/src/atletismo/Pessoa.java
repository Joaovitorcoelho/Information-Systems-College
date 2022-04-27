package atletismo;

public abstract class Pessoa {
    private String nome, endereco;
    
    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public abstract void imprimirDados();
}