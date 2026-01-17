package Main;

import controladores.*;
import gui.*;

public class Main{
    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        new ControladorInicio(inicio);

        inicio.setVisible(true);
    }
}
