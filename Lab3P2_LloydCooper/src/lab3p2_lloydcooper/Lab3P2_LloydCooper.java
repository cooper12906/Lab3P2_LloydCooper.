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
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el nombre de la comida:");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese el precio de la comida:");
    double precio = scanner.nextDouble();

    System.out.println("¿La comida está vencida? (S/N)");
    String respuesta = scanner.next();
    boolean vencido = respuesta.equalsIgnoreCase("S");

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
        mostrarProductos();
        System.out.println("Ingrese el número del producto que desea modificar:");
        int numeroProducto = scanner.nextInt();

        if (numeroProducto > 0 && numeroProducto <= inventario.size()) {
            Productos producto = inventario.get(numeroProducto - 1);
            System.out.println("El producto seleccionado es: " + producto.toString());
            System.out.println("¿Qué desea modificar?");
            System.out.println("1. Nombre");
            System.out.println("2. Precio");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre del producto:");
                    String nuevoNombre = scanner.next();
                    producto.setNombre(nuevoNombre);
                    System.out.println("El nombre del producto ha sido modificado exitosamente.");
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo precio del producto:");
                    double nuevoPrecio = scanner.nextDouble();
                    producto.setPrecio(nuevoPrecio);
                    System.out.println("El precio del producto ha sido modificado exitosamente.");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        mostrarProductos();
        System.out.println("Ingrese el número del producto que desea eliminar:");
        int numeroProducto = scanner.nextInt();

        if (numeroProducto > 0 && numeroProducto <= inventario.size()) {
            Productos producto = inventario.get(numeroProducto - 1);
            inventario.remove(producto);
            System.out.println("El producto ha sido eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarProductos() {
    System.out.println("---- PRODUCTOS EN INVENTARIO ----");
    for (int i = 0; i < inventario.size(); i++) {
        Productos producto = inventario.get(i);
        System.out.println((i + 1) + ". " + producto.toString());
    }
    }

    private static void generarCompra() {
        Compras compra = new Compras();
        boolean seguirComprando = true;

        while (seguirComprando) {
            mostrarProductos();

            System.out.println("Ingrese el número del producto que desea comprar:");
            int numeroProducto = scanner.nextInt();

            Productos producto = inventario.get(numeroProducto - 1);
            compra.agregarProducto(producto);

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
    System.out.println("---- HISTORIAL DE COMPRAS ----");
    for (int i = 0; i < historialCompras.size(); i++) {
        Compras compra = historialCompras.get(i);
        System.out.println("Compra #" + (i + 1) + ": " + compra.toString());
    }
}
}
