//O programa deverá ler um valor de temperatura e informar se aquele valor é positivo ou
//negativo.

import java.util.Scanner;

public class L1E3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura");
        double temperatura = entrada.nextDouble();

        if(temperatura > 0) {
            System.out.println("Valor positivo");
        } else if (temperatura <0) {
            System.out.println("Valor Negativo");
        }else
            System.out.println("0º ");

        entrada.close();
    }
}
