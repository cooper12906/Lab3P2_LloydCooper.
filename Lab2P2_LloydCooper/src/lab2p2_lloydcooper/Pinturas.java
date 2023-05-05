package lab2p2_lloydcooper;

import java.util.Date;

public class Pinturas {
    private String nombre;
    private String autor;
    private String fechaPresentacion;
    private String fechaAdquisicion;
    private boolean enExposicion;
    private final String color;
    private final String estilo;
    private final String fechaCreacion;
    private final double precio;
    
    // Constructor
    public Pinturas(String nombre, String autor, String fechaPresentacion, String fechaAdquisicion, boolean enExposicion, 
        double precio, String fechaCreacion, String estilo, String color) {
    this.nombre = nombre;
    this.autor = autor;
    this.fechaPresentacion = fechaPresentacion;
    this.fechaAdquisicion = fechaAdquisicion;
    this.enExposicion = enExposicion;
    this.precio = precio;
    this.fechaCreacion = fechaCreacion;
    this.estilo = estilo;
    this.color = color;
}
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(String fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public boolean isEnExposicion() {
        return enExposicion;
    }

    public void setEnExposicion(boolean enExposicion) {
        this.enExposicion = enExposicion;
    }
    
    // Método toString para mostrar los atributos de la pintura
    @Override
    public String toString() {
        return "Pintura{" + "nombre=" + nombre + ", autor=" + autor + ", fechaPresentacion=" + fechaPresentacion + ", fechaAdquisicion=" + fechaAdquisicion + ", enExposicion=" + enExposicion + '}';
    }
}