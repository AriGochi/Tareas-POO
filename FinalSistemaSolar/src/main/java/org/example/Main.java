package org.example;

import org.example.controlador.ControladorSistemaSolar;
import org.example.modelo.SistemaSolar;
import org.example.persistencia.SistemaSolarDAO;
import org.example.vista.VentanaSistemaSolar;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaSistemaSolar view = new VentanaSistemaSolar("Sistema Solar");
        ControladorSistemaSolar controller = new ControladorSistemaSolar(view);
    }
}