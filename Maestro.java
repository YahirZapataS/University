public class Maestro {
    public static int id;
    public String nombre;
    public String correo;
    public String especialidad;

    Maestro(){
        System.out.println("Objeto declarado");
        id++;
    }

    Maestro(String nombre, String correo, String especialidad){
        System.out.println("Objeto declarado");
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
        id++;
    }
    public void mostrarNombre(){
        System.out.println("Hola me llamo: " + nombre);
    }
    public void mostrarID(){
        System.out.println("Mi ID de maestro es: " + id);
    }

    public void mostrarEspecialidad(){
        System.out.println("Mi especialidad es: " + especialidad);
    }
}