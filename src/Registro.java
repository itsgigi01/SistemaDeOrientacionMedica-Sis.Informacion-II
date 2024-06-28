public class Registro {
    String usuario;
    String contraseña;
    public Registro(String usuario, String contraseña) {
        this.usuario=usuario;
        this.contraseña=contraseña;
    }
    public void guardarInformacionRegistro() {
        System.out.println("Se guardó la información de registro");
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}