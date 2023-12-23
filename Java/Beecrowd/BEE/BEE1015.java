import java.util.Locale;
import java.util.Scanner;

public class BEE1015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        distanciaDoisPontos(scan);
    }

    private static void distanciaDoisPontos(Scanner scan) {
        String[] coordenadaP1 = inputCoord(scan);
        String[] coordenadaP2 = inputCoord(scan);

        System.out.printf("%.4f%n",calculaDistanciaDoisPontos(coordenadaP1,coordenadaP2));
    }

    private static double calculaDistanciaDoisPontos(String[] p1, String[] p2) {
        double op1 = Math.pow(Double.parseDouble(p2[0]) - Double.parseDouble(p1[0]),2);
        double op2 = Math.pow(Double.parseDouble(p2[1]) - Double.parseDouble(p1[1]),2);

        return Math.pow((op1+op2),(double)1/2);
    }

    private static String[] inputCoord(Scanner scan) {
        return scan.nextLine().split(" ");
    }


}
