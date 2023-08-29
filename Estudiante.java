public class Estudiante {
    public String nombre;
    public String correo;
    public String matricula;
    public String telefono;
    public String semestre;

     Estudiante(){
        System.out.println("Objeto estudiante, creado");
    }
     Estudiante(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public void mostrarNombre(){
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("Correo: " + correo);
    }
}