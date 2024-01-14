import java.util.Locale;
import java.util.Scanner;

public class BEE1040E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        media3(scan);
    }

    private static void media3(Scanner scan) {
        Double[] quatroNotas = inputNotas(scan);
        double mediaNotas = calculaMedia(quatroNotas);
        if("aprovado".equals(verificaAprovado(mediaNotas))){
            System.out.printf("Media: %.1f%n",mediaNotas);
            System.out.println("Aluno aprovado.");
        }else if("exame".equals(verificaAprovado(mediaNotas))){
            System.out.printf("Media: %.1f%n",mediaNotas);
            System.out.println("Aluno em exame.");
            exame(scan,mediaNotas);
        }else{
            System.out.printf("Media: %.1f%n",Math.floor(mediaNotas));
            System.out.println("Aluno reprovado.");
        }
    }

    private static void exame(Scanner scan, double mediaNotas) {
        double notaExame = inputDouble(scan);
        double mediaFinal = ((notaExame + mediaNotas)/2);
        System.out.printf("Nota do exame: %.1f%n",notaExame);
        if(mediaFinal >= 5){
            System.out.println("Aluno aprovado.");
        }else{
            System.out.println("Aluno reprovado.");
        }
        System.out.printf("Media final: %.1f%n",mediaFinal);
    }

    private static double inputDouble(Scanner scan) {
        if(scan.hasNextDouble()){
            return scan.nextDouble();
        }scan.nextLine();
        return inputDouble(scan);
    }

    private static String verificaAprovado(double mediaNotas) {
        if (mediaNotas>=7){
            return "aprovado";
        }else if(mediaNotas < 7 && mediaNotas >=5){
            return "exame";
        }else{
            return "reprovado";
        }
    }

    // 2, 3, 4 e 1
    private static Double calculaMedia(Double[] quatroNotas) {
        double notaA = quatroNotas[0];
        double notaB = quatroNotas[1];
        double notaC = quatroNotas[2];
        double notaD = quatroNotas[3];
        return (notaA*2+notaB*3+notaC*4+notaD)/10;
    }

    private static Double[] inputNotas(Scanner scan) {
        if(scan.hasNextLine()){
            return converteNotas(scan.nextLine().split(" "));
        }scan.nextLine();
        return inputNotas(scan);
    }

    private static Double[] converteNotas(String[] s) {
        Double[] a =new Double[4];
        for (int i = 0; i<a.length;i++){
            a[i] = Double.parseDouble(s[i]);
        }
        return a;
    }
}