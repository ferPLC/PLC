/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14.pkg03;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 */
public class Ej8 {
     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
       
        System.out.print("Ingrese el tamaño del cuadrado ");
        int num = leer.nextInt();
        int i, j;
       
        if(num >= 0 && num<=99) {
            
            for( i = 0; i < num; i++) {
                System.out.print("*");
            }
              System.out.println();
          
           
            for( i = 0; i < num-2; i++) {
                System.out.print("*");
               
                for( j = 0; j < num-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            
            for(i = 0; i < num; i++) {
                System.out.print("*");
            }
        
          System.out.println();            
 
    }



