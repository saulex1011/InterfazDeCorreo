package gui;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private CardLayout layout;
    private JPanel contenedor;

    public VentanaPrincipal() {
        setTitle("Sistema");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ===== Cambiar el icono de la ventana =====
        java.net.URL url = getClass().getResource("/util/imagenes/logo.png");

        if (url != null) {
            ImageIcon iconoOriginal = new ImageIcon(url);
    
            // Extraemos la Image y la reescalamos a 32x32 píxeles (suave)
            Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(8, 8, Image.SCALE_SMOOTH);
    
            // Aplicamos la imagen redimensionada a la ventana
            setIconImage(imagenRedimensionada);
        } else {
            System.err.println("Error: No se encontró el icono en /util/imagenes/logo.png");
        }

        //IDM
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