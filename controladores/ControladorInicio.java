package controladores;

import gui.About;
import gui.Correo;
import gui.Inicio;
import gui.Registro;
import logica.LogicaAbout;
import logica.LogicaCorreo;
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
    
    private Inicio inicio;
    private Registro registro;
    private Correo correo;
    private About about;
    private LogicaInicio logica;
    private LogicaCorreo logicaCorreo;
    private LogicaAbout logicaAbout;

    //=====Clases de Inicio=====
    
    public ControladorInicio(Inicio inicio) {

        this.inicio = inicio;

        inicio.btnRegistrar.addActionListener(e-> abrirRegistro());
    }

    public void mostrarInicio(){
        // Hacemos visible la ventana de Inicio
        inicio.setVisible(true);
    }

    public void abrirRegistro() {
        // Creamos la ventana de nuevo Registro
        Registro comenzar = new Registro();
        
        //Hacemos visible el registro y dejammos en espera Inicio
        comenzar.setVisible(true);
        inicio.dispose();
    }
}
