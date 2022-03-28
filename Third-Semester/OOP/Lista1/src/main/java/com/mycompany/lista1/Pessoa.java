/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista1;

/**
 *
 * @author aluno
 * @param {int} idade - idade da Pessoa em centímetros
 */
public class Pessoa {
    
    private double peso, altura;
    private String nome;
    private int idade;
    
    public Pessoa(double peso, double altura, String nome, int idade){
    
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
    }
    
    public void envelhecer(){
    
        this.idade += 1;
        
        crescer(0.5);
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
