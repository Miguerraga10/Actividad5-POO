package Figuras;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide, cubo, prismaRectangular;
    public VentanaPrincipal(){
        inicio();
        setTitle("Figuras");
        setSize(350,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23);
        esfera.addActionListener(this);
        piramide = new JButton();
        piramide.setText("Pirámide");
        piramide.setBounds(225, 50, 100, 23);
        piramide.addActionListener(this);
        cubo = new JButton();
        cubo.setText("Cubo");
        cubo.setBounds(225, 100, 100, 23);
        cubo.addActionListener(this);
        prismaRectangular = new JButton();
        prismaRectangular.setText("Prisma Rectangular");
        prismaRectangular.setBounds(20, 100, 150, 23);
        prismaRectangular.addActionListener(this);
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
        contenedor.add(cubo);
        contenedor.add(prismaRectangular);
    }
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) { 
            VentanaEsfera esfera = new VentanaEsfera();
            esfera.setVisible(true);
        }
        if (evento.getSource() == cilindro) {
            VentanaCilindro cilindro = new VentanaCilindro();
            cilindro.setVisible(true); 
        }
        if (evento.getSource() == piramide) { 
            VentanaPiramide piramide = new VentanaPiramide();
            piramide.setVisible(true);
        }
        if (evento.getSource() == cubo) { 
            VentanaCubo cubo = new VentanaCubo();
            cubo.setVisible(true);
        }
        if (evento.getSource() == prismaRectangular) { 
            VentanaPrismaRectangular prismaRectangular = new VentanaPrismaRectangular();
            prismaRectangular.setVisible(true);
        }
    }
}