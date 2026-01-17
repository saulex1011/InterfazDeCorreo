package controladores;

import gui.Inicio;

/*
    Idea: La idea del registro que permita al usuario crear una nueva
    cuenta, debemos modificar los datos de usuarios y contraseñas para
    añadir el nuevo usuario, contraseña y además que tenga su propia
    bandeja de correos.
    --Botones--
    Volver -> Abre la ventana de inicio sin guardar nuevos datos (toca hacer que aunque escriban en el panel, esa información no se guarde) (Inicio.java)
    Guardar -> Guarda los nuevos datos de usuario y contraseña y vuelve a la ventana de inicio (Inicio.java)
*/

public class ControladorRegistro{
    
    public void abrirInicio() {
        // 1. Creamos el objeto de la segunda ventana
        Inicio comenzar = new Inicio();
        
        // 2. La hacemos visible
        comenzar.mostrar();
        
        // OPCIONAL: Si quieres cerrar la ventana principal al abrir esta:
        // ((JFrame)javax.swing.SwingUtilities.getWindowAncestor((java.awt.Component)e.getSource())).dispose();
    }
}