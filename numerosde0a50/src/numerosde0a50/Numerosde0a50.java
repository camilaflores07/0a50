/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosde0a50;

import java.util.Random;




public class Numerosde0a50 {

    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random entrada = new Random();

       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt()%50;
        }

        
        System.out.println("Numeros aleatorios entre 0 y 50:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
            
            }
            
            
            
        }
      
      
    }
    

