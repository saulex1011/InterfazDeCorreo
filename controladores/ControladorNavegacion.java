package controladores;

import gui.VentanaPrincipal;
import gui.vistas.*;

//Controlador básico para el inicio
public class ControladorNavegacion {

    private VentanaPrincipal ventana;

    public ControladorNavegacion(VentanaPrincipal ventana) {
        this.ventana = ventana;

        Inicio inicio = new Inicio();
        Registro registro = new Registro();
        //Correo correo = new Correo();

        ventana.agregarVista(inicio, "inicio");
        ventana.agregarVista(registro, "registro");
        //ventana.agregarVista(correo, "correo");

        //==== CONTROLADORES DE INICIO ====
        inicio.btnRegistrar.addActionListener(e ->
                mostrar("registro")
        );

        //Conexión con el controlador de login
        new ControladorLogin(inicio, this);
        //Conexión con el controlador de registro
        new ControladorRegistro(this, registro);  
    }

    public void mostrar(String vista) {
        //ventana.mostrarVista("correo"); //El bueno
        ventana.mostrarVista(vista);
    }
}
