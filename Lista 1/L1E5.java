//O programa deverá imprimir todos números pares de 500 à 1000.
public class L1E5 {
    public static void main(String[] args) {

        int contador = 0;
        for (int i = 500; i<=1000; i++){
            if(i%2 == 0){
                System.out.println(i);
                contador+=1;
            }
        }
        System.out.println(contador);

    }
}
