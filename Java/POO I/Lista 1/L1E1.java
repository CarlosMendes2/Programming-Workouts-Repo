// ) O programa deverá calcular o volume de um paralelepípedo (mostrar para o usuário), sendo que
//o usuário deverá informar a altura, largura e profundidade do objeto: v = a * l * p


import java.util.Scanner;

public class L1E1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Altura:");
        double height = in.nextDouble();
        System.out.println("Largura:");
        double width = in.nextDouble();
        System.out.println("Profundidade:");
        double depth = in.nextDouble();

        double vol = height * width * depth;

        System.out.printf("Volume do paralelepípedo é %f",vol);

        in.close();
    }
}
