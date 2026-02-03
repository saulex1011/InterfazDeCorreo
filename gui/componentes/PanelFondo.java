package gui.componentes;

import java.awt.*;
import javax.swing.*;

public class PanelFondo extends JPanel {

    private Image fondo;

    public PanelFondo(String ruta) {
        fondo = new ImageIcon(
            getClass().getClassLoader().getResource(ruta)
        ).getImage();
        
        System.out.println(getClass().getClassLoader().getResource(ruta));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fondo != null) {
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}