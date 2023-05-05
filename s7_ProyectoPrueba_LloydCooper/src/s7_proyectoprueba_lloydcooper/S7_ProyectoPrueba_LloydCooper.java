
package s7_proyectoprueba_lloydcooper;

import java.util.Arrays;
public class S7_ProyectoPrueba_LloydCooper {

    /**
     * lloyd cooper 12211056
     */
    public static void main(String[] args) {
        int[][] matriz1 = {
            {3, 5, 9, 8},
            {8, 1, 7, 20},
            {15, 2, 36, 6},
            {20, 17, 25, 31}
        };
        int[][] matriz2 = {
            {3, 5, 20, 2, 5},
            {2, 6, 5, 5, 15},
            {5, 7, 6, 23, 20},
            {6, 8, 21, 2, 25}
        };
        
        // Probamos el método que modifica la matriz
        int[][] matrizModificada = asignarMenosUno(matriz1);
        imprimirMatriz(matrizModificada);
        
        matrizModificada = asignarMenosUno(matriz2);
        imprimirMatriz(matrizModificada);
        
        // Probamos el método que retorna los números mayores a 10
        int[] numerosMayoresA10 = numerosMayoresA(matriz1, 10);
        System.out.println(Arrays.toString(numerosMayoresA10));
        
        numerosMayoresA10 = numerosMayoresA(matriz2, 10);
        System.out.println(Arrays.toString(numerosMayoresA10));
    }
    
    public static int[][] asignarMenosUno(int[][] matriz) {
        int[][] matrizModificada = new int[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizModificada[i][j] = matriz[i][j] > 10 ? matriz[i][j] : -1;
            }
        }
        
        return matrizModificada;
    }
    
    public static int[] numerosMayoresA(int[][] matriz, int valor) {
        int contador = 0;
        
        // Contamos la cantidad de números mayores a valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > valor) {
                    contador++;
                }
            }
        }
        
        // Creamos un arreglo del tamaño adecuado
        int[] numerosMayores = new int[contador];
        contador = 0;
        
        // Agregamos los números mayores a valor al arreglo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > valor) {
                    numerosMayores[contador] = matriz[i][j];
                    contador++;
                }
            }
        }
        
        return numerosMayores;
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
}
