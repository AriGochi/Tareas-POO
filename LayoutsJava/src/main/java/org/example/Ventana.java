package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame{
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiquetaPanel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel 1
        panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1 = new JButton("pRESIONAME");
        panel1.add(botonPanel1);
        this.getContentPane().add(panel1, 0);
        etiquetaPanel1 = new JLabel("----");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola, presionaste el boton del panel 1");
            }
        });

        //Panel 2
        String urlImagen = "https://www.google.com/search?q=loid%20forger&tbm=isch&hl=es&tbs=isz:i&sa=X&ved=0CAQQpwVqFwoTCNil9e795P4CFQAAAAAdAAAAABAC&biw=483&bih=601#imgrc=EFuBx7QCvMWYWM";
        panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        panel2.setLayout(new FlowLayout());
        //iMAGEN
        try{
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imagenIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(ImageIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);
        }catch (MalformedURLException me){
            System.out.println("Url No valida");
        }catch (Exception e){
            System.out.println("Eroor");
        }


        //Panel 3
        panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        this.getContentPane().add(panel3,2);

        //Panel 4
        panel4 = new JPanel();
        panel4.setBackground(Color.BLACK);
        this.getContentPane().add(panel4,3);

        this.setVisible(true);


    }
}
