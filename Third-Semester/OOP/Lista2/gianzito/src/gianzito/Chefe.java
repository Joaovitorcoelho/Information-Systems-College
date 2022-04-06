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
