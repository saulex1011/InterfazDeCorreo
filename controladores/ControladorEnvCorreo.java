package controladores;

import java.awt.*;
import javax.swing.*;
import gui.Correo;
import gui.EnvCorreo;
import logica.LogicaCorreo;
import logica.LogicaEnvCorreo;

/*
    Idea: La idea del Envcorreo es crear una interfaz donde el usuario
    pueda redactar un correo nuevo, con destinatario, asunto y cuerpo del
    mensaje. Al enviar el correo, este debe guardarse en la bandeja de
    salida del usuario y en la bandeja de entrada del destinatario. Además,
    debe tener lo siguiente:
    - Drag and drop para adjuntar archivos.
    - Validación de direcciones de correo electrónico (Poner un aviso de que el correo no existe).
    - Poder enviar correos a múltiples destinatarios y a grupos.
    - Fuentes, letras, tamaños, subrayado, negrita y cursiva (lo básico).
    --Botones--
    Volver -> Abre la ventana de correo, sin guardar el correo (No se puede crear borradores/ opcional)(Correo.java)
    Enviar correo ->  Envía el correo, te da una confirmación, hace toda la logica de la bandeja y te envía a la bandeja de entrada (Correo.java)
*/

public class ControladorEnvCorreo{

}