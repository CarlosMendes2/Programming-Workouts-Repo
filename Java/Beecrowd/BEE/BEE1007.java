import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) {
        diferenca();
    }

    private static void diferenca() {
        Scanner scan = new Scanner(System.in);
        int a = inputTeclado(scan) * inputTeclado(scan);
        int b = inputTeclado(scan) * inputTeclado(scan);
        int operacao = a-b;
        System.out.printf("DIFERENCA = %d%n",operacao);
    }

    private static int inputTeclado(Scanner scan){
        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        scan.nextLine();
        return inputTeclado(scan);
    }


}
