import java.util.Scanner;

public class BEE1151 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        fibonacci(inputTeclado(scan));

    }

    private static int inputTeclado(Scanner scan){
        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        scan.nextLine();
        return inputTeclado(scan);
    }
    private static void fibonacci(int a){
        int [] sequencia = new int[a];
        sequencia[0] = 0;
        sequencia[1] = 1;
        sequencia[2] = 1;
        for(int i = 3; i < a;i++){
            sequencia[i] = sequencia[i-1]+sequencia[i-2];
        }
        formataResultado(sequencia);
    }
    private static void formataResultado(int[] arr){
        StringBuilder resultado = new StringBuilder();
        for (int i = 0 ; i< arr.length; i++){
            if(i!= (arr.length-1)){
                resultado.append(arr[i]).append(" ");}
            else {
                resultado.append(arr[i]);}
        }
        System.out.println(resultado);
    }
}
