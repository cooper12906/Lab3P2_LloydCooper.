package com.mycompany.lab3p1_lloydcooper;

import java.util.Scanner;

public class Lab3P1_LloydCooper {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        char resp = 's';
        int opcion;
        
        while (resp == 's' || resp == 'S') {
          System.out.println("Menu");
            System.out.println("1. Triangulo ");
            System.out.println("2. Calculando PI ");
            System.out.println("3. Construyendo casas ");
            System.out.println("4. Salida ");
            
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.print("Ingrese un entero positivo (entre 4 y 16): ");
                        int n = leer.nextInt();

                        while (n < 4 || n > 16) {
                          System.out.println("El numero debe estar entre 4 y 16");
                          System.out.print("Ingrese un entero positivo (entre 4 y 16): ");
                          n = leer.nextInt();
                        }

                        System.out.print("Ingrese un caracter: ");
                        char c = leer.next().charAt(0);

                        for (int i = 1; i <= n; i++) {
                        for (int j = 0; j < i - 1; j++) {
                          System.out.print(" ");
                        }
                        for (int j = n - i + 1; j > 0; j--) {
                          System.out.print(c);
                        }
                        System.out.println();
                    } 
                    break;
                case 2:
                    System.out.println("Sumatoria");   

                    System.out.print("Ingrese un entero positivo: ");
                        int k = leer.nextInt();

                        while (k < 0) {
                          System.out.println("El número debe ser positivo");
                          System.out.print("Ingrese un entero positivo: ");
                          k = leer.nextInt();
                        }

                        double sum = 0.0;
                        for (int i = 0; i <= k; i++) {
                          sum += Math.pow(-1, i) / (2 * i + 1); 
                        }
                        double pi = 4 * sum; 
                        System.out.println("Aproximacion a pi: " + pi);  
                    break;
                case 3:
                     System.out.print("Ingrese el tamaño de la figura (debe ser mayor a 4): ");
                    n = leer.nextInt();
                    while (n <= 4) {
                      System.out.println("El tamaño debe ser mayor que 4.");
                      System.out.print("Ingrese el tamaño de la figura (debe ser mayor a 4): ");
                      n = leer.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                          System.out.print(" ");
                        }
                        for (int j = 0; j <= i * 2; j++) {
                          System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < n*2; i++) {
                      for (int j = 0; j < n*2; j++) {
                        System.out.print("+");
                      }
                      System.out.println();
                    }
                    break;
                case 4:
                    resp = 'n';
                    break;
                default:
            }
        }
    }
}
