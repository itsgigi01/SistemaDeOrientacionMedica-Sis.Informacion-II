public class Especialista extends Persona{
    private String especialidad;
    private String titulo;
    private String matricula;
    public Especialista(String nombre, String apellido, int dni, String usuario, String contraseña, String especialidad, String titulo, String matricula) {
        super(nombre, apellido, dni, usuario, contraseña);
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.matricula=matricula;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //metodo abs
    public void revisarHorarioTurnos(){
        System.out.println("La medica " +getNombre()+" " +getApellido() + " revisa la lista horarios de turnos de " +getEspecialidad());
    }
    @Override
    public void revisarRtaTest() {
        System.out.println("El médico revisa el resultado del test");
    }

}


