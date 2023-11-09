import java.util.Scanner;

// O programa deverá ler 10 números inteiros informados pelo usuário, ao final o programa deverá
//informar qual é o maior valor.
public class L1E14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] numeros = new int[10];
        for(int i = 0; i< 10; i++){
            numeros[i]= scan.nextInt();
        }

        int menor = numeros[0];
        for(int i:numeros){
            if(i<menor){
                menor = i;
            }
        }
        System.out.printf("Menor número %d",menor);


    }

}
