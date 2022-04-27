package contas;

public class Clientes {
    private String nome;
    private String cpf;

    public Clientes(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
}
