import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);
        double entradaA = scn.nextDouble();
        double entradaB = scn.nextDouble();
        double entradaC = scn.nextDouble();

        double resultado = media(entradaA, entradaB, entradaC);
        System.out.printf("MEDIA = %.1f%n",resultado);
    }

    private static double media(double a, double b, double c){
        return ((a*2)+(b*3)+(c*5))/10;
    }
}