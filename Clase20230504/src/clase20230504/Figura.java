package clase20230504;

import java.awt.Color;

public class Figura {
    protected Color color;

    public Figura() {
    }

    public Figura(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + '}';
    }
    
    
}
