package UI;

import java.util.Scanner;

public class UIEstudiante {

    public static void menuEstudiante() {
        System.out.println("...:::Bienvenido " + UIMenu.estudianteLogeado.getNombre() + ":::...");
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
                    mostrarRegistrarCurso();
                    break;
                case 2:
                    System.out.println("Ver mis cursos");
                case 3:
                    System.out.println("Adios");
                    UIMenu.mostrarMenu();
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        } while (respuesta != 0);
    }

    public static void mostrarRegistrarCurso() {
        int respuesta = 0;
        do {
            System.out.println("..::Agendar un curso::..");
            System.out.println("Seleccione un mes: ");
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + ".-" + UIMenu.MESES[i]);
            }
            System.out.println("0.- Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            if (respuesta > 0 && respuesta < 4) {
                int mesRespuesta = respuesta;
                System.out.println("Mes seleccionado: " + UIMenu.MESES[mesRespuesta - 1]);
                System.out.println("Ingresa la fecha a registrar: [dd/mm/yyyy]");
                String fecha = sc.nextLine();
                System.out.println("La fecha seleccionada es: " + fecha + "\n1.- Continuar\n2.-Cambiar fecha");
                int respuestaFecha = Integer.valueOf(sc.nextLine());
                if (respuestaFecha != 1) continue;

                int respuestaHora = 0;
                String hora = "";
                do {
                    System.out.println("Ingrese la hora disponible: [16:00]");
                    hora = sc.nextLine();
                    System.out.println("La hora seleecionada es: " + hora + "\n1.- Continuar\n2.-Cambiar Hora");
                    respuestaHora = Integer.valueOf(sc.nextLine());
                } while (respuestaHora != 1);
            }else if(respuesta == 0){
                menuEstudiante();
            }
        }while (respuesta != 0);
    }
}
