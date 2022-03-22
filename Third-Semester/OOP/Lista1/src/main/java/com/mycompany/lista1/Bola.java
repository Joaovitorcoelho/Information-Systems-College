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
public class Bola {
    
    private int circunferencia;
    private String cor, material;
    
    public void Bola(String cor, String material, int circunferencia){
    
        this.cor = cor;
        this.material = material;
        this.circunferencia = circunferencia;
    }
    
    public void setCor(String nova_cor){
    
        this.cor = nova_cor;
    }
    
    public void setMaterial(String novo_material){
    
        this.material = novo_material;
    }
    
    public void setCircunferencia(int nova_circunferencia){
    
        this.circunferencia = nova_circunferencia;
    }
    
    public String getCor(){
    
        return this.cor;
    }
    
    public String getMaterial(){
    
        return this.material;
    }
    
    public int getCircunferencia(){
        
        return this.circunferencia;
    }
}
