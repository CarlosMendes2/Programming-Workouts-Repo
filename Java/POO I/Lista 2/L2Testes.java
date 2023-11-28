import java.sql.SQLOutput;

public class L2Testes {
    public static void main(String[] args) {

        Somador somador = new Somador();
        Comparador comparador = new Comparador();
        Retangulo retangulo01 = new Retangulo(5,8);
        Triangulo triangulo01 = new Triangulo(4,5,6);
        Circulo circulo01 = new Circulo(7);

        System.out.println(retangulo01.calculaPerimetro());
        System.out.println(circulo01.calculaArea());
        System.out.println(circulo01.calculaPerimetro());
        System.out.println(triangulo01.calculaArea());

        System.out.println(comparador.comparaArea(circulo01,retangulo01));

        somador.adicionarRetangulo(retangulo01);
        somador.adicionarTriangulo(triangulo01);
        somador.adicionarCirculo(circulo01);
        System.out.println(somador);

    }
}
