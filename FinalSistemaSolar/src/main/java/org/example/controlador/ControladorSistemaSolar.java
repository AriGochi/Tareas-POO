package org.example.controlador;

import org.example.modelo.ModeloTabla;
import org.example.modelo.SistemaSolar;
import org.example.vista.VentanaSistemaSolar;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorSistemaSolar extends MouseAdapter {

    private VentanaSistemaSolar view;
    private ModeloTabla modelo;

    public ControladorSistemaSolar(VentanaSistemaSolar view) {
        this.view = view;
        modelo = new ModeloTabla();
        this.view.getTblSistema().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnEliminar(). addMouseListener (this);
        this.view.getBtnActualizar(). addMouseListener (this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == this.view.getBtnCargar()) {
            modelo.CargarDatos();
            this.view.getTblSistema().setModel(modelo);
            this.view.getTblSistema().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()) {
            SistemaSolar sistemaSolar = new SistemaSolar();
            sistemaSolar.setId(0);
            sistemaSolar.setUbicacion(this.view.getTxtUbicacion().getText());
            sistemaSolar.setNumero((Integer.parseInt(view.getTxtNumero().getText())));
            sistemaSolar.setPlaneetaGrande(this.view.getTxtPlanetaGrande().getText());
            sistemaSolar.setPlanetaCercano(this.view.getTxtPlanetaCercano().getText());
            sistemaSolar.setImagen(this.view.getTxtImagen().getText());

            if (modelo.agregarDatos(sistemaSolar)) {

                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblSistema().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. " +
                        "Por favor revise su conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);

            }
            this.view.limpiar();
        }

            if (e.getSource() == this.view.getTblSistema()) {
                System.out.println("Evento sobre la Tabla");
                int index = this.view.getTblSistema().getSelectedRow();
                SistemaSolar tmp = modelo.getSistemaIndex(index);
                try {
                    this.view.getLblFoto().setIcon(tmp.getImage());
                } catch (MalformedURLException mfue) {
                    System.out.println(e.getSource());
                }
                this.view.getTxtUbicacion2().setText(tmp.getUbicacion());
                this.view.getTxtNumero2().setText(String.valueOf(tmp.getNumero()));
                this.view.getTxtPlanetaGrande2().setText(tmp.getPlaneetaGrande());
                this.view.getTxtPlanetaCercano2().setText(String.valueOf(tmp.getPlanetaCercano()));
                this.view.getTxtImagen2().setText(String.valueOf(tmp.getImagen()));

            }
        if (e.getSource() == this.view.getBtnActualizar()){
            System.out.println("Evento sobre boton Actualizar");
            int rowIndex = this.view.getTblSistema().getSelectedRow();
            SistemaSolar tmp = modelo.getSistemaIndex(rowIndex);
            SistemaSolar natacion = new SistemaSolar();

            natacion.setUbicacion(this.view.getTxtUbicacion2().getText());
            natacion.setNumero(Integer.parseInt(this.view.getTxtNumero2().getText()));
            natacion.setPlaneetaGrande(this.view.getTxtPlanetaGrande2().getText());
            natacion.setPlanetaCercano(this.view.getTxtPlanetaCercano2().getText());
            natacion.setImagen(this.view.getTxtImagen2().getText());
            natacion.setId(tmp.getId());

            if (modelo.actualizarNatacion(natacion)){
                JOptionPane.showMessageDialog(view, "Se actualizo el registro", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE );
                modelo.CargarDatos();
                this.view.getTblSistema().setModel(modelo);
                this.view.getTblSistema().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo actualizar el registro", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTblSistema().updateUI();
        }

        if (e.getSource() == this.view.getBtnEliminar()){
            ModeloTabla temp = new ModeloTabla ();
            int index = this.view.getTblSistema().getSelectedRow();
            SistemaSolar tmp = modelo.getSistemaIndex(index);

            if (temp.eliminarNatacion(Integer.toString(tmp.getId()))){
                JOptionPane.showMessageDialog(view,"Se elimino el registro", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                modelo.CargarDatos();
                this.view.getTblSistema().updateUI();
                this.view.limpiar();
            }else {
                JOptionPane.showMessageDialog(view, "No se elimino el registro","Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        this.view.limpiar();



    }
}
