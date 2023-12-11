import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OrdenacaoPorSelecaoTeste {

    public static void main(String[] args) {

        Ordenacao ordenacao = new Ordenacao();
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(4,17,9,23,11,6,1,14,8,3,20,-7,13,18,5,22,16,10,25,2,19,12,24,15,21));


        int maiorNum = 0;
        int maiorIndx = 0;
        for (int a = 0; a < numeros.size(); a++){
            if(numeros.get(a) > maiorNum){
                maiorNum = numeros.get(a);
                maiorIndx = a;
                System.out.println(numeros.size()+ "  size");
                System.out.println(a);
                numeros.remove(a);
            }
        }



//        ArrayList<Integer>pMax;
//        pMax =  ordenacao.ordenarMaior(numeros);
//
//        System.out.println(pMax.size());

    }
}
