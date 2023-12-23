import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] valores = inputValor(scan);
        double a =Double.parseDouble(valores[0]);
        double b =Double.parseDouble(valores[1]);
        double c =Double.parseDouble(valores[2]);


        scan.close();
        areaTriangulo(a,c);
        areaCirculo(c);
        areaTrapezio(a,b,c);
        areaQuadrado(b);
        areaRetangulo(a,b);

    }

    private static String[] inputValor(Scanner sc){
        return sc.nextLine().split(" ");
    }

    private static void areaTriangulo(double a, double c){
        double trapezio =  ((a * c)/2);
        System.out.printf("TRIANGULO: %.3f%n",trapezio);
    }
    private static void areaCirculo(double c){
        double circulo =  (3.14159 * Math.pow(c,2));
        System.out.printf("CIRCULO: %.3f%n",circulo);

    }
    private static void areaTrapezio(double a, double b, double c){
        double trapezio = ((double) 1 /2)*(a + b) * c;
        System.out.printf("TRAPEZIO: %.3f%n",trapezio);
    }
    private static void areaQuadrado(double b){
        double quadrado =  Math.pow(b,2);
        System.out.printf("QUADRADO: %.3f%n",quadrado);
    }
    private static void areaRetangulo(double a, double b){
        double retangulo = a * b;
        System.out.printf("RETANGULO: %.3f%n",retangulo);
    }

}
