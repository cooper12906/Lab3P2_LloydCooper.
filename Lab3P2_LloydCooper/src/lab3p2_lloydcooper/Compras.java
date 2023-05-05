package lab3p2_lloydcooper;

import java.util.ArrayList;

import java.util.ArrayList;

public class Compras {
    private ArrayList<Productos> listaProductos;
    private double total;

    public Compras() {
        listaProductos = new ArrayList<Productos>();
        total = 0;
    }

    public void agregarProducto(Productos productos) {
        listaProductos.add(productos);
        total += productos.getPrecio();
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

