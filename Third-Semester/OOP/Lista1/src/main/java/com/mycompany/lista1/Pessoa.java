/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista1;

import java.util.*;

/**
 *
 * @author aluno
 * @param {int} idade - idade da Pessoa em centímetros
 */
public class Pessoa {
    
    private double peso, altura;
    private String nome;
    private int idade;
    
    public void Pessoa(double peso, double altura, String nome, int idade){}
    
    public void envelhecer(){
        
        crescer(0.5);
        
        this.idade += 1;
    }
    
    public void crescer(double tamanho){
    
        this.altura += (
            
            this.idade < 21
                ? tamanho
                : 0
        );
    }
    
    public void engordar(double peso){
    
        this.peso += peso;
    }
    
    public void emagrecer(double peso){
    
        this.peso -= peso;
    }
}
