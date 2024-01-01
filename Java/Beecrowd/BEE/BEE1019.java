import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        conversaoDeTempo(scan);
    }
    private static void conversaoDeTempo(Scanner scan) {
        int entradaSegundos = inputInt(scan);
        calculaTempo(entradaSegundos);
    }
    private static void calculaTempo(int entradaSegundos) {
        int delta = entradaSegundos;
        int hora = 0,minuto = 0,segundos= 0;
        if(delta > 3600){
            hora = delta / 3600;
            delta = delta % 3600;
        }
        if (delta > 60 ){
            minuto = delta / 60;
            delta = delta %60;
        }
        if(delta >0){
            segundos = delta;
        }
        System.out.printf("%d:%d:%d%n",hora,minuto,segundos);
    }

    private static int inputInt(Scanner scn){
        if(scn.hasNextInt()){
            return scn.nextInt();
        }scn.nextLine();
        return inputInt(scn);
    }
}
