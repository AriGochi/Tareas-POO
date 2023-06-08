package org.example.vista;

import org.example.modelo.SistemaSolar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaSistemaSolar extends JFrame {
    private JLabel lblId;
    private JLabel lblUbicacion;
    private JLabel lblNumero;
    private JLabel lblPlanetaGrande;
    private JLabel lblPlanetaCercano;
    private JLabel lblImagen;

    private JTextField txtId;
    private JTextField txtUbicacion;
    private JTextField txtNumero;
    private JTextField txtPlanetaGrande;
    private JTextField txtPlanetaCercano;
    private JTextField txtImagen;

    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblSistema;
    private JScrollPane scrollPane;
    private GridLayout layout;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    //Para que se cargue la imagen de la url
    private JLabel lblFoto;
    private JPanel panel4;
    //Panel 4
    private JLabel lblUbicacion2;
    private JLabel lblNumero2;
    private JLabel lblPlanetaGrande2;
    private JLabel lblPlanetaCercano2;
    private JLabel lblImagen2;

    private JTextField txtUbicacion2;
    private JTextField txtNumero2;
    private JTextField txtPlanetaGrande2;
    private JTextField txtPlanetaCercano2;
    private JTextField txtImagen2;

    private JButton btnActualizar;
    private JButton btnEliminar;



    public VentanaSistemaSolar(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(104, 148, 175));

        lblId=new JLabel("Id:");
        lblUbicacion=new JLabel("Ubicacion del Sistema Solar:");
        lblNumero =new JLabel("Numero de planetas:");
        lblPlanetaGrande=new JLabel("El planeta mas grande:");
        lblPlanetaCercano=new JLabel("El planeta mas cercano al Sol:");
        lblImagen=new JLabel("Imagen sobre el sistema solar:");

        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);

        txtUbicacion = new JTextField(12);
        txtNumero = new JTextField(12);
        txtPlanetaGrande = new JTextField(15);
        txtPlanetaCercano = new JTextField(15);
        txtImagen = new JTextField(30);

        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblUbicacion);
        panel1.add(txtUbicacion);
        panel1.add(lblNumero);
        panel1.add(txtNumero);
        panel1.add(lblPlanetaGrande);
        panel1.add(txtPlanetaGrande);
        panel1.add(lblPlanetaCercano);
        panel1.add(txtPlanetaCercano);
        panel1.add(lblImagen);
        panel1.add(txtImagen);

        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(3, 86, 136));

        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblSistema = new JTable();
        scrollPane = new JScrollPane(tblSistema);
        panel2.add(scrollPane);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(3, 86, 136));
        lblFoto = new JLabel();

        this.panel3.add(lblFoto);


        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(104, 148, 175));

        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        lblUbicacion2= new JLabel("Ubicacion del Sistema Solar: ");
        lblNumero2 = new JLabel("Numero de planetas: ");
        lblPlanetaGrande2 = new JLabel("El planeta mas grande: ");
        lblPlanetaCercano2 = new JLabel("El planeta mas cercano al Sol: ");
        lblImagen2 = new JLabel("Imagen sobre el sistema solar:");

        txtUbicacion2 = new JTextField(12);
        txtNumero2 = new JTextField(12);
        txtPlanetaGrande2 = new JTextField(15);
        txtPlanetaCercano2 = new JTextField(15);
        txtImagen2 = new JTextField(30);

        panel4.add(lblUbicacion2);
        panel4.add(txtUbicacion2);
        panel4.add(lblNumero2);
        panel4.add(txtNumero2);
        panel4.add(lblPlanetaGrande2);
        panel4.add(txtPlanetaCercano2);
        panel4.add(lblPlanetaCercano2);
        panel4.add(txtPlanetaGrande2);
        panel4.add(lblImagen2);
        panel4.add(txtImagen2);

        panel4.add(btnActualizar);
        panel4.add(btnEliminar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblUbicacion() {
        return lblUbicacion;
    }

    public void setLblUbicacion(JLabel lblUbicacion) {
        this.lblUbicacion = lblUbicacion;
    }

    public JLabel getLblNumero() {
        return lblNumero;
    }

    public void setLblNumero(JLabel lblNumero) {
        this.lblNumero = lblNumero;
    }

    public JLabel getLblPlanetaGrande() {
        return lblPlanetaGrande;
    }

    public void setLblPlanetaGrande(JLabel lblPlanetaGrande) {
        this.lblPlanetaGrande = lblPlanetaGrande;
    }

    public JLabel getLblPlanetaCercano() {
        return lblPlanetaCercano;
    }

    public void setLblPlanetaCercano(JLabel lblPlanetaCercano) {
        this.lblPlanetaCercano = lblPlanetaCercano;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtUbicacion() {
        return txtUbicacion;
    }

    public void setTxtUbicacion(JTextField txtUbicacion) {
        this.txtUbicacion = txtUbicacion;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(JTextField txtNumero) {
        this.txtNumero = txtNumero;
    }

    public JTextField getTxtPlanetaGrande() {
        return txtPlanetaGrande;
    }

    public void setTxtPlanetaGrande(JTextField txtPlanetaGrande) {
        this.txtPlanetaGrande = txtPlanetaGrande;
    }

    public JTextField getTxtPlanetaCercano() {
        return txtPlanetaCercano;
    }

    public void setTxtPlanetaCercano(JTextField txtPlanetaCercano) {
        this.txtPlanetaCercano = txtPlanetaCercano;
    }

    public JTextField getTxtImagen() {
        return txtImagen;
    }

    public void setTxtImagen(JTextField txtImagen) {
        this.txtImagen = txtImagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblSistema() {
        return tblSistema;
    }

    public void setTblSistema(JTable tblSistema) {
        this.tblSistema = tblSistema;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JLabel getLblUbicacion2() {
        return lblUbicacion2;
    }

    public void setLblUbicacion2(JLabel lblUbicacion2) {
        this.lblUbicacion2 = lblUbicacion2;
    }

    public JLabel getLblNumero2() {
        return lblNumero2;
    }

    public void setLblNumero2(JLabel lblNumero2) {
        this.lblNumero2 = lblNumero2;
    }

    public JLabel getLblPlanetaGrande2() {
        return lblPlanetaGrande2;
    }

    public void setLblPlanetaGrande2(JLabel lblPlanetaGrande2) {
        this.lblPlanetaGrande2 = lblPlanetaGrande2;
    }

    public JLabel getLblPlanetaCercano2() {
        return lblPlanetaCercano2;
    }

    public void setLblPlanetaCercano2(JLabel lblPlanetaCercano2) {
        this.lblPlanetaCercano2 = lblPlanetaCercano2;
    }

    public JLabel getLblImagen2() {
        return lblImagen2;
    }

    public void setLblImagen2(JLabel lblImagen2) {
        this.lblImagen2 = lblImagen2;
    }

    public JTextField getTxtUbicacion2() {
        return txtUbicacion2;
    }

    public void setTxtUbicacion2(JTextField txtUbicacion2) {
        this.txtUbicacion2 = txtUbicacion2;
    }

    public JTextField getTxtNumero2() {
        return txtNumero2;
    }

    public void setTxtNumero2(JTextField txtNumero2) {
        this.txtNumero2 = txtNumero2;
    }

    public JTextField getTxtPlanetaGrande2() {
        return txtPlanetaGrande2;
    }

    public void setTxtPlanetaGrande2(JTextField txtPlanetaGrande2) {
        this.txtPlanetaGrande2 = txtPlanetaGrande2;
    }

    public JTextField getTxtPlanetaCercano2() {
        return txtPlanetaCercano2;
    }

    public void setTxtPlanetaCercano2(JTextField txtPlanetaCercano2) {
        this.txtPlanetaCercano2 = txtPlanetaCercano2;
    }

    public JTextField getTxtImagen2() {
        return txtImagen2;
    }

    public void setTxtImagen2(JTextField txtImagen2) {
        this.txtImagen2 = txtImagen2;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public void limpiar(){
        txtUbicacion.setText("");
        txtNumero.setText("");
        txtPlanetaGrande.setText("");
        txtPlanetaCercano.setText("");
        txtImagen.setText(" ");

    }
    public void actualizarRegistro(int registro, SistemaSolar sistemaSolar){

        //Se obtiene el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblSistema.getModel();

        //Actualizar datos del registro seleccionado

        modelo.setValueAt(sistemaSolar.getUbicacion(), registro, 1);
        modelo.setValueAt(sistemaSolar.getNumero(), registro, 2);
        modelo.setValueAt(sistemaSolar.getPlaneetaGrande(),registro,3);
        modelo.setValueAt(sistemaSolar.getPlanetaCercano(), registro, 4);
        modelo.setValueAt(sistemaSolar.getImagen(),registro,5);
    }
}