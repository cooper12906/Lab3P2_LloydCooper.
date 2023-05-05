package e2p1_lloydcooper;

import java.util.ArrayList;
import java.util.*;

public class Libreria extends MenuGrafico {
    
    static ArrayList<String> titulos = new ArrayList<String>();
    static ArrayList<String> autores = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    
    
    public void menu(){
        int opcion = 0;
        do {
            System.out.println("Libreria");
        
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Listar");
            System.out.println("4. Buscar por titulo");
            System.out.println("5. Regresar al menu");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: 
                    scanner.nextLine(); // Consumimos el salto de linea
                    System.out.println("Ingrese el nombre del libro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el nombre del autor:");
                    String autor = scanner.nextLine();
                    
                    titulos.add(titulo);
                    autores.add(autor);
                    break;
                case 2:
                    System.out.println("Ingrese el indice del libro que desea eliminar:");
                    int indice = scanner.nextInt();
                    titulos.remove(indice);
                    autores.remove(indice);
                    System.out.println("El libro se ha eliminado correctamente");
                    break;
                case 3:
                    String Listar = " ";
                    for (int i = 0; i < titulos.size(); i++) {
                        Listar += "Libro: " + (i+1) + "\n" +
                                  "Titulo: " + titulos.get(i) + "\n" +
                                  "Autor: " + autores.get(i) + "\n";
                                  
                    }
                    System.out.println(Listar);
                    break;
                case 4:
                    String NombreLibro = " ";
                    System.out.println("Ingrese el titulo del libro:");
                    scanner.nextLine();
                    boolean si = false;
                    NombreLibro = scanner.nextLine();
                    for (int i = 0; i < titulos.size(); i++) {
                        if (titulos.get(i).equals(NombreLibro)) {
                            si = true;
                            break;
                        } 
                        
                    }
                    if (si) {
                        System.out.println("El libro si esta en el inventario");
                    } else {
                        System.out.println("El libro no esta en el inventario");
                    }
                    break;
                case 5:
                    
                    break;
                default:
            }
        } while (opcion != 6);
    } 
    public Libreria() {
        
    }
}
