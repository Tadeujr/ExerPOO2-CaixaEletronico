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
public class Saque {
    private double valor;

    public double getValor() {
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void retiradaValor(){
        NotasCem nCem =  new NotasCem();
        NotasCinquenta nCinq =  new NotasCinquenta();
        NotasVinte nV =  new NotasVinte();
        NotasCinco ncinco = new NotasCinco();        
        double aux = this.valor;;
        
        while(aux > 0){
            
            if(aux >= 100){
                aux = nCem.verificaValor(aux);
            }else if(aux >= 50){
                aux = nCinq.verificaValor(aux);
            }else if(aux >= 20){
                aux = nV.verificaValor(aux);
            }else if(aux >= 5 ){
                aux = ncinco.verificaValor(aux);
            
            }else{
                System.out.println("Sem notas para o valor de R$ " + aux);
                aux = 0;
            }
            
            
            
            
            
        }
    }
    
}
