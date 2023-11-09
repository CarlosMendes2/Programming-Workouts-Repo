//O programa deverá informar inicialmente: “Para sair, digite ‘x’”. Após, deverá esperar que o
//usuário digite uma letra. Para qualquer letra diferente de ‘x’ o programa deverá repetir a pergunta.
//Caso ‘x’ seja digitado, o programa finaliza.

import java.util.Scanner;

public class L1E4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Boolean status = false;
        while (!status){
            System.out.println("Para sair, digite 'x'");
            String entr = entrada.next();
            if(entr.equalsIgnoreCase("x")){status = true;}
        }
        entrada.close();
    }
}
