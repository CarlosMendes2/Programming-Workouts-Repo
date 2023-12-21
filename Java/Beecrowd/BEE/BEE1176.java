import java.math.BigInteger;
import java.util.Scanner;

public class BEE1176 {
    public static void main(String[] args) {

        final int VALOR_MAXIMO = 61; // [0]...[60]
        Scanner scan = new Scanner(System.in);
        int numCasosTeste = inputTeclado(scan);
        BigInteger[] sequenciaFibo = fibonacci(VALOR_MAXIMO);
        checaValor(numCasosTeste, sequenciaFibo, scan);
        scan.close();
    }
// 0 1 1 2 3
    private static void checaValor(int numCasosTeste, BigInteger[] sequenciaFibo, Scanner scan) {
        for(int i = 0; i< numCasosTeste; i++){
            int indexChecado = inputTeclado(scan);
            BigInteger checagem = sequenciaFibo[indexChecado];
            System.out.printf("Fib(%d) = %d%n",indexChecado,checagem);
        }
    }

    private static int inputTeclado(Scanner scan){

        if(scan.hasNextInt()){
            return scan.nextInt();
        }
        scan.nextLine();
        return inputTeclado(scan);
    }
    private static BigInteger[] fibonacci(int a){
        BigInteger[] sequencia = new BigInteger[a];
        sequencia[0] = BigInteger.valueOf(0);
        sequencia[1] = BigInteger.valueOf(1);
        sequencia[2] = BigInteger.valueOf(1);
        for(int i = 3; i < a;i++){
            sequencia[i] = sequencia[i - 1].add(sequencia[i - 2]);
        }
        return sequencia;
    }
}