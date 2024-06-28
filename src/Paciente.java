public class Paciente extends Persona{
    private String rtasTest;
    public Paciente(String nombre, String apellido, int dni, String usuario, String contraseña, String rtasTest) {
        super(nombre, apellido, dni, usuario, contraseña);
        this.rtasTest = rtasTest;
    }
    public String getRtasTest() {
        return rtasTest;
    }
    public void setRtasTest(String rtasTest) {
        this.rtasTest = rtasTest;
    }
    public void sacarTurno(){
        System.out.println("El turno fue dado de alta");
    }
    public void elegirEspecialista(){
        System.out.println("El especialista fue elegido");
    }
    public void hacerTest(){
        System.out.println("El paciente " + getNombre() + " " + getApellido() + " está haciendo el test de orientacion.");
    }
    public void revisarConfirmacion(){
        System.out.println("Revisando confirmacion");
    }
    public void verPerfilEspecialista(){
        System.out.println("Viendo el perfil del especialista");
    }
    //metodo abs
    public void revisarHorarioTurnos(){
        System.out.println("El paciente " +getNombre()+" " +getApellido() + " revisa la lista horarios de turnos de " +getRtasTest());
    }
    @Override
    public void revisarRtaTest() {
        System.out.println("El paciente revisa el resultado del test:  " +getRtasTest());
    }
}
