package logica.persistencia;

import java.io.*;
import logica.relaciones.Usuario;
import logica.servicios.OfuscadorTexto;

public class UsuarioRepositorio {

    private static final String ARCHIVO = "usuarios.txt";

    //Busca un usuario por su nombre de usuario y devuelve el usuario si lo encuentra
    //IDEA: unir Usuario y existe en un solo método que devuelva null o el usuario
    public Usuario buscar(String nombreUsuario) {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Usuario u = Usuario.fromString(linea);
                if (u.getNombreUsuario().equals(nombreUsuario)) {
                    return u;
                }
            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }

    // Busca si existe un usuario por su nombre de usuario
    public boolean existe(String nombreUsuario) {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String lineaLimpia = OfuscadorTexto.desofuscar(linea);
                Usuario u = Usuario.fromString(lineaLimpia);
                if (u.getNombreUsuario().equals(nombreUsuario)) {
                    return true;
                }
            }
        } catch (IOException e) {
            return false;
        }
        return false;
    }

    // Guarda un usuario en el archivo de persistencia
    public void guardar(Usuario usuario) {
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(ARCHIVO, true)))) {
                    String ofuscado = OfuscadorTexto.ofuscar(usuario.toString());
            out.println(usuario.toString());
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar usuario");
        }
    }

}