import java.util.Scanner;

//O programa deverá ler o nome de uma pessoa, letra por letra, e informar se o nome digitado foi
//“Jean” ou não.
public class L1E11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String nome = scan.nextLine();

        final String nameJean = "Jean";
        int contador = 0;

        for (int i = 0; i<4; i++){
            char indexIn = Character.toLowerCase(nome.charAt(i));
            char indexJean = Character.toLowerCase(nameJean.charAt(i));
            if(indexIn == indexJean){
                contador++;
            }
        }
        if(contador == 4){
            System.out.println("É O JEAN");
        }else {
            System.out.println("NÃO É O JEAN");
        }
        //charAt
    }
}
