import java.util.Locale;
import java.util.Scanner;

public class BEE1037 {
    public static void main(String[] args) {
        //[0,25], (25,50], (50,75], (75,100]
        //Intervalo (25,50]
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        intervalo(scan);
    }

    private static void intervalo(Scanner scan) {
        verificaIntervalo(inputFloat(scan));
    }

    private static void verificaIntervalo(double entrada) {
        if(entrada >= 0 && entrada <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(entrada > 25 && entrada <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(entrada > 50 && entrada <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(entrada > 75 && entrada <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }

    private static double inputFloat(Scanner scan) {
        if(scan.hasNextDouble()){
            return scan.nextDouble();
        }scan.nextLine();
        return inputFloat(scan);
    }
}
