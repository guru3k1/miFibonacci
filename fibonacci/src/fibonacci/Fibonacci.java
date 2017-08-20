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
        Scanner sc = new Scanner(System.in);
        int opcion;
        int numero;
        do {
            //Menu
            System.out.println("\nCalculemos la Sucesion de Fibonacci");
            do {
                System.out.println("Ingrese un numero mayor a 0");
                numero = sc.nextInt();
                if (numero < 1) {
                    System.out.println("ERROR!!! El numero no es mayor a 0\n");
                }
            } while (numero < 1);

            if (numero < 1) {

            }
            System.out.println("\nIngrese la forma de calcular y presione enter\n");
            System.out.println("1) Tradicional (mas lento por la recursividad)");
            System.out.println("2) Con array");
            System.out.println("Para salir ingrese 0");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Espere!!!");
                    long resultado = originalFibonacci(numero);
                    System.out.println("===============================");
                    System.out.println("El resultado para " + numero + " es " + resultado);
                    System.out.println("===============================");
                    break;
                case 2:
                    mifibonacci(numero);
                    break;
            }
        } while (opcion != 0);

    }

    //Metodo de miFibonacci
    private static long fibonacciArray(int n) {
        long[] secuencia = new long[n]; //Creamos un array del tamaño necesario
        if (n > 2 && n <= 92) { //pongo el limite de 92 dado que al ingresar el valor 93, se excede la capacidad de long
            secuencia[0] = 1; //Asigno el valor 1 al 1
            secuencia[1] = 1; //Asigno el valor 1 al 2

            //Tabla de resultados
            System.out.println("-----------------");
            System.out.println("|   " + 1 + "   |   " + 1 + "   |");
            System.out.println("|   " + 2 + "   |   " + 1 + "   |");

            //Relleno la tabla
            for (int i = 2; i < n; i++) {
                secuencia[i] = secuencia[i - 1] + secuencia[i - 2];
                System.out.println("|   " + (i + 1) + "   |   " + secuencia[i] + "   |");
            }
        }
        if (n > 2 && n <= 92) {
            return secuencia[n - 1]; //Devuelvo el numero
        } else if (n > 92) {
            return 0; //Devulevo un valor controlado para los valores superiores a 92
        } else {
            return 1; //Devuelvo el valor 1 para 1 y para 2
        }
    }

    // Metodo para mostrar el resultado de miFibonacci
    private static void mifibonacci(int numero) {
        long resultado;
        int uno = 1;
        resultado = fibonacciArray(numero);
        if (resultado != 0) {
            if (numero == 1) {
                System.out.println("El numero ingresado es  " + numero + " y  da como resultado " + uno);
            }
            if (numero == 2) {
                System.out.println("El numero ingresado es  " + numero + " y  da como resultado " + uno);
            }
            System.out.println("El numero ingresado es  " + numero + " y  da como resultado " + resultado);
        } else {
            System.out.println("El numero ingresado es  " + numero + " y su numero Fibonacci es muy grande para representar");
        }
    }

    private static long originalFibonacci(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return originalFibonacci(numero - 1) + originalFibonacci(numero - 2);
        }

    }

}
