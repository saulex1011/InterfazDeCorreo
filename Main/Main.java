package Main;

import controladores.ControladorNavegacion;
import gui.VentanaPrincipal;

public class Main{
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        new ControladorNavegacion(ventana);
        ventana.mostrarVista("inicio");
        ventana.setVisible(true);

    }
}
