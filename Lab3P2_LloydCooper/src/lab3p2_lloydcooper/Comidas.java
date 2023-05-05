package lab3p2_lloydcooper;

public class Comidas extends Productos {
    private double diasVencimiento;

    public Comidas(String nombre, double precio, double diasVencimiento) {
        super(nombre, precio);
        this.diasVencimiento = diasVencimiento;
    }

    public double getDiasVencimiento() {
        return diasVencimiento;
    }

    public void setDiasVencimiento(double diasVencimiento) {
        this.diasVencimiento = diasVencimiento;
    }

    @Override
    public String toString() {
        return "Comidas{" + "diasVencimiento=" + diasVencimiento + '}';
    }       
}


