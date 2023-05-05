package s1_bienes_lloydcooper;

import java.util.ArrayList;
import s1_bienes_lloydcooper.Bien;

class Inventario {
    private ArrayList<Bien> bienes;

    // Constructor
    public Inventario() {
        bienes = new ArrayList<Bien>();
    }

    /**
     * Método para agregar un bien al inventario.
     */
    public void agregarBien(Bien bien) {
        bienes.add(bien);
        System.out.println("El bien ha sido agregado al inventario.");
    }

    /**
     * Método para listar todo el inventario.
     */
    public void listarInventario() {
        System.out.println("Inventario de Elon Musk:");
        for (Bien bien : bienes) {
            bien.imprimirInfo();
        }
    }

    /**
     * Método para buscar un bien en el inventario por código.
     */
    public void buscarBien(int codigo) {
        boolean encontrado = false;
        for (Bien bien : bienes) {
            if (bien.getCodigo() == codigo) {
                bien.imprimirInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un bien con el código ingresado.");
        }
    }

    /**
     * Método para modificar la fecha de expiración o el color de un bien en el inventario por código.
     */
    public void modificarBien(int codigo, String campo, String valor) {
        boolean modificado = false;
        for (Bien bien : bienes) {
            if (bien.getCodigo() == codigo) {
                if (campo.equals("fechaExpiracion")) {
		bien.setfechaExpiracion(valor);
                modificado = true;
                break;
            } else if (campo.equals("color")) {
                bien.setColor(valor);
                modificado = true;
                break;
            }
            }
            }
            if (modificado) {
            System.out.println("El bien ha sido modificado exitosamente.");
            } else {
            System.out.println("No se encontró un bien con el código ingresado.");
            }
            }
    
    public void eliminarBien(int codigo) {
        boolean eliminado = false;
        for (int i = 0; i < bienes.size(); i++) {
            Bien bien = bienes.get(i);
            if (bien.getCodigo() == codigo) {
                bienes.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            System.out.println("El bien ha sido eliminado del inventario.");
        } else {
            System.out.println("No se encontró un bien con el código ingresado.");
        }
    }
}
