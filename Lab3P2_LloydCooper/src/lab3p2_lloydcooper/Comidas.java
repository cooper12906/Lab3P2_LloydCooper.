package lab3p2_lloydcooper;

public class Comidas extends Productos {
    private double vencido;

    public Comidas(String nombre, double precio) {
        super(nombre, precio);
        this.vencido = vencido;
    }

    public double getVencido() {
        return vencido;
    }

    public void setVencido(double vencido) {
        this.vencido = vencido;
    }

    @Override
    public String toString() {
        return "Comidas{" + "vencido=" + vencido + '}';
    }
    
        
}

