package Main;

import controladores.*;
import logica.*;
import gui.*;


public class Main{
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Logica facilidad = new Logica();
            facilidad.abrirInicio();
        });
    }
}
