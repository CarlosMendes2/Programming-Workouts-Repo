import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {

        final double PI = 3.14159;
        Scanner scn = new Scanner(System.in);
        int entrada = pegaInteiro(scn);
        double calculo = ((4/3.0) * PI * Math.pow(entrada,3));
        System.out.printf("VOLUME = %.3f",calculo);


    }

    private static int pegaInteiro(Scanner scan){
        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        scan.nextLine();
        return pegaInteiro(scan);
    }
}
