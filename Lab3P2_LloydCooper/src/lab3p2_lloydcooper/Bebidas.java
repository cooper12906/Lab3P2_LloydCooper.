package lab3p2_lloydcooper;

public class Bebidas extends Productos {
    private int tam;

    public Bebidas(String nombre, double precio) {
        super(nombre, precio);
        this.tam = tam;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "tam=" + tam + '}';
    }
}
