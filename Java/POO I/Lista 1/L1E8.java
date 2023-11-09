import java.util.Scanner;

public class L1E8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int resultado = (int)Math.pow(a,b);

        System.out.println(resultado);
        scan.close();
    }
}
