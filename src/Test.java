public class Test {
    private String preg;
    private String rtas;
    public Test(String preg, String rtas) {
        this.preg = preg;
        this.rtas = rtas;
    }
    public void setPreg(String preg) {
        this.preg = preg;
    }
    public String getPreg() {
        return preg;
    }
    public String getRtas() {
        return rtas;
    }
    public void setRtas(String rtas) {
        this.rtas = rtas;
    }
    public void darRecomendacionEspecialista(){
        System.out.println("Segun sus respuestas, el test le recomienda la especialidad:  especialidadRecomendada");
    }
}