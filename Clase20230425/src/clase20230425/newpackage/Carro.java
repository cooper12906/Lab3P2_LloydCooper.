package clase20230425.newpackage;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Carro {
    //Atributos
    private String serie;
    protected String marca;
    String modelo;
    public Color color;
    private Date fecha;
    private double costo; //El costo de un vehiculo no puede ser menor a 0.
    private ArrayList<String> accesorios = new ArrayList();
    private Motor motor;
    private ArrayList<Rueda> ruedas = new ArrayList(); 
    
    //Constructores
    public Carro(){
    }
    
    public Carro(String s){
        serie = s;
    }
    
    public Carro(String s, String marca){
        serie = s;
        this.marca = marca;
    }

    public Carro(String serie, String marca, String modelo, Color color, Date fecha, double costo, Motor motor) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fecha = fecha;
        this.setCosto(costo);
        this.motor = motor;
    }
    
    
    
    //Mutadores
    public void setSerie(String serie){
        this.serie = serie;
    }
    
    public String getSerie(){
        return serie;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    public boolean setCosto(double costo){
        if (costo > 0) {
            this.costo = costo;
            return true;
        }
        return false;
    }
    
    public void setAccesorios(ArrayList<String> acc){
        accesorios = acc;
    }
    
    public ArrayList<String> getAccesorios(){
        return accesorios;
    }
    
    public void setAccesorio(String acc){
        accesorios.add(acc);
    }
    
    public String getAccesorio(int pos){
        return accesorios.get(pos);
    }
    
    
    //Metodo de administracion (MA)
    @Override
    public String toString(){
        return "Mi carro bello es: " + marca 
                + " y su serie es: " + serie;
    }
    
    public boolean pintarCarro(Color c){
        color = c;
        return true;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    
        
}
