package lab2p2_lloydcooper;

public class Usuario {
    private String nombreUsuario;
    private String contrasenia;
    private boolean esAdministrativo;
    
    // Constructor
    public Usuario(String nombreUsuario, String contrasenia, boolean esAdministrativo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.esAdministrativo = esAdministrativo;
    }
    
    // Getters y Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isEsAdministrativo() {
        return esAdministrativo;
    }

    public void setEsAdministrativo(boolean esAdministrativo) {
        this.esAdministrativo = esAdministrativo;
    }    
    // Método para validar si el usuario actual es administrativo o no
    public boolean isPersonalAdmin() {
        return this.esAdministrativo;
    }
    
}

