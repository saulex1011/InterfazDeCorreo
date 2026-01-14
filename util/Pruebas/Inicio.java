import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame{
    
    public Inicio() {
        setTitle("Sistema - Inicio de Sesión");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        Logica facilidad=new Logica();

        // ===== MENÚ SUPERIOR =====
        JMenuBar menuBar = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemSalir = new JMenuItem("Salir");

        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem itemConfig = new JMenuItem("Configuración");

        JMenu menuOtros = new JMenu("Otros");
        JMenuItem itemAbout = new JMenuItem("About");

        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemSalir);

        menuOpciones.add(itemConfig);

        menuOtros.add(itemAbout);

        menuBar.add(menuArchivo);
        menuBar.add(menuOpciones);
        menuBar.add(menuOtros);

        setJMenuBar(menuBar);

        // ===== PANEL PRINCIPAL =====
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Inicio de Sesión", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titulo, BorderLayout.NORTH);

        // ===== PANEL FORMULARIO =====
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        // Campos login
        formPanel.add(new JLabel("Usuario:"));
        JTextField txtUsuario = new JTextField();

        formPanel.add(txtUsuario);

        formPanel.add(new JLabel("Contraseña:"));
        JPasswordField txtPassword = new JPasswordField();

        formPanel.add(txtPassword);

        // Botones
        JButton btnLogin = new JButton("Ingresar");
        JButton btnRegistrar = new JButton("Registrar nuevo usuario");

        formPanel.add(btnLogin);
        formPanel.add(btnRegistrar);

        panel.add(formPanel, BorderLayout.CENTER);

        facilidad.comando("abrirReg");

        btnLogin.addActionListener(e-> facilidad.abrirRegistro());

        add(panel);
    }

    public void mostrar(){
        this.setVisible(true);
    }
}
