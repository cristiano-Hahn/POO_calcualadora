/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    int opcao = 0;
    Scanner input = new Scanner(System.in);
    Calculador calculadora = new Calculador(0);

     do{
         System.out.println("Estado da memória: "+ calculadora.getTotal());
         System.out.println("Opções");
         System.out.println("(1) Somar");
         System.out.println("(2) Subtrair");
         System.out.println("(3) Multiplicar");
         System.out.println("(4) Dividir");
         System.out.println("(5) Limpar memória");
         System.out.println("(6) Sair do programa/n");
         System.out.println("Qual opção você deseja?");
         
         opcao = input.nextInt();
         
        if ((opcao > 0) && (opcao < 6)){
            System.out.println("Informe o valor!");
        } else if (opcao != 6) {
            System.out.println("Valor inválido!"); 
        };
         
         switch (opcao){
             case 1: 
                 calculadora.somar(input.nextFloat());
                 break;
             case 2: 
                 calculadora.subtrair(input.nextFloat());
                 break;
             case 3: 
                 calculadora.multiplicar(input.nextFloat());
                 break;
             case 4: 
                 calculadora.dividir(input.nextFloat());
                 break;
             case 5: 
                 calculadora.zerar();
                 break;
         }
     }while (opcao != 6);
    }
}
