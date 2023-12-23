import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        gastoCombustivel(scan);
    }

    private static void gastoCombustivel(Scanner scan) {
        int tempoGasto = inputInt(scan);
        int velocidadeMedia = inputInt(scan);
        System.out.printf("%.3f%n",calculaGasto(tempoGasto,velocidadeMedia));
    }

    private static double calculaGasto(int tempoGasto, int velocidadeMedia) {
        final int CONSUMO = 12;
        return  (double) (tempoGasto * velocidadeMedia) /CONSUMO;
    }

    private static int inputInt(Scanner scan) {
        if(scan.hasNextInt()){
            return scan.nextInt();
        }scan.nextLine();
        return inputInt(scan);
    }
}
