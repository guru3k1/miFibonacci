/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author TheGuru
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Utilidad para tomar valores por teclado
        
        long resultado; //variable que dara el resultado
        int numero= 0; //
        int uno= 1;
        
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        resultado = fibonacciArray(numero);
        if (resultado!= 0) {
            if (numero==1) {
                 System.out.println("El numero ingresado es  "+ numero+ " y  da como resultado "+uno);
            }
            if (numero==2) {
                 System.out.println("El numero ingresado es  "+ numero+ " y  da como resultado "+uno);
            }
            System.out.println("El numero ingresado es  "+ numero+ " y  da como resultado "+resultado);
        } else{ 
            System.out.println("El numero ingresado es  " +numero+ " y su numero Fibonacci es muy grande para representar" );
        }
    }
    
    static long fibonacciArray(int n){
        long[] secuencia = new long[n];
        if (n>2 && n<=92) {
            secuencia[0] = 1;
        secuencia[1] =1;
            System.out.println("-----------------");
        for (int i = 2; i < n; i++) {
            secuencia[i] = secuencia[i-1] + secuencia[i-2];
            System.out.println("|   " + (i+1) + "   |   "+ secuencia[i]+"   |");
        }
        
        }
        if (n>2 && n<=92) {
            return secuencia[n-1];
        }else if (n>92){
            return 0;  
        }else{
            return 1;
        }
        
        
    }
    
    
    
}
