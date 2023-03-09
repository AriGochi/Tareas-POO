public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private int añoPublicacion;
    private int numeroPaginas;

    public Libro(String nombre, String autor, String editorial, int añoPublicacion, int numeroPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
    public void investigar (){
        System.out.println("investigar");
    }
    public void aprender (){
        System.out.println("aprender");
    }
}
