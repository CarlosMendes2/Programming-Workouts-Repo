import java.util.Locale;
import java.util.Scanner;

public class BEE1021E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        notasMoedas(scan);
    }
    private static void notasMoedas(Scanner scan) {
        double valor = inputDouble(scan);
        calculaNotas(valor);
    }
    private static void calculaNotas(double valor) {
        double delta = valor;
        int nota100=0,nota50=0,nota20=0,nota10=0,nota5=0,nota2=0;
        if(delta/100 >0){
            nota100 =(int) delta / 100;
            delta = delta % 100;
        }if(delta/50 >0){
            nota50 = (int) delta / 50;
            delta = delta % 50;
        }if(delta/20>0){
            nota20 = (int)delta/20;
            delta = delta % 20;
        }if(delta/10>0){
            nota10= (int)delta/10;
            delta = delta% 10;
        }if(delta/5>0){
            nota5= (int)delta/5;
            delta = delta% 5;
        }if(delta/2>0){
            nota2= (int)delta/2;
            delta = delta% 2;
        }
        System.out.printf("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%n",nota100,nota50,nota20,nota10,nota5,nota2);
        calculaMoedas(delta);
    }
    private static void calculaMoedas(double delta) {

//        BigDecimal valorBigDecimal = BigDecimal.valueOf(delta);
//        BigDecimal valorArredondado = valorBigDecimal.setScale(2, RoundingMode.HALF_UP);
//        double deltaM = valorArredondado.doubleValue();
        float deltaM = (float)delta;
        int moeda1=0, moeda50=0,moeda25=0,moeda10=0,moeda5=0,moeda01=0;
        while(deltaM >= 1){
            moeda1++;
            deltaM--;
        }while (deltaM >= 0.5){
            moeda50++;
            deltaM-= 0.5;
        }
        while (deltaM>=0.25){
            moeda25++;
            deltaM-=0.25;
        }while (deltaM>=0.10){
            moeda10++;
            deltaM-=0.10;
        }while (deltaM>=0.05){
            moeda5++;
            deltaM-=0.05;
        }while (deltaM>=0.01){
            moeda01++;
            deltaM-=0.01;
        }
        System.out.printf("MOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n",moeda1,moeda50,moeda25,moeda10,moeda5,moeda01);
    }
    private static double inputDouble(Scanner scan) {
        if(scan.hasNextDouble()){
            return scan.nextDouble();
        }scan.nextLine();
        return inputDouble(scan);
    }
}

