package lab2p2_lloydcooper;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab2P2_LloydCooper {
    private static ArrayList<Pinturas> listaPinturas = new ArrayList<>();
    private static ArrayList<Esculturas> listaEsculturas = new ArrayList<>();
    private static ArrayList<Fotografias> listaFotografias = new ArrayList<>();
    private static ArrayList<Escritos> listaEscritos = new ArrayList<>();
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private static Usuario usuarioActual;

    public static void main(String[] args) {
        // Agregar usuarios
        listaUsuarios.add(new Usuario("admin", "admin", true));
        listaUsuarios.add(new Usuario("user", "user", false));

        // Iniciar sesión
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de inventario de obras de arte.");
        System.out.print("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();
        usuarioActual = iniciarSesion(username, password);

        // Mostrar opciones del menú
        if (usuarioActual == null) {
            System.out.println("Nombre de usuario o contraseña incorrectos. Adiós.");
        } else if (usuarioActual.isPersonalAdmin()) {
            System.out.println("Bienvenido, " + usuarioActual.getNombreUsuario() + ".");
            mostrarMenuAdmin();
        } else {
            System.out.println("Bienvenido, " + usuarioActual.getNombreUsuario() + ".");
            mostrarMenuUsuario();
        }
    }
    
    private static Usuario iniciarSesion(String username, String password) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(username) && usuario.getContrasenia().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    private static void mostrarMenuAdmin() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear obra de arte");
            System.out.println("2. Eliminar obra de arte");
            System.out.println("3. Listar obras de arte");
            System.out.println("4. Modificar obra de arte");
            System.out.println("5. Salir");
            System.out.print("Opción seleccionada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarMenuCrearObra();
                    break;
                case 2:
                    mostrarMenuEliminarObra();
                    break;
                case 3:
                    //mostrarMenuListarObras();
                    break;
                case 4:
                    //mostrarMenuModificarObra();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Seleccione otra opción.");
            }
        }
    }

    private static void mostrarMenuCrearObra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear pintura");
        System.out.println("2. Crear escultura");
        System.out.println("3. Crear fotografía");
        System.out.println("4. Crear escrito");
        System.out.print("Opción seleccionada: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1: // Crear pintura
            System.out.print("Ingrese el nombre de la pintura: ");
            String nombrePintura = scanner.nextLine();
            System.out.print("Ingrese el autor de la pintura: ");
            String autorPintura = scanner.nextLine();
            System.out.print("Ingrese la fecha de presentación de la pintura (dd/MM/yyyy): ");
            String fechaPresentacionPintura = scanner.nextLine();
            System.out.print("Ingrese la fecha de adquisición de la pintura (dd/MM/yyyy): ");
            String fechaAdquisicionPintura = scanner.nextLine();
            System.out.print("¿La pintura está en exposición? (true/false): ");
            boolean enExposicionPintura = scanner.nextBoolean();
            System.out.print("Ingrese el precio de la pintura: ");
            double precioPintura = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Ingrese la fecha de creación de la pintura (dd/MM/yyyy): ");
            String fechaCreacionPintura = scanner.nextLine();
            System.out.print("Ingrese el estilo de la pintura: ");
            String estiloPintura = scanner.nextLine();
            System.out.print("Ingrese el color predominante de la pintura: ");
            String colorPintura = scanner.nextLine();
            Pinturas nuevaPintura = new Pinturas(nombrePintura, autorPintura, fechaPresentacionPintura, fechaAdquisicionPintura,
                    enExposicionPintura, precioPintura, fechaCreacionPintura, estiloPintura, colorPintura);
            listaPinturas.add(nuevaPintura);
            System.out.println("Pintura creada exitosamente.");
            break;

            case 2:
            System.out.print("Nombre: ");
            String nombreEscultura = scanner.nextLine();
            System.out.print("Autor: ");
            String autorEscultura = scanner.nextLine();
            System.out.print("Material: ");
            String materialEscultura = scanner.nextLine();
            System.out.print("Dimensiones (alto x ancho x profundidad): ");
            String dimensionesEscultura = scanner.nextLine();
            System.out.print("Precio: ");
            double precioEscultura = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Fecha de creación (DD/MM/AAAA): ");
            String fechaCreacionEscultura = scanner.nextLine();
            System.out.print("Estilo: ");
            String estiloEscultura = scanner.nextLine();
            System.out.print("Peso: ");
            double pesoEscultura = scanner.nextDouble();
            scanner.nextLine();
            Esculturas nuevaEscultura = new Esculturas(nombreEscultura, autorEscultura, materialEscultura,
            dimensionesEscultura, precioEscultura, fechaCreacionEscultura, estiloEscultura, pesoEscultura);
            listaEsculturas.add(nuevaEscultura);
            System.out.println("Escultura creada con éxito.");
            break;
            case 3:
                System.out.print("Nombre: ");
                String nombreFoto = scanner.nextLine();
                System.out.print("Autor: ");
                String autorFoto = scanner.nextLine();
                System.out.print("Tamaño (KB): ");
                double tamanoFoto = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Fecha de creación (DD/MM/AAAA): ");
                String fechaCreacionFoto = scanner.nextLine();
                System.out.print("Lugar donde se tomó: ");
                String lugarFoto = scanner.nextLine();
                System.out.print("Tema: ");
                String temaFoto = scanner.nextLine();
                System.out.print("Dimensiones (ancho x alto): ");
                String dimensionFoto = scanner.nextLine();
                System.out.print("Resolución (en ppp): ");
                String resolucionFoto = scanner.nextLine();
                System.out.print("¿A color? (true/false): ");
                boolean aColorFoto = scanner.nextBoolean();
                scanner.nextLine();
                Fotografias nuevaFoto = new Fotografias(dimensionFoto, resolucionFoto, aColorFoto, nombreFoto, autorFoto, tamanoFoto,
                    fechaCreacionFoto, lugarFoto, temaFoto);

                listaFotografias.add(nuevaFoto);
                System.out.println("Fotografía creada con éxito.");
            break;
            case 4:
            System.out.print("Nombre: ");
            String nombreEscrito = scanner.nextLine();
            System.out.print("Autor: ");
            String autorEscrito = scanner.nextLine();
            System.out.print("Número de palabras: ");
            int numPalabrasEscrito = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Año de publicación: ");
            int anoPublicacionEscrito = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Temática: ");
            String tematicaEscrito = scanner.nextLine();
                    // Crear objeto Escrito y agregar a la lista de obras
        Escritos nuevoEscrito = new Escritos(nombreEscrito, autorEscrito, numPalabrasEscrito, anoPublicacionEscrito, tematicaEscrito);
        listaEscritos.add(nuevoEscrito);
        System.out.println("Obra creada exitosamente.");
        break;
    default:
        System.out.println("Opción no válida. Seleccione otra opción.");
    }
}

    private static void mostrarMenuEliminarObra() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Seleccione una opción:");
    System.out.println("1. Eliminar pintura");
    System.out.println("2. Eliminar escultura");
    System.out.println("3. Eliminar fotografía");
    System.out.println("4. Eliminar escrito");
    System.out.print("Opción seleccionada: ");
    int opcion = scanner.nextInt();
    scanner.nextLine();

    switch (opcion) {
        case 1:
            // Eliminar pintura
            System.out.println("Pinturas disponibles:");
            for (Pinturas pintura : listaPinturas) {
                System.out.println("- " + pintura.getNombreObra());
            }
            System.out.print("Seleccione el nombre de la pintura a eliminar: ");
            String nombrePinturaEliminar = scanner.nextLine();
            boolean eliminadoPintura = eliminarObra(nombrePinturaEliminar, listaPinturas);
            if (eliminadoPintura) {
                System.out.println("Pintura eliminada exitosamente.");
            } else {
                System.out.println("No se encontró la pintura con el nombre ingresado.");
            }
            break;
        case 2:
            // Eliminar escultura
            System.out.println("Esculturas disponibles:");
            for (Esculturas escultura : listaEsculturas) {
                System.out.println("- " + escultura.getNombreObra());
            }
            System.out.print("Seleccione el nombre de la escultura a eliminar: ");
            String nombreEsculturaEliminar = scanner.nextLine();
            boolean eliminadoEscultura = eliminarObra(nombreEsculturaEliminar, listaEsculturas);
            if (eliminadoEscultura) {
                System.out.println("Escultura eliminada exitosamente.");
            } else {
                System.out.println("No se encontró la escultura con el nombre ingresado.");
            }
            break;
        case 3:
            // Eliminar fotografía
            System.out.println("Fotografías disponibles:");
            for (Fotografias foto : listaFotografias) {
                System.out.println("- " + foto.getNombreObra());
            }
            System.out.print("Seleccione el nombre de la fotografía a eliminar: ");
            String nombreFotoEliminar = scanner.nextLine();
            boolean eliminadoFoto = eliminarObra(nombreFotoEliminar, listaFotografias);
            if (eliminadoFoto) {
                System.out.println("Fotografía eliminada exitosamente.");
            } else {
                System.out.println("No se encontró la fotografía con el nombre ingresado.");
            }
            break;
        case 4:
            // Eliminar escrito
            System.out.println("Escritos disponibles:");
            for (Escritos escrito : listaEscritos) {
                System.out.println("- " + escrito.getAutor() + " de " + escrito.getAutor());
            }
            System.out.print("Ingrese el nombre del escrito a eliminar: ");
            String nombreEscritoEliminar = scanner.nextLine();
            boolean encontrado = false;
            for (Escritos escrito : listaEscritos) {
                if (escrito.getAutor().equals(nombreEscritoEliminar)) {
                    listaEscritos.remove(escrito);
                    System.out.println("Escrito eliminado exitosamente.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El escrito ingresado no existe.");
            }
            break;
            default:
                System.out.println("Opción no válida. Seleccione otra opción.");
        }
    }
}

