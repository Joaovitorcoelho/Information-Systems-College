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
