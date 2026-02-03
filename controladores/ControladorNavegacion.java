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
                ventana.mostrarVista("registro")
        );

        inicio.btnIniciarSesion.addActionListener(e ->
            System.out.println("Iniciar sesión clickeado")  //cambiar por la lógica de iniciar sesión  
            //ventana.mostrarVista("correo")
        );

        //==== CONTROLADORES DE REGISTRO ====
        registro.btnRegistrar.addActionListener(e->
                ventana.mostrarVista("inicio")
        );

        registro.btnVolver.addActionListener(e->
                ventana.mostrarVista("inicio")
        );  
    }
}
