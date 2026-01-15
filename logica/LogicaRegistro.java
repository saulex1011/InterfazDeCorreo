package logica;

public class LogicaRegistro {

    public void abrirRegistro() {
        // 1. Creamos el objeto de la segunda ventana
        Registro registrar = new Registro();
        
        // 2. La hacemos visible
        registrar.mostrar();
        
        // OPCIONAL: Si quieres cerrar la ventana principal al abrir esta:
        // ((JFrame)javax.swing.SwingUtilities.getWindowAncestor((java.awt.Component)e.getSource())).dispose();
    }
}