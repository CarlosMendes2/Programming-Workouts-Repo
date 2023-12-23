import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        maiorDeTres(scan);
    }

    private static void maiorDeTres(Scanner scan) {
        String[] valores = scan.nextLine().split(" ");
        System.out.printf("%d eh o maior%n",verifyMaiorNumero(valores));

    }
    private static int verifyMaiorNumero(String[] arr){
        int maior = Integer.parseInt(arr[0]);
        for(String i: arr){
            if(Integer.parseInt(i)>maior){
                maior = Integer.parseInt(i);
            }
        }
        return maior;}

}
