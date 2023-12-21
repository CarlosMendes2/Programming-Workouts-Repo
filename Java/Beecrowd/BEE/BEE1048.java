import java.util.Locale;
import java.util.Scanner;

public class BEE1048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        novoSalario(inputSalario(scan));

    }
    private static double inputSalario(Scanner scn){
        if(scn.hasNextDouble()){
            return scn.nextDouble();
        }
        scn.nextLine();
        return inputSalario(scn);
    }
    private static void novoSalario(double s){

        double reajuste = reajuste(s);
        double novoSalario = s + (s* reajuste);
        double valorAumento = novoSalario - s;

        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", valorAumento);
        System.out.printf("Em percentual: %.0f %%%n",(reajuste*100));

    }
    private static double reajuste( double a){
        if(a <= 400){
            return 0.15;
        } else if (a<=800) {
            return 0.12;
        } else if (a <= 1200) {
            return 0.10;
        } else if (a <= 2000) {
            return 0.07;
        }else {
            return 0.04;
        }
    }
}
