import javax.swing.*;
import java.awt.*;

public class Registro extends JFrame {

    public Registro() {
        setTitle("Registro de usuario");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // PANEL FORMULARIO
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        // Campos registro
        formPanel.add(new JLabel("Nuevo Usuario:"));
        JTextField txtNuevoUsuario = new JTextField();
        formPanel.add(txtNuevoUsuario);

        formPanel.add(new JLabel("Nueva Contraseña:"));
        JPasswordField txtNuevaPassword = new JPasswordField();
        formPanel.add(txtNuevaPassword);

        // Botón
        JButton btnRegistrar = new JButton("Registrar");
        formPanel.add(new JLabel()); // espacio vacío
        formPanel.add(btnRegistrar);

        add(formPanel);
    }

    public void mostrar() {
        this.setVisible(true);
    }
}

