package logica.logicavistas;

import gui.vistas.Registro;

public class LogicaRegistro {
    private Registro vistaRegistro;

    public LogicaRegistro(Registro vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    // Métodos para obtener los datos ingresados por el usuario
    public String getNombreUsuario() {
        return vistaRegistro.txtNombreUsuario.getText().trim();
    }
    
    public String getEmail() {
        return vistaRegistro.txtEmail.getText().trim();
    }
    
    public String getNombresCompletos() {
        return vistaRegistro.txtNombresCompletos.getText().trim();
    }
    
    public String getFechaNacimiento() {
        return vistaRegistro.txtFechaNacimiento.getText().trim();
    }
    
    public String getContrasena() {
        return new String(vistaRegistro.txtContrasena.getPassword());
    }
    
    public String getRepetirContrasena() {
        return new String(vistaRegistro.txtRepetirContrasena.getPassword());
    }
    
    public void limpiarCampos() {
        vistaRegistro.txtNombreUsuario.setText("");
        vistaRegistro.txtEmail.setText("");
        vistaRegistro.txtNombresCompletos.setText("");
        vistaRegistro.txtFechaNacimiento.setText("");
        vistaRegistro.txtContrasena.setText("");
        vistaRegistro.txtRepetirContrasena.setText("");
    }
}
