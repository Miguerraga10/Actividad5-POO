package Figuras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaPrismaRectangular extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel ancho, largo, altura, volumen, superficie;
    private JTextField campoAltura,campoAncho, campoLargo;
    private JButton calcular;
    public VentanaPrismaRectangular() {
        inicio();
        setIconImage(new ImageIcon("prismaRectangular.png").getImage());
        setTitle("Cilindro");
        setSize(280,250);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        ancho= new JLabel();
        ancho.setText("Ancho (cms):");
        ancho.setBounds(20, 20, 135, 23); 
        campoAncho = new JTextField();
        campoAncho.setBounds(100, 20, 135, 23);
        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(100, 50, 135, 23);
        largo = new JLabel();
        largo.setText("Largo (cms):");
        largo.setBounds(20, 80, 135, 23);
        campoLargo = new JTextField();
        campoLargo.setBounds(100, 80, 135, 23);
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 110, 135, 23);
        calcular.addActionListener(this);
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 135, 135, 23);
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 180, 135, 23);
        contenedor.add(ancho);
        contenedor.add(campoAncho);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(largo);
        contenedor.add(campoLargo);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double ancho = 0;
        double altura = 0;
        double largo = 0;
        try {
            ancho = Double.parseDouble(campoAncho.getText());
            altura = Double.parseDouble(campoAltura.getText());
            largo = Double.parseDouble(campoLargo.getText());
            PrismaRectangular prismaRectangular = new PrismaRectangular(ancho, altura, largo);
            volumen.setText("Volumen (cm3): " + String.format("%.2f",prismaRectangular.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f",prismaRectangular.calcularSuperficie()));
        } catch (Exception e){
            error = true;
        } finally {
            if(error) { 
                JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}