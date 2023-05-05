package proyecto_matrices_lloydcooper;

import java.util.*;
import javax.swing.JOptionPane;

public class Proyecto_Matrices_LloydCooper {
//lloyd cooper 12211056
    static Scanner read = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        
        int opcion = menu();
        switch (opcion) {
            case 1:
                int fila,columna;
                System.out.println("Ingrese las filas: ");
                fila = read.nextInt();
                System.out.println("Ingrese las columnas: ");
                columna = read.nextInt();
                int[][] numeros = new int[fila][columna];
                //Declaracion de la matriz
                numeros = llenado(fila, columna);
                imprimir(numeros);
                JOptionPane.showMessageDialog(null, imprimir_j(numeros));
                int sum = suma(numeros);
                System.out.println("La suma de los elementos de la matriz es : "+ sum);
                break;
                
            case 2:
                int filas,columnas;
                System.out.println("Ingrese las filas: ");
                filas = read.nextInt();
                System.out.println("Ingrese las columnas: ");
                columnas = read.nextInt();
                int[][] numero = new int[filas][columnas];
                numero = llenado(filas, columnas);
                imprimir(numero);
                System.out.println();
                JOptionPane.showMessageDialog(null, "La suma de las matrices es de: "+imprimir_j_array(sum_filas(numero)));
                break;
                
            case 3:
                System.out.println("Ingrese las filas: ");
                filas = read.nextInt();
                System.out.println("Ingrese las columnas: ");
                columnas = read.nextInt();
                int[][] numero3 = new int[filas][columnas];
                numero3 = llenado(filas, columnas);
                JOptionPane.showMessageDialog(null, imprimir_j(numero3));
                int[] columnasa = sumar_columnas(numero3);
                JOptionPane.showMessageDialog(null, imprimir_j_array(columnasa));
                break;
                
            case 4: 
                System.out.println("Ingrese las filas: ");
                filas = read.nextInt();
                System.out.println("Ingrese las columnas: ");
                columnas = read.nextInt();
                int[][] numero1 = new int[filas][columnas];
                numero1 = llenado(filas, columnas);
                imprimir(numero1);
                System.out.println();
                JOptionPane.showMessageDialog(null, "El numero mayor es: "+mayor(numero1));
                break;
                
            case 5:
                System.out.println("Ingrese las filas: ");
                filas = read.nextInt();
                System.out.println("Ingrese las columnas: ");
                columnas = read.nextInt();
                int[][] numero2 = new int[filas][columnas];
                numero2 = llenado(filas, columnas);
                imprimir(numero2);
                System.out.println();
                JOptionPane.showMessageDialog(null, imprimir_j_array(mayor_f(numero2)));
                break;
                
                
            case 6:
                
                break;
                
            case 7:
                break;
             
            case 8:

                break;
            case 9:
                
                    break;
            case 10:
                //ordenar una matriz de menor a mayor.
                break;
                
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static int[][] llenado(int fila, int columna) {
        int[][] temp = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                temp[i][j] = random.nextInt(100);
            }//Maneja las columnas
        }//Maneja las filas
        return temp;
    }

    public static void imprimir(int[][] enteros) {
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                System.out.print(enteros[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String imprimir_j(int matriz [][]){
        String matri = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matri+= "["+ matriz[i][j]+"]";
            }
            matri+="\n";
        }
        return matri;
    }
    
    public static String imprimir_j_array(int[] array){
        String arr = "";
        for (int i = 0; i < array.length; i++) {
            arr +=("["+array[i]+"]");
        }
        return arr;
    }

    public static int menu() {
        System.out.println("1.Sumar elementos");
        System.out.println("2.Suma de filas");
        System.out.println("3.Suma de columnas");
        System.out.println("4.Imprimir el mayor");
        System.out.println("5.Imprimir el mayor de cada fila");
        System.out.println("6.Imprimir el mayor de cada columna");
        System.out.println("Ingrese una opcion: ");
        int opcion = read.nextInt();
        return opcion;
    }

    //Hacer un metodo que recibe una matriz y retorne la suma de sus elementos
    public static int suma(int[][] matriz) {
        int acum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acum += matriz[i][j];
            }
        }
        return acum;
    }
    
    //Hacer un metodo que reciba una matriz y retorne un arreglo con la suma de cada fila
    
    public static int[] sum_filas(int[][] matriz){
        int[] temp = new int[matriz.length];
        int acum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acum += matriz[i][j];
            }//aqui termina el for interno 
            temp[i] = acum;
            acum = 0;
        }
        return temp;
    }
    
    public static void imprimir_arreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
    
    public static void imprimir_arreglom(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
  
    public static int mayor(int[][] matriz){
        int temp = 0;
        int acum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] >= acum){
                acum = matriz[i][j];
                }
            }//aqui termina el for interno 
            temp = acum;
        }
        return temp;
    }
     
    public static int[] mayor_f(int[][] matriz){
        int[] temp = new int[matriz.length];
        int acum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= acum){
                acum = matriz[i][j];
                }
            }//aqui termina el for interno 
            temp[i] = acum;
            acum = 0;
        }
        return temp;
    }
    
    //Hacer un metodo que recibe la matriz y retorna un arreglo con la suma de las columnas
    public static int[] sumar_columnas(int [][] matriz){
        int [] temp = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                temp[j] += matriz[i][j];
            }
        }
        return temp;
    }
    //hacer un metodo que reciba una matriz cuadrada y retorna una matriz con las sumas 
    //de la primera diagonal, segunda diagonal, triangulo superior y triangulo inferior
    public static int[][]sumadiagonales(int[][]matriz){
        int[][] temp = new int[2][2];
        int sum=0,sum2=0,sum3=0,sum4=0;
        String a = "";
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i==j) {
                      sum+= matriz[i][j]; 
                      a+="a1=="+matriz[i][j]+" ";
                    }
                    if (i + j == matriz.length-1) {
                        sum2+= matriz[i][j];
                        a+="a2=="+matriz[i][j]+" ";
                    }
                    if (i<j) {
                        sum3+=matriz[i][j];
                        a+="TS=="+matriz[i][j]+" ";
                    }
                    if (i>j) {
                        sum4+=matriz[i][j];
                        a+="TI=="+matriz[i][j]+" ";
                    }
                }
                
            }
            System.out.println("");
            temp[0][0]=sum;
            temp[0][1]=sum2;
            temp[1][0]=sum3;
            temp[1][1]=sum4;
        return temp;
    }
    
    public static boolean buscarNumeroEnMatriz(int[][] matriz, int numeroBuscado) {
    boolean encontrado = false;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == numeroBuscado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            break;
        }
    }
    return encontrado;
}
}
    

