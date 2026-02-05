package logica.servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import logica.persistencia.UsuarioRepositorio;
import logica.relaciones.Usuario;

public class ServicioAutenticacion {

    private UsuarioRepositorio repo = new UsuarioRepositorio();

    public boolean autenticar(String usuario, String contrasena) {
        
        String hashIngresado = HashUtil.sha256(contrasena);

        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                
                String clara = OfuscadorTexto.desofuscar(linea);
                Usuario u = Usuario.fromString(linea);

                if (u.getNombreUsuario().equals(usuario) &&
                        u.getContrasena().equals(hashIngresado)) {
                    return true;
                }
            }

        } catch (IOException e) {
            return false;
        }

        return false;
    }
}