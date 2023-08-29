package TestMain;
public class TestEstudiante {
    public String nombre;
    public String correo;
    public String matricula;
    public static int endDigitMatricula;
    public String telefono;
    public String semestre;

    TestEstudiante(){
        System.out.println("Objeto estudiante, creado");
        endDigitMatricula++;

    }
    TestEstudiante(String nombre, String correo, String matricula, String telefono, String semestre){
        this.nombre = nombre;
        this.correo = correo;
        this.matricula = matricula;
        this.telefono = telefono;
        this.semestre = semestre;
        endDigitMatricula++;
    }

    public void mostrarNombreEstudiante(){
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Matricula: " + matricula + endDigitMatricula);
        System.out.println("Telefono: " + telefono);
        System.out.println("Semestre: " + semestre);
    }
}
