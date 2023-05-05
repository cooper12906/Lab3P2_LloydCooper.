package lab2p2_lloydcooper;

public class Escritos {
    private int totalPalabras;
    private String epocaRedaccion;
    private String generoLiterario;
    private String autor;

    public Escritos(String nombre, String autor, int totalPalabras, int anoPublicacion, String generoLiterario) {
        this.totalPalabras = totalPalabras;
        this.epocaRedaccion = Integer.toString(anoPublicacion);
        this.generoLiterario = generoLiterario;
        this.autor = autor;
    }

    public int getTotalPalabras() {
        return totalPalabras;
    }

    public void setTotalPalabras(int totalPalabras) {
        this.totalPalabras = totalPalabras;
    }

    public String getEpocaRedaccion() {
        return epocaRedaccion;
    }

    public void setEpocaRedaccion(String epocaRedaccion) {
        this.epocaRedaccion = epocaRedaccion;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}


