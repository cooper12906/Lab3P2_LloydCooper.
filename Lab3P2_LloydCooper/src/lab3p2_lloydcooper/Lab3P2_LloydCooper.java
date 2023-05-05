package lab3p2_lloydcooper;

import java.util.Scanner;

public class Lab3P2_LloydCooper {
    private static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarComida();
                    break;
                case 2:
                    agregarBebida();
                    break;
                case 3:
                    modificarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    mostrarProductos();
                    break;
                case 6:
                    generarCompra();
                    break;
                case 7:
                    listarCompras();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 8);
    }

    private static void mostrarMenu() {
        System.out.println("---- MENU ----");
        System.out.println("1. Agregar Comida");
        System.out.println("2. Agregar Bebida");
        System.out.println("3. Modificar Producto");
        System.out.println("4. Eliminar Producto");
        System.out.println("5. Mostrar Productos");
        System.out.println("6. Generar Compra");
        System.out.println("7. Listar Compras");
        System.out.println("8. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void agregarComida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la comida: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio de la comida: ");
        double precio = scanner.nextDouble();
        System.out.println("");
    }

    private static void agregarBebida() {
        // Lógica para agregar una bebida al inventario
    }

    private static void modificarProducto() {
        // Lógica para modificar un producto en el inventario
    }

    private static void eliminarProducto() {
        // Lógica para eliminar un producto del inventario
    }

    private static void mostrarProductos() {
        // Lógica para mostrar los productos en el inventario
    }

    private static void generarCompra() {
        // Lógica para generar una compra
    }

    private static void listarCompras() {
        // Lógica para listar las compras realizadas
    }
}
