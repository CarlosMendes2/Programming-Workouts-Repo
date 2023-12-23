import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        distancia(scan);
    }

    private static void distancia(Scanner scan) {
        int entrada = inputInt(scan);
        System.out.printf("%d minutos%n",entrada*2);
    }

    private static int inputInt(Scanner scan) {
        if(scan.hasNextInt()){
            return scan.nextInt();
        }scan.nextLine();
        return inputInt(scan);
    }
}
