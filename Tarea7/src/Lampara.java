public class Lampara {
    private String marca;
    private int intensidad;

    public Lampara(String marca, int intensidad) {
        this.marca = marca;
        this.intensidad = intensidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", intensidad=" + intensidad +
                '}';
    }

    public void encender(){
        System.out.println("encender");
    }
    public void alumbrar (){
        System.out.println("alumbrar");
    }
}
