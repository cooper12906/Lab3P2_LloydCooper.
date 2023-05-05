package com.mycompany.s3_figurass_lloydcooper;

import java.util.Scanner;

public class S3_Figurass_LloydCooper {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        char resp = 's';
        int opcion;
        
        while (resp == 's' || resp == 'S') {
            System.out.println("Menu");
            System.out.println("1. Cuadrado ");
            System.out.println("2. Cuadrado 2 caracteres ");
            System.out.println("3. Cuadrado vacio ");
            System.out.println("4. Triangulo con espacios ");
            System.out.println("5. Serie de numeros ");
            System.out.println("6. Salida ");
            
            opcion = leer.nextInt();
            // Lloyd Cooper 12211056
            switch (opcion){
                case 1:
                    int fila, columna;
                    System.out.println("Ingrese el tamano de la fila");
                    fila = leer.nextInt();
                    System.out.println("Ingrese el tamano de la columna");
                    columna = leer.nextInt(); 
                    for (int i = 1; i <= fila; i++) {
                        for (int j = 1; j <= columna; j++) {
                            System.out.print('*');
                        } // fin del for interno
                        System.out.println();
                    } // fin del for externo
                case 2:
                    System.out.println("Ingrese el tamano de la fila");
                    fila = leer.nextInt();
                    System.out.println("Ingrese el tamano de la columna");
                    columna = leer.nextInt();
                    
                    while (fila % 2 != 0 || columna % 2 != 0 || fila != columna) {
                        System.out.println(" Dato incorrecto, los digitos ingresados deben ser los mismos y deben ser pares ");
                        System.out.println("Ingrese el tamano de la fila");
                        fila = leer.nextInt();
                        System.out.println("Ingrese el tamano de la columna");
                        columna = leer.nextInt();
                    }
                    for (int i = 1; i <= fila; i++) {
                        for (int j = 1; j <= columna; j++) {
                            if (i % 2 == 0 ) {
                                System.out.print('/');  
                            } else {
                                System.out.print("*");
                            }
                        } // fin del for interno
                        System.out.println();
                    } // fin del for externo
                    break;
                case 3:
                    System.out.println("Ingrese el tamano de la fila");
                    fila = leer.nextInt();
                    System.out.println("Ingrese el tamano de la columna");
                    columna = leer.nextInt();
                    while (fila % 2 != 0 || columna % 2 != 0 || fila != columna) {
                        System.out.println(" Dato incorrecto ");
                        System.out.println("Ingrese el tamano de la fila");
                        fila = leer.nextInt();
                        System.out.println("Ingrese el tamano de la columna");
                        columna = leer.nextInt();
                    }
                    for (int i = 0; i < fila; i++) {
                        for (int j = 0; j < columna; j++) {
                            if (i == 0 || i == fila - 1 || j == 0 || j == columna - 1) { 
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }  
                    break;
                case 4:
                    System.out.println("Ingrese el tamano del triangulo: ");
                    int tam;
                    tam = leer.nextInt();
                    int c = tam;
                    for (int i = 1; i <= tam; i++){
                        for (int j = c; j > 0; j --){  
                            System.out.print("-");
                        }
                        c--;
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 2; i <= 10; i++) {
                        System.out.print("" + i);
                        for (int j = 0; j <= i; j++) {
                            System.out.print("" + j);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    int a = 3;
                    int b = 2;
                    c = 3;
                    for (int i = 1; i <= a; i++) 
                    {
                        for (int j = 1; j <= b; j++) 
                        {
                            for (int k = 1; k <= c; k++) 
                                System.out.print('*');
                            System.out.println();
                            
                        }
                        System.out.println();
                    }
                    break;
                default:
       
            }//fin switch
        }//fin while
    }//fin public static void
} //fin public class
// cuadrado, asterisco y contrapleca, cuadrado vacio
// Lloyd Cooper 12211056
