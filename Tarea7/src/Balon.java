import java.awt.*;

public class Balon {
    private String marca;


    private double radio;


    private Color color;


    private double peso;

    public Balon(String marca, double radio, Color color, double peso) {
        this.marca = marca;
        this.radio = radio;
        this.color = color;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", radio=" + radio +
                ", color=" + color +
                ", peso=" + peso +
                '}';
    }

    public void jugar(){
        System.out.println("jugar");
    }
    public void botar (){
        System.out.println("botar");
    }
}
