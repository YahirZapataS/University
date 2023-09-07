package UI;

import Model.Estudiante;
import Model.Maestro;
import Model.Secretaria;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MESES = {"Enero", "Febrero", "Marzo" , "Abril", "Mayo", "Junio", "Julio", "Agosto",
    "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Maestro maestroLogeado;
    public static Estudiante estudianteLogeado;

    public static void mostrarMenu(){
        System.out.println("...:::Bienvenido:::...");
        System.out.println("Selecciona una opción");

        System.out.println("1. Maestros");
        System.out.println("2. Estudiantes");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);
        int respuesta = 0;

        do{
            respuesta = sc.nextInt();
            switch(respuesta){
                case 1:
                    System.out.println("...:::Maestro:::...");
                    loginUsuario(1);
                    break;
                case 2:
                    System.out.println("...:::Estudiante:::...");
                    loginUsuario(2);
                    break;
                case 3:
                    System.out.println("...:::Adiós:::...");
                    System.exit(respuesta);
                    break;
                default:
                    System.out.println("Seleccione una opción correcta");
            }
        }while(respuesta != 3);
    }

    private static void loginUsuario(int tipoUsuario) {
        ArrayList<Maestro> maestros = new ArrayList<>();
        maestros.add(new Maestro("Luis Morales", "moralesuv@uv.mx"));
        maestros.add(new Maestro("Javier Pino", "jpino@uv.mx"));
        maestros.add(new Maestro("Jose Vergara", "jvergara@uv.mx"));
        maestros.add(new Maestro("Patricia Martinez", "pmartinez@uv.mx"));

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Rocael", "roca@uv.mx"));
        estudiantes.add(new Estudiante("Mercader", "mercader@uv.mx"));
        estudiantes.add(new Estudiante("Carlos", "carlos@uv.mx"));
        estudiantes.add(new Estudiante("Gerardo", "gerard@uv.mx"));

        ArrayList<Secretaria> secretarias = new ArrayList<>();


        boolean correoCorrecto = false;
        do {
            System.out.println("Ingresa el correo");
            Scanner sc = new Scanner(System.in);
            String correo = sc.nextLine();

            if (tipoUsuario == 1) {
                for (Maestro maestro : maestros) {
                    if (maestro.getCorreo().equals(correo)) {
                        maestroLogeado = maestro;
                        UIMaestro.mostrarMenuMaestro();
                    }
                }
            }

            if (tipoUsuario == 2) {
                for (Estudiante estudiante : estudiantes) {
                    if (estudiante.getCorreo().equals(correo)) {
                        estudianteLogeado = estudiante;
                        UIEstudiante.menuEstudiante();
                    }
                }
            }

        } while (!correoCorrecto);
    }

}