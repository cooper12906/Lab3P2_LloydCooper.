package com.mycompany.s4_cadena_lloydcooper;

import java.util.Scanner;
            
public class S4_Cadena_LloydCooper {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        char resp = 's';
        int opcion;
        
        while (resp == 's' || resp == 'S') {
            System.out.println("Menu");
            System.out.println("1.  ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("Salida");
            
            opcion = leer.nextInt();
            
            // Lloyd Cooper 12211056
            
            switch (opcion){
                case 1:
                    String palabra;
                    char letra;
                    int contador = 0;
                    int contador2 = 0;
                    int contador3 = 0;
                    int num = 0;
                    System.out.println("Ingrese una palabra: ");
                    palabra = leer.next().toLowerCase();
                    System.out.println("La palabra es: " + palabra);
                    for (int i = 0; i < palabra.length(); i++) {
                        letra = palabra.charAt(i);
                        System.out.println(letra);
                        switch (letra){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u': 
                            contador++;
                            break;
                           default: 
                        }
                        if (num <= 122 && num >= 97) {
                            contador2++;
                        } else {
                            contador3++;
                        }
                        break;
                    }
                    System.out.println("Cantidad de vocales: "+ contador);
                    System.out.println("Cantidad de consonantes: "+ contador2);
                    System.out.println("Cantidad de otros caracteres: "+ contador3);
                    break;
                case 2:
                    String acumulador = " ";
                    System.out.println("Ingrese una palabra: ");
                    String Palabra = leer.next();
                    
                    //conversion
                    for (int i = 0; i < Palabra.length();i++){
                        char Letra = Palabra.charAt(i);
                        int numletra = Letra;
                        if (numletra > 48 && numletra < 57) {
                            acumulador = acumulador + Letra;
                        }   
                    }
                    int suma = 0;
                        for (int i = 0; i < acumulador.length(); i++) {
                            char caracter = acumulador.charAt(i);
                            int numero = Character.getNumericValue(caracter);
                            suma += numero;
                        }
                    System.out.println("Acumulador: "+acumulador);
                    System.out.println("Suma: "+suma);
                    System.out.println("Palabra: "+Palabra);
                    break;
                case 3:
                    boolean p = false;
                    System.out.println("Ingrese una palabra: ");
                    String word = leer.next();
                    System.out.println("Ingrese un caracter: ");
                    char Letra = leer.next().charAt(0);
                    System.out.println("Ingrese un número: ");
                    num = leer.nextInt();

                    int pos = 0;
                    for (int i = 0; i < word.length(); i++) {
                        char letter = word.charAt(i);
                        if (letter == Letra) {
                            p = true;
                            pos = i;
                            break;
                        }
                    }        
                    System.out.println(p);
                    System.out.println("La posicion es: " + pos);
                    if (p) {
                    int newPos = (pos + num);
                        System.out.println("La nueva posicion es:"+ newPos);
                    StringBuilder sb = new StringBuilder(word);
                    char temp = sb.charAt(newPos);
                    sb.setCharAt(newPos, Letra);
                    for (int i = newPos; i != pos; i = (i + 1) % word.length()) {
                        int next = (i + 1) % word.length();
                        char c = sb.charAt(next);
                        sb.setCharAt(next, temp);
                        temp = c;
                    }
                        System.out.println("La nueva palabra es: " + sb.toString());
                    } else {
                        System.out.println("No se encontró el carácter en la palabra.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese una cadena");
                    leer.nextLine();
                    String word1 = leer.nextLine();
                    System.out.println("La subcadena es: ");
                    String word2 = leer.nextLine();
                    System.out.println(word2.substring(5,word2.length()));
                    break;
                case 5:
                    resp = 'n';
                    break;
                default:
            } 
        }    
    }
}