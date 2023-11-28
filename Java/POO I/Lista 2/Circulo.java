public class Circulo extends Formas{
    double raio;
    static final double pi = 3.14;
    Circulo(){
        this(1);
    }
    Circulo(double raio){
        this.raio = raio;
    }

    double calculaArea(){
        double area = pi * Math.pow(raio,2);
        return area;
    }

    double calculaPerimetro(){
        double perimetro = 2 * pi * raio;
        return perimetro;
    }

    public String toString(){
        return "Círculo → Raio: "+raio;
    }
}
