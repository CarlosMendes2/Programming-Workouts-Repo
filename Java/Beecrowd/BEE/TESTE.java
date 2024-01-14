import java.util.Locale;
import java.util.Scanner;

public class TESTE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//.useLocale(Locale.US);
        double a = scan.nextDouble();
        System.out.println(testaFormato(a));
    }
    private static double testaFormato(double a){

        String deltaString = String.format("%.2f", a);
        double deltaM = Double.parseDouble(deltaString);
        return deltaM;
    }
}
