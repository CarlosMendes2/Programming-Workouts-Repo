import java.util.Scanner;

//O programa deverá calcular a contribuição mensal da previdência social de um empregado
//baseado no seu salário.
public class L1E9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu salário:");
        double salario = scan.nextDouble();
        double contribuicao = salario * 0.075; // defini como 7,5%

        System.out.printf("Contribuição mensal: %.2f",contribuicao);
        scan.close();
    }
}
