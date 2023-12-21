import java.util.Scanner;

public class BEE1173 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        geraArray(inputTeclado(scan));
    }

    private static void geraArray(int i) {
        int[] arr = new int[10];
        arr[0] = i;
        for(int j = 1; j<arr.length; j++){
            arr[j] = arr[j-1] *2;
        }
        for(int k = 0; k<arr.length;k++){
            System.out.println("N["+k+"] = "+arr[k]);
        }
    }

    private static int inputTeclado(Scanner scan){
        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        scan.nextLine();
        return inputTeclado(scan);
    }
}
