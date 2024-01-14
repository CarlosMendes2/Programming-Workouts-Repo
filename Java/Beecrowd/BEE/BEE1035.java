import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1035 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] entrada = inputInt(scan);
        testeSelecao(entrada);
        scan.close();
    }
    private static void testeSelecao(int[] entrada) {
        if(entrada[1]>entrada[2] && entrada[3]>entrada[0] && (entrada[2]+entrada[3] > entrada[0]+entrada[1]) && entrada[2]> 0 && entrada[3]>0 && entrada[0]%2==0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }

    private static int[] inputInt(Scanner scan) {
        if(scan.hasNextLine()){
            return converteInt(scan.nextLine().split(" "));
        }scan.nextLine();
        return inputInt(scan);
    }
    private static int[] converteInt(String[] inputStr) {
        int[] numeros = new int[4];
        for (int i = 0; i< numeros.length ; i++){
            numeros[i] = Integer.parseInt(inputStr[i]);
        }
        return numeros;
    }
}
