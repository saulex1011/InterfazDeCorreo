import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Logica facilidad = new Logica();
            facilidad.abrirInicio();
        });
    }
}
