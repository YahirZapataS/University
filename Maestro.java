import java.util.Scanner;

public class Maestro {
    public static int id;
    public String nombre;
    public String correo;
    public String especialidad;

    Maestro(){
        System.out.println("Objeto declarado");
        id++;
    }
    public void mostrarNombre(){
        System.out.println("Hola me llamo: " + nombre);
    }
    public void mostrarID(){
        System.out.println("El ID del maestro es: " + id);
    }
}