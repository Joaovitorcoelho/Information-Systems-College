/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista1;

/**
 *
 * @author aluno
 */
public class Televisao {
    
    private int canal, volume;
    
    public void setCanal(int canal){
    
        this.canal = (
        
            canal > 0 && canal <= 250
                ? canal
                : this.canal
        );
    }
}
