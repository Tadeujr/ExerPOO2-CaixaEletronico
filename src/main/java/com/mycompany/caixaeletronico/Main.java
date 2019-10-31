/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.caixaeletronico;
import NotasDoCaixa.Saque;

/**
 *
 * @author tadeu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Saque sc = new Saque();
        sc.setValor(433.00);
        sc.retiradaValor();
    }
    
}
