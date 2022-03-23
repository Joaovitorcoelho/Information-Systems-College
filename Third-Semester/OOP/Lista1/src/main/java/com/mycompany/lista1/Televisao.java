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
    
    public void Televisao(){
    
        this.canal = 1;
        this.volume = 50;
    }
    
    public void aumentarVolume(){
    
        this.volume += (
        
            volume < 100
                ? 1
                : 0
        );
    }
    
    public void diminuirVolume(){
    
        this.volume -= (
        
            volume > 0
                ? 1
                : 0
        );
    }
    
    public void setCanal(int canal){
    
        this.canal = (
        
            canal > 0 && canal < 251
                ? canal
                : this.canal
        );
    }
}
