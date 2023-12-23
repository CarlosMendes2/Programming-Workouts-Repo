import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        cedulas(scan);
    }

    private static void cedulas(Scanner scan) {
        int valor = inputInt(scan);
        calculaCedulas(valor);
    }

    private static void calculaCedulas(int valor) {
        int delta = valor;
        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;
        while((delta - 100) >=0){
            notas100+= 1;
            delta -= 100;
        }
        while((delta - 50) >= 0){
            notas50+= 1;
            delta -= 50;
        }
        while((delta - 20) >= 0){
            notas20+= 1;
            delta -= 20;
        }
        while((delta - 10) >= 0){
            notas10+= 1;
            delta -= 10;
        }
        while((delta - 5) >= 0){
            notas5+= 1;
            delta -= 5;
        }
        while((delta - 2) >= 0){
            notas2+= 1;
            delta -= 2;
        }
        while((delta - 1) >= 0){
            notas1+= 1;
            delta -= 1;
        }

        imprimeCedulas(valor,notas100,notas50,notas20,notas10,notas5,notas2,notas1);
    }

    private static void imprimeCedulas(int valor,int notas100, int notas50, int notas20, int notas10, int notas5, int notas2, int notas1) {
        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00%n",notas100);
        System.out.printf("%d nota(s) de R$ 50,00%n",notas50);
        System.out.printf("%d nota(s) de R$ 20,00%n",notas20);
        System.out.printf("%d nota(s) de R$ 10,00%n",notas10);
        System.out.printf("%d nota(s) de R$ 5,00%n",notas5);
        System.out.printf("%d nota(s) de R$ 2,00%n",notas2);
        System.out.printf("%d nota(s) de R$ 1,00%n",notas1);
    }

    private static int inputInt(Scanner scan) {
        if(scan.hasNextInt()){
            return scan.nextInt();
        }scan.nextLine();
        return inputInt(scan);
    }
}
