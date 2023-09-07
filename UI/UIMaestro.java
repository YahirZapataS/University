package UI;

import Model.Maestro;

import java.util.ArrayList;
import java.util.Scanner;
public class UIMaestro {
    public static ArrayList<Maestro> maestrosConCursosDisponibles = new ArrayList<>();

    public static void mostrarMenuMaestro(){
        System.out.println("Bienvenido " + UIMenu.maestroLogeado.getNombre());
        System.out.println("1. Registrar un curso disponible");
        System.out.println("2. Mostrar cursos agendados");
        System.out.println("0. Cerrar Sesión");

        int respuesta = 0;
        do {
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta){
                case 1:
                    mostrarRegistrarCurso();
                    break;
                case 2:
                    //Mostrar datos del maestro
                    break;
                case 0:
                    System.out.println("Adiós");
                    UIMenu.mostrarMenu();
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        }while(respuesta != 0);
    }

    public static void mostrarRegistrarCurso(){
        int respuesta = 0;
        do{
            System.out.println("..::Agendar un curso::..");
            System.out.println("Seleccione un mes: ");
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + ".-" + UIMenu.MESES[i]);
            }
            System.out.println("0.- Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            if(respuesta > 0 && respuesta < 4){
                int mesRespuesta = respuesta;
                System.out.println("Mes seleccionado: " + UIMenu.MESES[mesRespuesta - 1]);
                System.out.println("Ingresa la fecha a registrar: [dd/mm/yyyy]");
                String fecha = sc.nextLine();
                System.out.println("La fecha seleccionada es: " + fecha + "\n1.- Continuar\n2.-Cambiar fecha");
                int respuestaFecha = Integer.valueOf(sc.nextLine());
                if(respuestaFecha != 1) continue;

                int respuestaHora = 0;
                String hora = "";
                do{
                    System.out.println("Ingrese la hora disponible: [16:00]");
                    hora = sc.nextLine();
                    System.out.println("La hora seleecionada es: " + hora + "\n1.- Continuar\n2.-Cambiar Hora");
                    respuestaHora = Integer.valueOf(sc.nextLine());
                }while(respuestaHora != 1);

                UIMenu.maestroLogeado.addCursoDisponible(fecha, hora);
                consultarExistenciaEnMaestroConCursos(UIMenu.maestroLogeado);
            }else if(respuesta == 0){
                mostrarMenuMaestro();
            }
        }while(respuesta != 0);
    }
    public static void consultarExistenciaEnMaestroConCursos(Maestro maestro){
        if(!maestrosConCursosDisponibles.contains(maestro)){
            maestrosConCursosDisponibles.add(maestro);
        }
    }
}
