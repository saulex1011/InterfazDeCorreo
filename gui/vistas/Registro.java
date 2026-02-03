package gui.vistas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Registro extends JPanel {
    public JButton btnRegistrar;
    public JButton btnVolver;
    public JTextField txtNombreUsuario;
    public JTextField txtEmail;
    public JTextField txtNombresCompletos;
    public JTextField txtFechaNacimiento;
    public JPasswordField txtContrasena;
    public JPasswordField txtRepetirContrasena;

    public Registro() {
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Registro de Nuevo Usuario", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(titulo, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(7, 2, 10, 10));
        
        formPanel.add(new JLabel("Nombre de usuario:"));
        txtNombreUsuario = new JTextField();
        formPanel.add(txtNombreUsuario);

        formPanel.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        formPanel.add(txtEmail);

        formPanel.add(new JLabel("Nombres Completos:"));
        txtNombresCompletos = new JTextField();
        formPanel.add(txtNombresCompletos);

        formPanel.add(new JLabel("Fecha de nacimiento (dd/mm/aaaa):"));
        txtFechaNacimiento = new JTextField();
        formPanel.add(txtFechaNacimiento);

        formPanel.add(new JLabel("Contraseña:"));
        txtContrasena = new JPasswordField();
        formPanel.add(txtContrasena);

        formPanel.add(new JLabel("Repetir contraseña:"));
        txtRepetirContrasena = new JPasswordField();
        formPanel.add(txtRepetirContrasena);

        mainPanel.add(formPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnVolver = new JButton("Volver");
        btnRegistrar = new JButton("Registrar");
        buttonPanel.add(btnVolver);
        buttonPanel.add(btnRegistrar);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(mainPanel);
    }
    
    public String getNombreUsuario() {
        return txtNombreUsuario.getText().trim();
    }
    
    public String getEmail() {
        return txtEmail.getText().trim();
    }
    
    public String getNombresCompletos() {
        return txtNombresCompletos.getText().trim();
    }
    
    public String getFechaNacimiento() {
        return txtFechaNacimiento.getText().trim();
    }
    
    public String getContrasena() {
        return new String(txtContrasena.getPassword());
    }
    
    public String getRepetirContrasena() {
        return new String(txtRepetirContrasena.getPassword());
    }
    
    public void limpiarCampos() {
        txtNombreUsuario.setText("");
        txtEmail.setText("");
        txtNombresCompletos.setText("");
        txtFechaNacimiento.setText("");
        txtContrasena.setText("");
        txtRepetirContrasena.setText("");
    }
}
