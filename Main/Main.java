package Main;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Crear la ventana principal
        JFrame ventana = new JFrame("Simulador de Correo Electrónico");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); // Centrar ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título
        JLabel titulo = new JLabel("Bienvenido al Simulador de Correo Electrónico");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));

        // Contenido
        JLabel contenido = new JLabel(
            "<html><center>" +
            "Proyecto desarrollado por:<br><br>" +
            "• Integrante 1<br>" +
            "• Integrante 2<br>" +
            "• Integrante 3<br><br>" +
            "Gracias por usar nuestro programa." +
            "</center></html>"
        );
        contenido.setHorizontalAlignment(SwingConstants.CENTER);
        contenido.setFont(new Font("Arial", Font.PLAIN, 14));

        // Agregar componentes
        panel.add(titulo, BorderLayout.NORTH);
        panel.add(contenido, BorderLayout.CENTER);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}
