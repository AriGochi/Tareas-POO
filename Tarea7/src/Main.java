import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Pais pai = new Pais( "Mexico",132455, "Ciudad de Mexico","Español");
        System.out.println(pai);
        pai.gobernar();
        System.out.println(pai);
        pai.conquistar();

        Giroscopio giro= new Giroscopio ( 123,54, 400);
        System.out.println(giro);
        giro.medir();
        System.out.println(giro);
        giro.conocer();

        Computadora compu= new Computadora ( "HP","54", 16, 43);
        System.out.println(compu);
        compu.navegar();
        System.out.println(compu);
        compu.programar();

        CuboDeRubik  cubo= new CuboDeRubik  (6, Color.gray);
        System.out.println(cubo);
        cubo.jugar();
        System.out.println(cubo);
        cubo.armar();

        Libro lib= new Libro ( "El arte de la guerra","Sun Tzu", "Grandes de la literatura", 2019, 94);
        System.out.println(lib);
        lib.investigar();
        System.out.println(lib);
        lib.aprender();

        Balon bal = new Balon ( "Nike",10,  Color.BLACK, 5 );
        System.out.println(bal);
        bal.jugar();
        System.out.println(bal);
        bal.botar();

        Lampara lam = new Lampara ( "Mariposa", 10);
        System.out.println(lam);
        lam.encender();
        System.out.println(lam);
        lam.alumbrar();

        Gato cat = new Gato ( "Michi",10, "Blanco");
        System.out.println(cat);
        cat.comer();
        System.out.println(cat);
        cat.dormir();

    }
}