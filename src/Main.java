//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        borrarPantalla();

        Especialista especialista = new Especialista("Maria","Rodriguez",123456789,"mrodri","123rodri@ma","Cardiologia","Medico especialista en Cardiologia", "P800642");

        Turno turno=new Turno("Maria","Rodriguez",123456789,"mrodri","123rodri@ma","Cardiologia","Medico especialista en Cardiologia", "P800642","Lunes 13/11 18hs","MediSana");

        Paciente paciente1= new Paciente("Ana","Lopez",21123456,"alopez","c14v3ana","Cardiologia");
        Registro registro1= new Registro("mrodri","123rodri@ma");
        Registro registro2= new Registro("alopez","c14v3ana");

        Test test=new Test("\n 1: ¿Experimenta algún síntoma o malestar en este momento?"+
                "\n 2: ¿Está tomando algún medicamento actualmente?" +
                "\n 3: En caso de que la pregunta 1 sea afirmativa. ¿Por cuánto tiempo ha experimentado sus síntomas?"+
                "\n 4: ¿Cuál de los siguientes síntomas experimenta con mayor frecuencia?" +
                "\n 5: ¿Tiene algún diagnóstico previo?"+
                "\n 6: ¿Ha estado en contacto con pacientes que tienen alguna enfermedad infecciosa recientemente?" +
                "\n 7: ¿Podría describir la intensidad de tu síntoma en una escala del 1 al 10, siendo 1 lo menos intenso y 10 lo más intenso?" +
                "\n 8: ¿Tiene antecedentes familiares de problemas de salud similares?" ,
                "\n 1: Si" +"\n 2: No" +"\n 3: 1 mes "+"\n 4: C. Mareos"+"\n 5: No" +
                        "\n 6: No"+"\n 7: 6"+"\n 8: No");

        System.out.println("----------------------------------------------------------------");
        System.out.println("                     E S P E C I A L I S T A");
        System.out.println("");
        System.out.println("Nombre: "+especialista.getNombre());
        System.out.println("Apellido: "+especialista.getApellido());
        System.out.println("DNI: "+especialista.getDni());
        System.out.println("Usuario: "+especialista.getUsuario());
        System.out.println("Contraseña: "+especialista.getContraseña());
        System.out.println("Especialidad: "+especialista.getEspecialidad());
        System.out.println("Titulo: " +especialista.getTitulo());
        especialista.revisarRtaTest();
        especialista.revisarHorarioTurnos();

        System.out.println("----------------------------------------------------------------");
        System.out.println("                        P A C I E N T E ");
        System.out.println("Nombre: "+paciente1.getNombre());
        System.out.println("Apellido: "+paciente1.getApellido());
        System.out.println("DNI: "+paciente1.getDni());
        System.out.println("Usuario: "+paciente1.getUsuario());
        System.out.println("Contraseña: "+paciente1.getContraseña());
        System.out.println("Recomendacion del test: "+paciente1.getRtasTest());
        paciente1.revisarRtaTest();
        paciente1.revisarHorarioTurnos();

        System.out.println("----------------------------------------------------------------");
        System.out.println("                           T U R N O");
        System.out.println("Nombre del especialista: "+turno.getNombre() + turno.getApellido());
        System.out.println("Fecha del turno: " +turno.getFecha());
        System.out.println("Centro de salud: " +turno.getCentro());
        System.out.println("----------------------------------------------------------------");
        System.out.println("                          T E S T ");
        System.out.println("PREGUNTAS : \n" +test.getPreg());
        System.out.println("RESPUESTAS: \n"+test.getRtas());
        test.darRecomendacionEspecialista();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                          REGISTRO");
        System.out.println("- ESPECIALISTA -");
        System.out.println("Usuario: "+ registro1.getUsuario());
        System.out.println("Contraseña: "+ registro1.getContraseña());
        System.out.println("");
        System.out.println("- PACIENTE -");
        System.out.println("Usuario: "+ registro2.getUsuario());
        System.out.println("Contraseña: "+ registro2.getContraseña());
    }

    public static void borrarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}