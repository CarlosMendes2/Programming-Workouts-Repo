import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = inputNumero(scan);
        double b = inputNumero(scan);
        double c = inputNumero(scan);
        scan.close();
        areaTriangulo(a,c);
        areaCirculo(c);
        areaTrapezio(a,b,c);
        areaQuadrado(b);
        areaRetangulo(a,b);

    }

    private static double inputNumero(Scanner scn){
        double num;
        if(scn.hasNextDouble()){
            num = scn.nextDouble();
            scn.nextLine();
            return num;
        }
        scn.nextLine();
        return inputNumero(scn);
    }
    private static void areaTriangulo(double a, double c){
        double trapezio =  ((a * c)/2);
        System.out.printf("TRIANGULO: %.3f",trapezio);
    }
    private static void areaCirculo(double c){
        double circulo =  (3.14159 * Math.pow(c,2));
        System.out.printf("CIRCULO: %.3f",circulo);

    }
    private static void areaTrapezio(double a, double b, double c){
        double trapezio = (1/2)*(a + b) * c;
        System.out.printf("TRAPEZIO: %.3f",trapezio);
    }
    private static void areaQuadrado(double b){
        double quadrado =  Math.pow(b,2);
        System.out.printf("QUADRADO: %.3f",quadrado);
    }
    private static void areaRetangulo(double a, double b){
        double retangulo = a * b;
        System.out.printf("RETANGULO: %.3f",retangulo);
    }

}
