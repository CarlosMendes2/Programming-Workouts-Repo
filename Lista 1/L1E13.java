import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//O programa deverá ler uma palavra, letra por letra, e deverá informar quantas vogais existem na palavra.
public class L1E13 {

    public static void main(String[] args) {

        List<Character> vogais = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        Scanner scan = new Scanner(System.in);
        int contadorVogais = 0;

        String palavra = scan.nextLine();
        for(int i = 0; i<palavra.length(); i++){
            char testaPalavra = Character.toLowerCase(palavra.charAt(i));
            if(vogais.contains(testaPalavra)){contadorVogais++;}
        }
        System.out.println(contadorVogais);
        scan.close();
    }

}
