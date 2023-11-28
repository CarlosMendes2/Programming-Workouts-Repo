public class Retangulo extends Formas{
    double altura;
    double base;

    Retangulo(){
        this(1,1);
    }
    Retangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }
    double calculaPerimetro(){
        double perimetro = 2*(altura + base);
        return perimetro;
    }

    double calculaArea(){
        double area = altura * base;
        return area;
    }
    public String toString(){
        return "Retangulo → Altura: "+altura+" | "+"Base: "+base;
    }
}
