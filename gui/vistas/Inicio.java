package gui.vistas;

import gui.componentes.PanelFondo;
import java.awt.*;
import java.net.URL; // Import necesario para buscar la imagen
import javax.swing.*;

public class Inicio extends PanelFondo {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    public JButton btnIniciarSesion;
    public JButton btnRegistrar;

    public Inicio() {

        // ===== PANEL DE FONDO =====
        super("util/imagenes/fondo.png");
        setLayout(new BorderLayout());

        // ===== Inicializamos Txt =====
        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();

        // ===== PANEL PRINCIPAL (Contenedor transparente) =====
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false); // Hacer el panel transparente

        // =======================================================
        // NUEVO BLOQUE: ENCABEZADO CON LOGO Y TÍTULO
        // =======================================================
        JPanel panelEncabezado = new JPanel(new BorderLayout());
        panelEncabezado.setOpaque(false); // Transparente para ver el fondo
        // Margen superior para que el logo no toque el techo de la ventana
        panelEncabezado.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        // 1. Cargar y Redimensionar Logo
        URL urlLogo = getClass().getResource("/util/imagenes/logo_original.png");
        
        if (urlLogo != null) {
            ImageIcon iconoOriginal = new ImageIcon(urlLogo);
            // Cambia 120, 120 si quieres el logo más grande o más pequeño
            Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            JLabel lblLogo = new JLabel(new ImageIcon(imagenRedimensionada));
            lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
            
            // Agregamos el logo al centro del encabezado
            panelEncabezado.add(lblLogo, BorderLayout.CENTER);
        } else {
            System.err.println("No se encontró el logo en /util/imagenes/logo_original.png");
        }

        // 2. Título (Lo ponemos debajo del logo)
        JLabel titulo = new JLabel("Inicio de Sesión", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        // Un poco de margen entre el logo y el texto
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); 
        
        panelEncabezado.add(titulo, BorderLayout.SOUTH);

        // Agregamos todo el encabezado a la parte SUPERIOR (North) del panel
        panel.add(panelEncabezado, BorderLayout.NORTH);

        // ===== PANEL FORMULARIO =====
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        formPanel.setOpaque(false); // Hacer el panel transparente

        // ===== BOTONES =====
        btnIniciarSesion = new JButton("Iniciar sesión");
        btnRegistrar = new JButton("Registrar nuevo usuario");

        // Agregamos componentes al formulario
        formPanel.add(new JLabel("<html><font color='#E7F716'>Usuario:</font></html>"));
        formPanel.add(txtUsuario);
        formPanel.add(new JLabel("<html><font color='#E7F716'>Contraseña:</font></html>"));
        formPanel.add(txtPassword);
        
        // Espacios vacíos o etiquetas extra si las necesitas, sino directo los botones:
        formPanel.add(btnIniciarSesion);
        formPanel.add(btnRegistrar);

        // ===== AGREGAR AL PANEL PRINCIPAL =====
        panel.add(formPanel, BorderLayout.CENTER);

        // ===== AGREGAR A LA VENTANA =====
        add(panel, BorderLayout.CENTER);
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void mostrarError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}