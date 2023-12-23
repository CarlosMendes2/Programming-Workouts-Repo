import java.util.Locale;
import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        calculaConsumo(scan);
    }

    private static void calculaConsumo(Scanner scan) {
        int distanciaTotal = inputInt(scan);
        double combustivelGasto = inputDouble(scan);
        double calculo = distanciaTotal / combustivelGasto;
        System.out.printf("%.3f km/l%n",calculo);
    }

    private static double inputDouble(Scanner scan) {
        if(scan.hasNextDouble()){
            return scan.nextDouble();
        }
        scan.nextLine();
        return inputDouble(scan);
    }

    private static int inputInt(Scanner scan) {
        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        scan.nextLine();
        return inputInt(scan);
    }
}
