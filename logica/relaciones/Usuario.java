package logica.relaciones;

// Clase interna para el Usuario
private class Usuario {
    private String nombreUsuario;
    private String email;
    private String nombresCompletos;
    private LocalDate fechaNacimiento;
    private String contrasena;

    public Usuario(String nombreUsuario, String email, String nombresCompletos, 
                  LocalDate fechaNacimiento, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.nombresCompletos = nombresCompletos;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() { return nombreUsuario; }
        
    @Override
    public String toString() {
        return nombreUsuario + "," + email + "," + nombresCompletos + "," + 
                fechaNacimiento.format(DATE_FORMATTER) + "," + contrasena;
    }

    private void registrarUsuario() {
        try {
            if (!validarCampos()) {
                return;
            }
            
            LocalDate fechaNacimiento = LocalDate.parse(vista.getFechaNacimiento(), DATE_FORMATTER);
            
            Usuario nuevoUsuario = new Usuario(
                vista.getNombreUsuario(),
                vista.getEmail(),
                vista.getNombresCompletos(),
                fechaNacimiento,
                vista.getContrasena()
            );
            
            if (usuarioExiste(nuevoUsuario.getNombreUsuario())) {
                JOptionPane.showMessageDialog(vista, 
                    "El nombre de usuario ya está registrado.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            guardarUsuario(nuevoUsuario);
            
            JOptionPane.showMessageDialog(vista, 
                "Usuario registrado exitosamente!", 
                "Éxito", 
                JOptionPane.INFORMATION_MESSAGE);
            
            vista.limpiarCampos();
            
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(vista, 
                "Formato de fecha incorrecto. Use dd/mm/aaaa", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, 
                "Error al registrar usuario: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validarCampos() {
        if (vista.getNombreUsuario().isEmpty() || 
            vista.getEmail().isEmpty() || 
            vista.getNombresCompletos().isEmpty() || 
            vista.getFechaNacimiento().isEmpty() || 
            vista.getContrasena().isEmpty()) {
            
            JOptionPane.showMessageDialog(vista, 
                "Todos los campos son obligatorios.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!vista.getContrasena().equals(vista.getRepetirContrasena())) {
            JOptionPane.showMessageDialog(vista, 
                "Las contraseñas no coinciden.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!vista.getEmail().contains("@")) {
            JOptionPane.showMessageDialog(vista, 
                "El email no es válido.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    private boolean usuarioExiste(String nombreUsuario) {
        try {
            File archivo = new File(ARCHIVO_USUARIOS);
            if (!archivo.exists()) {
                return false;
            }
            
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length > 0 && partes[0].equals(nombreUsuario)) {
                    br.close();
                    return true;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void guardarUsuario(Usuario usuario) {
        try {
            FileWriter fw = new FileWriter(ARCHIVO_USUARIOS, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            
            out.println(usuario.toString());
            
            out.close();
            bw.close();
            fw.close();
            
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar usuario: " + e.getMessage());
        }
    }
}