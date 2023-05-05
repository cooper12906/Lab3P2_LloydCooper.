    package lab2p2_lloydcooper;

    public class Fotografias {
    private String dimension;
    private String resolucion;
    private boolean aColor;
    private String nombre;
    private String autor;
    private double tamano;
    private String fechaCreacion;
    private String lugar;
    private String tema;

    public Fotografias(String dimension, String resolucion, boolean aColor, String nombre, String autor, double tamano,
            String fechaCreacion, String lugar, String tema) {
        this.dimension = dimension;
        this.resolucion = resolucion;
        this.aColor = aColor;
        this.nombre = nombre;
        this.autor = autor;
        this.tamano = tamano;
        this.fechaCreacion = fechaCreacion;
        this.lugar = lugar;
        this.tema = tema;
    }

    // getters y setters para las nuevas propiedades
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isAColor() {
        return aColor;
    }

    public void setAColor(boolean aColor) {
        this.aColor = aColor;
    }

    // getters y setters para las propiedades existentes
    // ...
}
