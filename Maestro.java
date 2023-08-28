import java.util.Scanner;

public class Maestro {
    public static int id;
    public String nombre;
    public String correo;
    public String especialidad;

    // Método constructor
    Maestro(){
        System.out.println("Objeto declarado");
        id++;
    }

    Maestro(String nombre, String correo){
        System.out.println("Objeto declarado");
        this.nombre = nombre;
        this.correo = correo;
        id++;
    }
    public void mostrarNombre(){
        System.out.println("Hola me llamo: " + nombre);
    }
    public void mostrarID(){
        System.out.println("El ID del maestro es: " + id);
    }
}