/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotasDoCaixa;

/**
 *
 * @author tadeu
 */
public class NotasVinte implements Notas{
    
    @Override
    public double verificaValor(double saque) {
        int cont = 0;
        
        while(saque >= 20){
            saque = saque - 20;
            cont++;
        }
        imprimeNota(cont);
        
        return saque;
    }

    @Override
    public void imprimeNota(int notas) {
           System.out.println(notas + " notas de 20,00 R$");
    }    
}
