package clase20230503;

import java.awt.Color;
import java.util.Date;

public class MIFecha extends Date {
    private Color color;

    public MIFecha() {
        super();
    }

    public MIFecha(Color color, int year, int month, int date) {
        super(year, month, date);
        this.color = color;
    }

    public MIFecha(Color color, int year, int month, int date, int hrs, int min, int sec) {
        super(year, month, date, hrs, min, sec);
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
        return "MIFecha{" + "color=" + color + '}' + super.toString();
    }
    
    
}
