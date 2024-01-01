import java.util.Scanner;
public class BEE1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        idadeEmDias(scan);

    }
    private static void idadeEmDias(Scanner scan) {
        int dias = inputInt(scan);
        calculaDias(dias);
    }
    private static void calculaDias(int dias) {
        int delta = dias;
        int dia=0,mes=0,ano=0;
        if(dias / 365 >= 1){
            ano = dias/ 365;
            delta =  delta % 365;
        }
        if(delta / 30 >= 1){
            mes = delta / 30;
            delta = delta % 30;
        }dia = delta;
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",ano,mes,dia);
    }
    private static int inputInt(Scanner scn){
        if(scn.hasNextInt()){
            return scn.nextInt();
        }scn.nextLine();
        return inputInt(scn);
    }
}