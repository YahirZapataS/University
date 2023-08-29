public class Estudiante {
    public String nombre;
    public String correo;
    public String matricula;
    public String telefono;
    public String semestre;

     Estudiante(String nombre, String correo){
         this.nombre = nombre;
         this.correo = correo;
     }
     public void mostrarNombre(){
         System.out.println("Me llamo: " + nombre);
     }
}