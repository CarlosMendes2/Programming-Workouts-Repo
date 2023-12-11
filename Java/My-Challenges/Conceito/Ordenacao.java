import java.util.ArrayList;

public class Ordenacao {

    public ArrayList<Integer> ordenarMaior(ArrayList<Integer> listA){

        int maiorNum = listA.get(0);
        int maiorIndx = 0;

        ArrayList<Integer> ordenadoParaMaior = new ArrayList<>();
        while (!listA.isEmpty()){
            for (int a = 0; a < listA.size(); a++){
                if(listA.get(a) > maiorNum){
                    maiorNum = listA.get(a);
                    maiorIndx = a;
                    System.out.println(ordenadoParaMaior.size());
                    System.out.println(a);
                }
            }
            System.out.println("chegou aqui");
            ordenadoParaMaior.add(listA.get(maiorIndx));
            listA.remove(maiorIndx);
        }
        for ( Integer a : ordenadoParaMaior){
            System.out.println(a);
        }
        return ordenadoParaMaior;
    }



}
