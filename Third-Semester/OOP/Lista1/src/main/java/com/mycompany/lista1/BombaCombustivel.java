/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista1;

/**
 *
 */
public class BombaCombustivel {
 
    String tipo_combustivel;
    double valor_litro, quantidade_combustivel;
    
    public BombaCombustivel(String tipo_combustivel, double valor_litro, double quantidade_combustivel){
    
        this.tipo_combustivel = tipo_combustivel;
        this.valor_litro = valor_litro > 0 ? valor_litro : 0;
        this.quantidade_combustivel = quantidade_combustivel >= 0 ? quantidade_combustivel : 0;
    }
    
    public double abastecerPorValor(double valor){
    
        double litros_abastecidos = valor / this.valor_litro;
        this.quantidade_combustivel -= (
            
            (this.quantidade_combustivel - litros_abastecidos) >= 0
                ? litros_abastecidos
                : 0
        );
        
        return (this.quantidade_combustivel - litros_abastecidos) >= 0 ? litros_abastecidos : 0.00;
    }
    
    public double abastecerPorLitro(double litros_abastecidos){
    
        double valor_a_pagar = litros_abastecidos * this.valor_litro;

        this.quantidade_combustivel -= (
            
            (this.quantidade_combustivel - litros_abastecidos) >= 0
                ? litros_abastecidos
                : 0
        );
        
        
        return (this.quantidade_combustivel - litros_abastecidos) >= 0 ? valor_a_pagar : 0.00;
    }
    
    public void setValorLitro(double novo_valor){
    
        this.valor_litro = novo_valor > 0 ? novo_valor : this.valor_litro;
    }
    
    public void setTipoCombustivel(String novo_tipo){
        
        this.tipo_combustivel = novo_tipo;   
    }
    
    public void setQuantidadeCombustivel(double nova_qtd){
    
        this.quantidade_combustivel = nova_qtd >= 0 ? nova_qtd : this.quantidade_combustivel;
    }
    
    public double getValorLitro(){
    
        return this.valor_litro;
    }
    
    public String getTipoCombustivel(){
    
        return this.tipo_combustivel;
    }
    
    public double getQuantidadeCombustivel(){
    
        return this.quantidade_combustivel;
    }
}
