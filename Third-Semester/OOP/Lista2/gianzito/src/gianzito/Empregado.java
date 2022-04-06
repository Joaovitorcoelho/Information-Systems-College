/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gianzito;

/**
 *
 * @author aluno
 */
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
    
    public float getSalario(){
    
        return this.salario;
    }
}
