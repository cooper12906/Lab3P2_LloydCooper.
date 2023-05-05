package e2p1_lloydcooper;

import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class Gusanito extends MenuGrafico {
    
    private ArrayList<String> instrucciones;
    private char[][] tablero;
    private int gusX, gusY, manX, manY;
    
    
    public Gusanito(int N, int M) {
        instrucciones = new ArrayList<>();
        tablero = new char[N][M];
        Random random = new Random();
        gusX = random.nextInt(N);
        gusY = random.nextInt(M);
        manX = random.nextInt(N);
        manY = random.nextInt(M);
        while (manX == gusX && manY == gusY) {
            manX = random.nextInt(N);
            manY = random.nextInt(M);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == gusX && j == gusY) {
                    tablero[i][j] = '§';
                } else if (i == manX && j == manY) {
                    tablero[i][j] = 'Ó';
                } else {
                    tablero[i][j] = ' ';
                }
            }
        }
    }

    public void agregarInstruccion(String instruccion) {
        instrucciones.add(instruccion);
    }

    public void mover(String Instruccion) {
        for (String instruccion : instrucciones) {
            int magnitud = Integer.parseInt(instruccion.substring(0, instruccion.length()));
            char direccion = instruccion.charAt(instruccion.length() - 2);
            for (int i = 0; i < magnitud; i++) {
                if (direccion == 'U') {
                    if (gusX > 0) {
                        gusX--;
                    }
                } else if (direccion == 'D') {
                    if (gusX < tablero.length - 1) {
                        gusX++;
                    }
                } else if (direccion == 'L') {
                    if (gusY > 0) {
                        gusY--;
                    }
                } else if (direccion == 'R') {
                    if (gusY < tablero[0].length - 1) {
                        gusY++;
                    }
                }
                tablero[gusX][gusY] = '§';
                if (gusX == manX && gusY == manY) {
                    tablero[gusX][gusY] = '¡';
                    System.out.println("¡Lograste llegar a la manzana!");
                    return;
                }
                imprimirTablero();
            }
        }
    }

    public void imprimirTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
        
        
    }
    
    public void Llenar() {
        System.out.println("Tablero:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]= ' ';
            }
        }
    }
}
