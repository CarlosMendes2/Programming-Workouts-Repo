import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        salario();
    }

    private static void salario() {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String nome = inputString(scan);
        double salario = inputDouble(scan);
        double vendas = inputDouble(scan);
        salarioComBonus(salario,vendas);
    }

    private static void salarioComBonus(double salario, double vendas) {
        double bonus = vendas * 0.15;
        double salarioComBonus = salario + bonus;
        System.out.printf("TOTAL = R$ %.2f%n",salarioComBonus);
    }

    private static double inputDouble(Scanner sc) {
        if(sc.hasNextDouble()){
            return sc.nextDouble();
        }
        sc.nextLine();
        return inputDouble(sc);
    }

    private static String inputString(Scanner sc) {
        return sc.nextLine();
    }

}
