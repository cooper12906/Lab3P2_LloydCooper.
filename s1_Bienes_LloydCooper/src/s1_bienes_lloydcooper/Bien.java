package s1_bienes_lloydcooper;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa un bien en el inventario de Elon Musk.
 */
class Bien {
    private int codigo;
    private String descripcion;
    private String marca;
    private String color;
    private String fechaCompra;
    private double costo;
    private double valorLibros;
    private String fechaExpiracion;
    private String ubicacionFisica;
    private String responsable;

    // Constructor
    public Bien(int codigo, String descripcion, String marca, String color, String fechaCompra, double costo,
            double valorLibros, String fechaExpiracion, String ubicacionFisica, String responsable) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.color = color;
        this.fechaCompra = fechaCompra;
        this.costo = costo;
        this.valorLibros = valorLibros;
        this.fechaExpiracion = fechaExpiracion;
        this.ubicacionFisica = ubicacionFisica;
        this.responsable = responsable;
    }

    // Getters y Setters
    // ...

    /**
     * Método para imprimir la información del bien.
     */
    public void imprimirInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Costo: $" + costo);
        System.out.println("Valor en libros: $" + valorLibros);
        System.out.println("Fecha de expiración: " + fechaExpiracion);
        System.out.println("Ubicación física: " + ubicacionFisica);
        System.out.println("Responsable: " + responsable);
        System.out.println();
    }
    public int getCodigo() {
    // Retorna el código del bien
    return codigo;
}

public String getFechaExpiracion() {
    // Retorna la fecha de expiración del bien
    return fechaExpiracion;
}

public String getColor() {
    // Retorna el color del bien
    return color;
}
}