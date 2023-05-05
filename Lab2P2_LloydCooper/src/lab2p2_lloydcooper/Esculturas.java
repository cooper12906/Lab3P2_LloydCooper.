package lab2p2_lloydcooper;

public class Esculturas {
    private String escultor;
    private String material;
    private int anioComienzo;
    private String departamento;
    private final String nombre;
    private final String autor;
    private final double precio;
    private final String dimensiones;
    private final String fechaCreacion;
    private final String estilo;
    private final double peso;
    
    public Esculturas(String nombre, String autor, String material, String dimensiones, double precio, String fechaCreacion, String estilo, double peso) {
    this.nombre = nombre;
    this.autor = autor;
    this.material = material;
    this.dimensiones = dimensiones;
    this.precio = precio;
    this.fechaCreacion = fechaCreacion;
    this.estilo = estilo;
    this.peso = peso;
}

    
    public String getEscultor(){
        return escultor;
    }
    
    public void setEscultor(){
        this.escultor = escultor;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial(){
        this.material = material;
    }
    
    public int getAnioComienzo() {
        return anioComienzo;
    }

    public void setAnioComienzo(int anioComienzo) {
        this.anioComienzo = anioComienzo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
