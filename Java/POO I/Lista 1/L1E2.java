//O programa deverá calcular a conversão de km/h para m/s. O usuário deverá informar o valor em
//km/h e o programa deverá mostrar o valor da conversão.

import java.util.Scanner;

public class L1E2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Velocidade em km/h");
        double velocidade = entrada.nextDouble();

        double resultado = velocidade / 3.6;

        System.out.printf("%.2f m/s",resultado);

        entrada.close();
    }
}
