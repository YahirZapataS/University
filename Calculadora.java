import java.lang.foreign.VaList;

public class Calculadora {
    public final static double pi = 3.1416;

    public static int suma(int valorA, int valorB){
        return valorA + valorB;
    }

    public static double suma(double valorA, int valorB){
        return valorA + valorB;
    }

    public static double suma(int valorA, double valorB){
        return valorA + valorB;
    }

    public static double suma(double valorA, double valorB){
        return valorA + valorA;
    }
}
