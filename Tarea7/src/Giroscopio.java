public class Giroscopio {

    private double veloAnguX;
    private double veloAnguY;
    private double veloAnguZ;

    public Giroscopio(double veloAnguX, double veloAnguY, double veloAnguZ) {
        this.veloAnguX = veloAnguX;
        this.veloAnguY = veloAnguY;
        this.veloAnguZ = veloAnguZ;
    }

    public double getVeloAnguX() {
        return veloAnguX;
    }

    public void setVeloAnguX(double veloAnguX) {
        this.veloAnguX = veloAnguX;
    }

    public double getVeloAnguY() {
        return veloAnguY;
    }

    public void setVeloAnguY(double veloAnguY) {
        this.veloAnguY = veloAnguY;
    }

    public double getVeloAnguZ() {
        return veloAnguZ;
    }

    public void setVeloAnguZ(double veloAnguZ) {
        this.veloAnguZ = veloAnguZ;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "veloAnguX=" + veloAnguX +
                ", veloAnguY=" + veloAnguY +
                ", veloAnguZ=" + veloAnguZ +
                '}';
    }
    public void medir(){
        System.out.println("Medir");
    }
    public void conocer (){
        System.out.println("Conocer");
    }
}
