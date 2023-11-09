import java.util.Scanner;

public class L1E7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura:");
        double temperatura = scan.nextDouble();
        String status;
        if(temperatura < 20){
            status = "Hipotermia";
        } else if (temperatura>20 && temperatura < 37.5) {
            status = "Temperatura Normal";
        }else if (temperatura > 37.5 && temperatura < 42){
            status = "Febre";
        }else
            status = "Perigo";
        System.out.println(status);
        scan.close();
    }
}
