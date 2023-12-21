import java.util.Locale;
import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in).useLocale(Locale.US);
       int numeroFuncionario = getInt(scan);
       int numeroHoras = getInt(scan);
       double valorHora = getDouble(scan);
       System.out.printf("NUMBER = %d%n",numeroFuncionario);
       salario(numeroHoras,valorHora);

    }

    private static void salario(int numHoras, double valorHoras){
        double salario = numHoras * valorHoras;
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
    private static int getInt(Scanner scan){
        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        scan.nextLine();
        return getInt(scan);
    }
    private static double getDouble(Scanner scan){
        if(scan.hasNextDouble()){
            return scan.nextDouble();
        }
        scan.nextLine();
        return getInt(scan);
    }

}
