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
public class NotasCem implements Notas{

    @Override
    public double verificaValor(double saque) {
        int cont = 0;
        
        while(saque >= 100){
            saque = saque - 100;
            cont++;
        }
        imprimeNota(cont);
        return saque;
    }

    @Override
    public void imprimeNota(int notas) {
           System.out.println(notas + " notas de 100,00 R$");
    }
    
    
    

}
