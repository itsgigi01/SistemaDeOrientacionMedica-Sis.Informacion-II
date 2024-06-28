public class Turno extends Especialista{
    private String fecha;
    private String centro;
    public Turno(String nombre, String apellido, int dni, String usuario, String contraseña, String especialidad, String titulo,String matricula, String fecha, String centro) {
        super(nombre, apellido, dni, usuario, contraseña, especialidad, titulo, matricula);
        this.fecha = fecha;
        this.centro=centro;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getCentro() {
        return centro;
    }
    public void setCentro(String centro) {
        this.centro = centro;
    }
    public void enviarConfirmacion(){
        System.out.println("Se envio la confirmacion del turno al paciente");
    }
    public void altaTurno(){
        System.out.println("Se dio de alta el turno");
    }
    public void bajaTurno(){
        System.out.println("Se dio de baja el turno");
    }
}
