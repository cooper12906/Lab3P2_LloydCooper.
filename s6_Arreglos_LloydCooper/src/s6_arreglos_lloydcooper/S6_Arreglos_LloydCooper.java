
package s6_arreglos_lloydcooper;

import java.util.*;

public class S6_Arreglos_LloydCooper {

    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();
    
    public static void menu(){
        System.out.println("----MENU----");
        System.out.println("1. Pares e impares");
        System.out.println("2. ");
    }
    public static void main(String[] args) {
        char resp = 's';
        do {
            menu();
            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el size del arreglo: ");
                    int tam = leer.nextInt();
                    int[] numeros = new int[tam];
                    numeros = llenado(tam);
                    impresion(numeros);
                    break;
                case 2:
                    int tamaño1 = getTamaño("primer");
                    int tamaño2 = getTamaño("segundo");
                    int[] arr1 = getArreglo(tamaño1);
                    int[] arr2 = getArreglo(tamaño2);
                    int[] intercalado = intercalar(opcion, arr1, arr2);
                    System.out.print("Arreglo intercalado: ");
                    for (int i = 0; i < intercalado.length; i++) {
                        System.out.print(intercalado[i] + " ");
                    }
                    System.out.println();
                    break;
            }
        } while (resp == 's' || resp == 'S');
    }
    
    public static int[] llenado(int size) {
        int[] temp = new int[size];
        
        for (int i = 0; i < size; i++) {
            temp[i] = leer.nextInt(51);
        }
        return temp;
    }
    
    public static void impresion(int[] array){
        
    }
    
    public static int[] ParImpar(int[] array){
        int[] temporal = new int [2];
        int par = 0;
        int impar = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        temporal[0] = par;
        temporal[1] = impar;
        
        return temporal;
    }
    
    public static int getTamaño(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del " + nombre + " arreglo: ");
        return sc.nextInt();
    }

    public static int[] getArreglo(int tamaño) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los elementos del arreglo separados por espacios: ");
        String[] arrStr = sc.nextLine().split(" ");
        int[] arr = new int[tamaño];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        return arr;
    }

    public static int[] intercalar(int opcion, int[] arr1, int[] arr2) {
        int[] intercalado;
        if (arr1.length == arr2.length) {
            intercalado = intercalarTipoA(arr1, arr2);
        } else if (arr1.length > arr2.length) {
            intercalado = intercalarTipoB(arr1, arr2);
        } else {
            intercalado = intercalarTipoC(arr1, arr2);
        }
        return intercalado;
    }

    public static int[] intercalarTipoA(int[] arr1, int[] arr2) {
        int[] intercalado = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            intercalado[j++] = arr1[i];
            intercalado[j++] = arr2[i];
        }
        return intercalado;
    }

    public static int[] intercalarTipoB(int[] arr1, int[] arr2) {
        
    }
}
