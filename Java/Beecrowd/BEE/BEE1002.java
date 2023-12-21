import java.io.IOException;
import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double entrada = scn.nextDouble();
        double msg = areaCirculo(entrada);
        System.out.printf("A=%.4f%n",msg);
        scn.close();
    }
    public static double areaCirculo(double a){
        final double PI = 3.14159;
        double calculo = PI * (Math.pow(a,2));
        return calculo;
    }
}
