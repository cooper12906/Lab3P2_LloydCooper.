package com.mycompany.examen_1_lloydcooper;

import java.util.Scanner;

public class Examen_1_LloydCooper {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        char resp = 's';
        int opcion;
        
        while (resp == 's' || resp == 'S') {
            System.out.println("Menu");
            System.out.println("1. Generador de clave ");
            System.out.println("2. Salida ");
            
            opcion = leer.nextInt();
            //Lloyd Cooper 12211056
            switch (opcion){
                case 1:
                System.out.print("Ingrese su nombre de usuario: ");
                leer.nextLine();
                String nombre = leer.next();

                System.out.print("Ingrese su código de dos dígitos: ");
                int codigo = leer.nextInt();
                String clave = "";
                int sumaDigitos = codigo / 10 + codigo % 10;

                for (int i = 0; i < nombre.length(); i++) {
                    char c = nombre.charAt(i);
                    if (esVocal(c)) {
                        clave += sumaDigitos;
                        sumaDigitos += codigo / 10 + codigo % 10;
                    } 
                    clave += c;
                }

                System.out.println("Clave resultante: " + clave);
                    break;
                case 2:
                    resp = 'n';
                    break;
                default:
            }
        }
    }
    /**
     * Verifica si un caracter es una vocal (mayuscula o minuscula).
     */
    
public static boolean esVocal(char c) {
    switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}