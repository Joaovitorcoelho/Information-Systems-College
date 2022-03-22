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
    
    private double tamanho_lados;
    
    public void Quadrado(double novoTamanho){
    
        setTamanhoLados(novoTamanho);
    }
    
    public double calcularArea(){
    
        return this.tamanho_lados * this.tamanho_lados;
    }
    
    public void setTamanhoLados(double novoTamanho){
    
        this.tamanho_lados = novoTamanho;
    }
    
    public double getTamanhoLados(){
    
        return this.tamanho_lados;
    }
}
