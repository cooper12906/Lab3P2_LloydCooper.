package lab3p2_lloydcooper;

public class Comidas extends Productos {
    private boolean diasVencimiento;
    private String nombre;
    private double precio;

    public Comidas(String nombre, double precio, boolean diasVencimiento) {
        super(nombre, precio);
        this.nombre = nombre;
        this.diasVencimiento = diasVencimiento;
        this.precio = precio;
    }

    public boolean getDiasVencimiento() {
        return diasVencimiento;
    }

    public void setDiasVencimiento(boolean diasVencimiento) {
        this.diasVencimiento = diasVencimiento;
    }

    @Override
    public String toString() {
        return "Comidas{" + "Nombre:" + nombre + "Precio comida: " + precio + ", Esta vencido? " + diasVencimiento + '}';
    }         
}


