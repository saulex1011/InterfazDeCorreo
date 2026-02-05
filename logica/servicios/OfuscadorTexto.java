package logica.servicios;

public class OfuscadorTexto {

    private static final char CLAVE = 'K';

    public static String ofuscar(String texto) {
        char[] resultado = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            resultado[i] = (char) (texto.charAt(i) ^ CLAVE);
        }
        return new String(resultado);
    }

    public static String desofuscar(String texto) {
        return ofuscar(texto); // XOR es reversible
    }
}