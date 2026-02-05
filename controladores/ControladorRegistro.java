package controladores;

import gui.vistas.Registro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import logica.persistencia.UsuarioRepositorio;
import logica.relaciones.Usuario;
import logica.servicios.HashUtil;

public class ControladorRegistro {

    private Registro vista;
    private ControladorNavegacion nav;
    private UsuarioRepositorio repo = new UsuarioRepositorio();

    private static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ControladorRegistro(ControladorNavegacion nav, Registro vista) {
        this.vista = vista;
        this.nav = nav;
        
        //==== CONTROLADORES DE REGISTRO ====
        vista.btnRegistrar.addActionListener(e -> registrar());
        vista.btnVolver.addActionListener(e ->
                nav.mostrar("inicio")
        );
    }

    private void registrar() {
        try {
            if (!validar()) return;

            Usuario usuario = new Usuario(
                vista.txtNombreUsuario.getText(),
                vista.txtEmail.getText(),
                vista.txtNombresCompletos.getText(),
                LocalDate.parse(vista.txtFechaNacimiento.getText(), FORMATO),
                HashUtil.sha256(new String(vista.txtContrasena.getPassword()))
            );

            if (repo.existe(usuario.getNombreUsuario())) {
                JOptionPane.showMessageDialog(vista, "Usuario ya existe");
                return;
            }

            repo.guardar(usuario);
            JOptionPane.showMessageDialog(vista, "Registro exitoso");
            nav.mostrar("inicio");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Error en el registro");
        }
    }

    private boolean validar() {

        if (vista.txtNombreUsuario.getText().isEmpty() ||
            vista.txtEmail.getText().isEmpty() ||
            vista.txtNombresCompletos.getText().isEmpty() ||
            vista.txtFechaNacimiento.getText().isEmpty() ||
            vista.txtContrasena.getPassword().length == 0) {

            JOptionPane.showMessageDialog(vista, "Campos obligatorios");
            return false;
        }

        if (!new String(vista.txtContrasena.getPassword())
                .equals(new String(vista.txtRepetirContrasena.getPassword()))) {

            JOptionPane.showMessageDialog(vista, "Contraseñas no coinciden");
            return false;
        }

        return true;
    }
}
