import java.util.Scanner;

public class BEE1044 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] entrada = inputValores(scan).split(" ");
        int valorA = Integer.parseInt(entrada[0]);
        int valorB = Integer.parseInt(entrada[1]);
        verificaMultiplos(valorA,valorB);
        scan.close();
    }

    private static void verificaMultiplos(int valorA, int valorB) {
        double operacao;
        if(valorA>valorB){
            operacao = (double) valorA / valorB;
        }else{
            operacao = (double) valorB / valorA;
        }
        if (operacao % 2 == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }

    private static String inputValores(Scanner scn){
        return scn.nextLine();
    }
}
