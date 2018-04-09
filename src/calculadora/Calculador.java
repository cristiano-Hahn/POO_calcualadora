/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Crist
 */
public class Calculador {
    private float memoria;
    
    public Calculador(float valorInicial){
        memoria = valorInicial;
    };
    
    public void somar(float valor){  
       memoria += valor;
    };
    public void subtrair(float valor){  
       memoria -= valor;
    };
    public void multiplicar(float valor){  
       memoria *= valor;
    };
    public void dividir(float valor){  
       memoria *= valor;
    };
    public float getTotal(){
      return memoria;  
    }; 
    public void zerar(){
        memoria = 0;
    }
}
