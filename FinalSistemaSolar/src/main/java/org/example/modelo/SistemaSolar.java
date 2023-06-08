package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SistemaSolar {
    private int id;
    private String ubicacion;
    private int numero;
    private String planeetaGrande;
    private String planetaCercano;
    private String imagen;

    public SistemaSolar() {
    }

    public SistemaSolar(int id, String ubicacion, int numero, String planeetaGrande, String planetaCercano, String imagen) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.numero = numero;
        this.planeetaGrande = planeetaGrande;
        this.planetaCercano = planetaCercano;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaneetaGrande() {
        return planeetaGrande;
    }

    public void setPlaneetaGrande(String planeetaGrande) {
        this.planeetaGrande = planeetaGrande;
    }

    public String getPlanetaCercano() {
        return planetaCercano;
    }

    public void setPlanetaCercano(String planetaCercano) {
        this.planetaCercano = planetaCercano;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "SistemaSolar{" +
                "id=" + id +
                ", ubicacion='" + ubicacion + '\'' +
                ", numero=" + numero +
                ", planeetaGrande='" + planeetaGrande + '\'' +
                ", planetaCercano='" + planetaCercano + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
    public ImageIcon getImage() throws MalformedURLException {
        URL urlImagen = new URL(this.imagen);
        return new ImageIcon(urlImagen);
    }
}
