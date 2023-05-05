package clase20230504;

import java.awt.Color;
import java.util.ArrayList;

public class Clase20230504 {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();
        figuras.add(new Figura(Color.yellow));
        figuras.add(new Circulo(5, Color.red));
        figuras.add(new Triangulo(1, 1, 1, Color.blue));
        
        for (Figura t : figuras) {
            System.out.println(t);
        }
        
            
    }
    
}
