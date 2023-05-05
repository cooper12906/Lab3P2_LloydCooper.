package clase20230504;

import java.awt.Color;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        super();
    }

    public Circulo(double radio, Color color) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public double area(){
        return Math.PI*Math.pow(radio,2);
    }
    
    
}
