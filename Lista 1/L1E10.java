//O programa deverá ler uma letra e um número N. O programa deverá informar se a letra é uma
//vogal ou não, e caso for uma vogal, deverá mostrar na tela a vogal impressa N vezes.

import java.util.ArrayList;
import java.util.Scanner;


public class L1E10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> vogais = new ArrayList<>();
        vogais.add("a");
        vogais.add("e");
        vogais.add("i");
        vogais.add("o");
        vogais.add("u");


        System.out.println("Digite uma letra");
        String letraIn = scan.nextLine();

        System.out.println("Digite um número");
        int num = scan.nextInt();

        boolean status = false;

        for (String letra:vogais){
            if(letraIn.contains(letra)){
                status = true;
            }
        }

        if(status){
            System.out.printf("%s é vogal\n",letraIn);
            for(int i = 0; i<num; i++){
                System.out.println(letraIn);
            }
        }else{
            System.out.printf("%s não é vogal", letraIn);
        }

        scan.close();

    }
}
