import javax.swing.*;
import java.awt.*;

public class Logica extends JFrame{

    public void abrirRegistro() {
        // 1. Creamos el objeto de la segunda ventana
        Registro registrar = new Registro();
        
        // 2. La hacemos visible
        registrar.mostrar();
        
        // OPCIONAL: Si quieres cerrar la ventana principal al abrir esta:
        // ((JFrame)javax.swing.SwingUtilities.getWindowAncestor((java.awt.Component)e.getSource())).dispose();
    }

    public void abrirInicio() {
        // 1. Creamos el objeto de la segunda ventana
        Inicio comenzar = new Inicio();
        
        // 2. La hacemos visible
        comenzar.mostrar();
        
        // OPCIONAL: Si quieres cerrar la ventana principal al abrir esta:
        // ((JFrame)javax.swing.SwingUtilities.getWindowAncestor((java.awt.Component)e.getSource())).dispose();
    }
}
