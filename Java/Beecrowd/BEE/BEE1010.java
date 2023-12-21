import java.util.Locale;
import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        final int QUANTIDADE_ENTRADAS = 2;
        int numeroPeca = 0;
        double valorPeca = 0;
        double resultado = 0;
        for(int i = 0; i< QUANTIDADE_ENTRADAS; i++){
            String[] valor = pegaEntrada(entrada).split(" ");
            numeroPeca = Integer.parseInt(valor[1]);
            valorPeca = Double.parseDouble(valor[2]);
            resultado+= numeroPeca * valorPeca;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",resultado);

    }

    private static String pegaEntrada(Scanner scn){
        String in;
        if(scn.hasNext()){
            in = scn.nextLine();
            return in;
        }
        scn.nextLine();
        return pegaEntrada(scn);
    }

}

