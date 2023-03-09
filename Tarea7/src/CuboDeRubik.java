import java.awt.*;
import java.util.Arrays;

public class CuboDeRubik {
    private int caras;
    private Color color;

    public CuboDeRubik(int caras, Color color) {
        this.caras = caras;
        this.color = color;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "caras=" + caras +
                ", color=" + color +
                '}';
    }

    public void jugar(){
        System.out.println("jugar");
    }
    public void armar (){
        System.out.println("armar");
    }
}
