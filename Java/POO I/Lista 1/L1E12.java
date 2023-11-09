import java.util.Scanner;

//O programa deverá simular um sistema de cofre. A senha secreta é ‘1’, ‘2’, ‘3’. O programa
//deverá informar “liberado” caso os valores forem informados exatamente nessa ordem, caso
//contrário deverá repetir mais 3 vezes. Caso o usuário não acerte até a terceira tentativa, o programa
//deverá informar que ficara bloqueado. Importante: o valor lido não deverá ser ‘123’ e sim ‘1’, ‘2’ e ‘3’.
public class L1E12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean status = false;
        final int[] senha = {1,2,3};
        int [] tentativa = new int [3];

        int tentativas = 3;

        while (status != true && tentativas != 0){
            System.out.println("Informe a senha, digito por dígito");
            int contador = 0;
            for (int i = 0; i < 3; i++){tentativa[i] = scan.nextInt();}
            for (int i = 0; i < 3; i++){if(tentativa[i] == senha[i]){contador++;}}
            if (contador == 3) {status = true;}
            if (contador != 3) {tentativas--;}
        }
        if(tentativas == 0){System.out.println("Bloqueado");}
        if(status){System.out.println("Liberado");}

        scan.close();
    }
}


