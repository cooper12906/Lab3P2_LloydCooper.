package s1_bienes_lloydcooper;

import java.util.Scanner;

public class S1_Bienes_LloydCooper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        while (true) {
            System.out.println("Menú de Inventario Elon Musk:");
            System.out.println("1. Agregar un bien al inventario.");
            System.out.println("2. Listar todo el inventario.");
            System.out.println("3. Buscar un bien en el inventario.");
            System.out.println("4. Modificar la fecha de expiración o el color de un bien.");
            System.out.println("5. Eliminar un bien.");
            System.out.println("6. Salir.");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar un bien al inventario
                    System.out.print("Ingrese el código del bien: ");
                    int codigo = scanner.nextInt();
                    // Resto de la información del bien
                    // ...
                    Bien nuevoBien = new Bien(codigo, descripcion, marca, color, fechaCompra, costo, valorLibros,
                            fechaExpiracion, ubicacionFisica, responsable);
                    inventario.agregarBien(nuevoBien);
                    break;
             case 2:
                 // Listar todo el inventario
                 inventario.listarInventario();
                 break;
             case 3:
                 // Buscar un bien en el inventario
                 System.out.print("Ingrese el código del bien a buscar: ");
                 codigo = scanner.nextInt();
                 inventario.buscarBien(codigo);
                 break;
             case 4:
                 // Modificar la fecha de expiración o el color de un bien
                 System.out.print("Ingrese el código del bien a modificar: ");
                 codigo = scanner.nextInt();
                 System.out.print("Ingrese el campo a modificar (fechaExpiracion/color): ");
                 String campo = scanner.next();
                 System.out.print("Ingrese el nuevo valor: ");
                 String valor = scanner.next();
                 inventario.modificarBien(codigo, campo, valor);
                 break;
             case 5:
                // Eliminar un bien del inventario
                System.out.print("Ingrese el código del bien a eliminar: ");
                codigo = scanner.nextInt();
                inventario.eliminarBien(codigo);
                break;
             case 6:
                 // Salir del programa
                System.out.println("¡Hasta luego! Gracias por utilizar el programa de administración de inventario de Elon Musk.");
                System.exit(0);
                break;
                default:
                System.out.println("Opción no válida. Por favor, ingrese una opción válida del 1 al 6.");
                break;
            }
        }
    }
}
