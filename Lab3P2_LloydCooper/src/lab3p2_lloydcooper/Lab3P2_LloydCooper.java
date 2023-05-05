package lab3p2_lloydcooper;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_LloydCooper {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Productos> inventario = new ArrayList<Productos>();
    private static ArrayList<Compras> historialCompras = new ArrayList<Compras>();

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

        System.out.println("Ingrese el nombre de la comida:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio de la comida:");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de días que faltan para que la comida venza:");
        double vencido = scanner.nextDouble();

        Comidas comida = new Comidas(nombre, precio, vencido);
        inventario.add(comida);

        System.out.println("Comida agregada al inventario con éxito.");
    }

    private static void agregarBebida() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la bebida:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio de la bebida:");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese el tamaño de la bebida en mililitros:");
        int tam = scanner.nextInt();

        Bebidas bebida = new Bebidas(nombre, precio, tam);
        inventario.add(bebida);

        System.out.println("Bebida agregada al inventario con éxito.");
    }

    private static void modificarProducto() {
        
    }

    private static void eliminarProducto() {
        
    }

    private static void mostrarProductos() {
        
    }

    private static void generarCompra() {
        Compras compra = new Compras();
        boolean seguirComprando = true;

        while (seguirComprando) {
            mostrarProductos();
            
            System.out.println("Ingrese el número del producto que desea comprar:");
            int numeroProducto = scanner.nextInt();

            //Productos producto = listaProductos.get(numeroProducto - 1);
            //compra.agregarProducto(producto);

            System.out.println("El producto se ha agregado a la compra.");

            System.out.println("¿Desea seguir comprando? (S/N)");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("N")) {
                seguirComprando = false;
            }
        }

        System.out.println("Resumen de la compra:");
        for (Productos producto : compra.getListaProductos()) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio());
        }
        System.out.println("Total: " + compra.getTotal());
    }


    private static void listarCompras() {
        
    }
}
