import java.io.IOException;
import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int entradaA = scn.nextInt();
        int entradaB = scn.nextInt();
        System.out.println(soma(entradaA,entradaB));
    }

    private static String soma(int a, int b){
        int soma = a+b;
        return "X = "+soma;
    }
}
