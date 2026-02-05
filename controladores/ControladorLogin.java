package controladores;

import gui.vistas.Inicio;
import logica.servicios.ServicioAutenticacion;

public class ControladorLogin {

    private Inicio inicio;
    private ControladorNavegacion nav;
    private ServicioAutenticacion auth = new ServicioAutenticacion();

    public ControladorLogin(Inicio inicio, ControladorNavegacion nav) {
        this.inicio = inicio;
        this.nav = nav;
        IniciarSesion();
    }

    private void IniciarSesion() {
        inicio.btnIniciarSesion.addActionListener(e -> login());
    }

    private void login() {
        String user = inicio.getTxtUsuario().getText();
        String pass = new String(inicio.getTxtPassword().getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            inicio.mostrarError("Campos vacíos");
            return;
        }

        if (auth.autenticar(user, pass)) {
            //nav.mostrar("correo"); //El bueno
            System.out.println("Sí entró tu");
            nav.mostrar("inicio");
        } else {
            inicio.mostrarError("Credenciales incorrectas");
        }
    }
}