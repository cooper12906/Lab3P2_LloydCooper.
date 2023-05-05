package lab3p2_lloydcooper;

public class Comidas extends Productos {
    private boolean diasVencimiento;

    public Comidas(String nombre, double precio, boolean diasVencimiento) {
        super(nombre, precio);
        this.diasVencimiento = diasVencimiento;
    }

    public boolean getDiasVencimiento() {
        return diasVencimiento;
    }

    public void setDiasVencimiento(boolean diasVencimiento) {
        this.diasVencimiento = diasVencimiento;
    }

    @Override
    public String toString() {
        return "Comidas{" + "Los dias de vencimiento son =" + diasVencimiento + '}';
    }       
}


