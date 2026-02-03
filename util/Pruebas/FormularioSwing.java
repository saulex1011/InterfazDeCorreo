
import java.awt.*;
import javax.swing.*;

public class FormularioSwing {

    public static void main(String[] args) {

        // Ejecutar en el Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {

            try {
                UIManager.setLookAndFeel(
                        UIManager.getSystemLookAndFeelClassName()
                );
            } catch (UnsupportedLookAndFeelException | ClassNotFoundException
                    | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
                System.err.println("Failed to set system look and feel: " + e.getMessage());
            }

            // Ventana principal
            JFrame frame = new JFrame("Formulario de Registro");
            frame.setSize(400, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Panel central con GridLayout
            JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));

            JLabel lblNombre = new JLabel("Nombre:");
            JTextField txtNombre = new JTextField();

            JLabel lblEdad = new JLabel("Edad:");
            JTextField txtEdad = new JTextField();

            JLabel lblPais = new JLabel("País:");
            JComboBox<String> comboPais = new JComboBox<>(
                    new String[]{"México", "Argentina", "España", "Colombia"}
            );

            panelFormulario.add(lblNombre);
            panelFormulario.add(txtNombre);
            panelFormulario.add(lblEdad);
            panelFormulario.add(txtEdad);
            panelFormulario.add(lblPais);
            panelFormulario.add(comboPais);

            // Panel inferior con botón
            JPanel panelBoton = new JPanel(new FlowLayout());
            JButton btnRegistrar = new JButton("Registrar");
            panelBoton.add(btnRegistrar);

            // Evento del botón
            btnRegistrar.addActionListener(e -> {
                String nombre = txtNombre.getText();
                String edad = txtEdad.getText();
                String pais = (String) comboPais.getSelectedItem();

                JOptionPane.showMessageDialog(
                        frame,
                        "Nombre: " + nombre
                        + "\nEdad: " + edad
                        + "\nPaís: " + pais,
                        "Datos Registrados",
                        JOptionPane.INFORMATION_MESSAGE
                );
            });

            // Agregar paneles al frame
            frame.add(panelFormulario, BorderLayout.CENTER);
            frame.add(panelBoton, BorderLayout.SOUTH);

            frame.setLocationRelativeTo(null); // Centrar ventana
            frame.setVisible(true);
        });
    }
}
