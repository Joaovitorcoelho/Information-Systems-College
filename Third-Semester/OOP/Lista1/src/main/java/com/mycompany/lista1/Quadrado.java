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
public class Quadrado {
    
    private int tamanho_lados;
    
    public void Quadrado(int novoTamanho){
    
        setTamanhoLados(novoTamanho);
    }
    
    public int calcularArea(){
    
        return this.tamanho_lados^2;
    }
    
    public void setTamanhoLados(int novoTamanho){
    
        this.tamanho_lados = novoTamanho;
    }
    
    public int getTamanhoLados(){
    
        return this.tamanho_lados;
    }
}
