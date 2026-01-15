package controladores;

import java.awt.*;
import javax.swing.*;
import gui.Inicio;
import gui.Registro;
import logica.LogicaInicio;

/*
    Idea: La idea del inicio es que sea la bienvenida
    del proyecto, debemos añadir un título de bienvenida
    y el apartado para iniciar sesión y un btón para registrarse.
    --Botones--
    Iniciar sesión -> Abre el correo del usuario (Correo.java)
    Registrarse -> Abre la ventana de registro (Registro.java)
    About -> Muestra información del proyecto (About.java)
*/

public class ControladorInicio{
    
    private LogicaInicio logica;
    private Inicio inicio;
    /* Ejemplo de constructor con inyección de dependencias
    public InicioControlador(LogicaInicio logica, Inicio inicio) {
        this.logica = logica;
        this.inicio = inicio;

    }
    */



    public void abrirInicio() {
        // 1. Creamos el objeto de la segunda ventana
        Inicio comenzar = new Inicio();
        
        // 2. La hacemos visible
        comenzar.mostrar();
        
        // OPCIONAL: Si quieres cerrar la ventana principal al abrir esta:
        // ((JFrame)javax.swing.SwingUtilities.getWindowAncestor((java.awt.Component)e.getSource())).dispose();
    }
}
