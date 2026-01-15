package controladores;

import java.awt.*;
import javax.swing.*;
import gui.Inicio;
import gui.Registro;
import logica.LogicaInicio;

/*
    Idea: La idea del about es que muestre información sobre el proyecto,
    como el nombre del proyecto, los autores y/o una breve descripción.
    --Botones--
    Volver -> Abre la ventana de inicio (Inicio.java)
*/

public class ControladorAbout{
    
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