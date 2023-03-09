public class Pais {
    private String nombre;
    private int poblacion;
    private String capital;
    private String idioma;

    public Pais(String nombre, int poblacion, String capital, String idioma) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = capital;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", capital='" + capital + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
    public void gobernar(){
        System.out.println("Gobernar país");
    }
    public void conquistar (){
        System.out.println("Conquistar");
    }
}
