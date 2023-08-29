package TestMain;

import java.util.Scanner;

public class TestUIMenu {
    public static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void mostrarMenu() {
        System.out.println("...:::Bienvenido:::...");
        System.out.println("Selecciona una opción");

        System.out.println("1. Maestros");
        System.out.println("2. Estudiantes");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);
        int respuesta = 0;

        do {
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("...:::Maestro:::...");
                    break;
                case 2:
                    System.out.println("...:::Estudiante:::...");
                    menuEstudiante();
                    break;
                case 3:
                    System.out.println("...:::Adiós:::...");
                    System.exit(respuesta);
                    break;
                default:
                    System.out.println("Seleccione una opción correcta");
            }
        } while (respuesta != 3);
    }

    public static void menuEstudiante() {
        System.out.println("1. Agendar Curso");
        System.out.println("2. Ver mis cursos");
        System.out.println("3. Cancelar");

        int respuesta = 0;

        do {
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Agendar un curso");
                    break;
                case 2:
                    System.out.println("Ver mis cursos");
                case 3:
                    System.out.println("Adios");
                    mostrarMenu();
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        } while (respuesta != 0);
    }
}

