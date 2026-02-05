package logica.relaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import logica.servicios.OfuscadorTexto;


public class Usuario {

    private String nombreUsuario;
    private String email;
    private String nombresCompletos;
    private LocalDate fechaNacimiento;
    private String contrasena; // hash SHA-256 (NO PONER?)

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Usuario(String nombreUsuario, String email,
                   String nombresCompletos,
                   LocalDate fechaNacimiento,
                   String contrasena) {

        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.nombresCompletos = nombresCompletos;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        String claro = nombreUsuario + "," + email + "," + nombresCompletos + "," +
               fechaNacimiento.format(FORMATTER) + "," + contrasena;
        return OfuscadorTexto.ofuscar(claro);
    }

    public static Usuario fromString(String linea) {
        String clara = OfuscadorTexto.desofuscar(linea);
        
        String[] p = clara.split(",");
        
        if (p.length != 5) throw new IllegalArgumentException("Registro corrupto");

        return new Usuario(
            p[0],
            p[1],
            p[2],
            LocalDate.parse(p[3], FORMATTER),
            p[4]
        );
    }
}
