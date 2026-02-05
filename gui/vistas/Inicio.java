package gui.vistas;

import gui.componentes.PanelFondo;
import java.awt.*;
import javax.swing.*;

// Clase que contiene la interfaz gráfica de inicio de sesión (La primera que se muestra al usuario) 
// && Limitaciones: No guarda si ya hay un usuario registrado
public class Inicio extends PanelFondo{
    
    public JButton btnIniciarSesion;
    public JButton btnRegistrar;

    public Inicio() {

        // =====PANEL DE FONDO=====

        super("util/imagenes/fondo.png");
        setLayout(new BorderLayout());

        // ===== MENÚ SUPERIOR (Barra de herramientas)=====
/*
        JMenuBar menuBar = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemSalir = new JMenuItem("Salir");

        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem itemConfig = new JMenuItem("Configuración");

        JMenu menuOtros = new JMenu("Otros");
        JMenuItem itemAbout = new JMenuItem("About");


        setJMenuBar(menuBar);
*/
        // ===== PANEL PRINCIPAL =====
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false); // Hacer el panel transparente

        JLabel titulo = new JLabel("Inicio de Sesión", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);


        // ===== PANEL FORMULARIO =====
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        formPanel.setOpaque(false); // Hacer el panel transparente

        JTextField txtUsuario = new JTextField();

        JPasswordField txtPassword = new JPasswordField();

        // ===== BOTONES =====
        btnIniciarSesion = new JButton("Iniciar sesion");
        btnRegistrar = new JButton("Registrar nuevo usuario");

        //Añadir los compontentes a la ventana (.add)
/* 
        // ===== MENÚ SUPERIOR (Barra de herramientas)=====
        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemSalir);

        menuOpciones.add(itemConfig);

        menuOtros.add(itemAbout);

        menuBar.add(menuArchivo);
        menuBar.add(menuOpciones);
        menuBar.add(menuOtros);
*/
        // ===== PANEL PRINCIPAL =====
        panel.add(titulo, BorderLayout.NORTH);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Usuario:</font></html>"));

        // ===== PANEL FORMULARIO =====
        formPanel.add(txtUsuario);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Contraseña:</font></html>"));
        formPanel.add(txtPassword);

        // ===== BOTONES =====
        formPanel.add(btnIniciarSesion);
        formPanel.add(btnRegistrar);

        // ===== PANEL =====
        panel.add(formPanel, BorderLayout.CENTER);

        // ===== FONDO =====
        add(panel, BorderLayout.CENTER);

    }
}
