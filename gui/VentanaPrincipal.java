package gui;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private CardLayout layout;
    private JPanel contenedor;

    public VentanaPrincipal() {
        setTitle("Sistema");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        layout = new CardLayout();
        contenedor = new JPanel(layout);

        setContentPane(contenedor);
    }

    public void agregarVista(JPanel panel, String nombre) {
        contenedor.add(panel, nombre);
    }

    public void mostrarVista(String nombre) {
        layout.show(contenedor, nombre);
    }
}