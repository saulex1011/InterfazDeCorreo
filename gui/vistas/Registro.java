package gui.vistas;

import gui.componentes.PanelFondo;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Registro extends PanelFondo{
    
    //botones
    public JButton btnRegistrar;
    public JButton btnVolver;

    //información de registro
    public JTextField txtNombreUsuario;
    public JTextField txtEmail;
    public JTextField txtNombresCompletos;
    public JTextField txtFechaNacimiento;
    public JPasswordField txtContrasena;
    public JPasswordField txtRepetirContrasena;

    public Registro() {
        // =====PANEL DE FONDO=====

        super("util/imagenes/fondo.png");
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Registro de Nuevo Usuario", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel formPanel = new JPanel(new GridLayout(7, 2, 10, 10));
        
        txtNombreUsuario = new JTextField();
        txtEmail = new JTextField();
        txtNombresCompletos = new JTextField();
        txtFechaNacimiento = new JTextField();
        txtContrasena = new JPasswordField();
        txtRepetirContrasena = new JPasswordField();

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnVolver = new JButton("Volver");
        btnRegistrar = new JButton("Registrar"); 

        //Añadir los compontentes a la ventana (.add)
        mainPanel.add(titulo, BorderLayout.NORTH);

        formPanel.add(new JLabel("<html><font color='#E7F716'>Nombre de usuario:</font></html>"));
        formPanel.add(txtNombreUsuario);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Correo electrónico:</font></html>"));
        formPanel.add(txtEmail);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Nombres Completos:</font></html>"));        
        formPanel.add(txtNombresCompletos);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Fecha de nacimiento (dd/mm/aaaa):</font></html>"));
        formPanel.add(txtFechaNacimiento);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Contraseña:</font></html>"));
        formPanel.add(txtContrasena);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Repetir contraseña:</font></html>"));
        formPanel.add(txtRepetirContrasena);

        buttonPanel.add(btnVolver);
        buttonPanel.add(btnRegistrar);

        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        formPanel.setOpaque(false); // Hacer el panel transparente
        buttonPanel.setOpaque(false); // Hacer el panel transparente
        mainPanel.setOpaque(false); // Hacer el panel transparente

        this.add(mainPanel);
    }
}
