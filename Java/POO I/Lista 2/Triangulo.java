public class Triangulo extends Formas{

    double ladoA;
    double ladoB;
    double ladoC;

    Triangulo(){
        this(1.0,1.0,1.0);
    }
    Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    double calculaPerimetro(){
        double perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
    double calculaHerao (){
        double herao = (ladoA + ladoB + ladoC) / 2;
        return  herao;
    }

    double calculaArea(){
        double s = calculaHerao();
        double a = s * (s-ladoA) * (s-ladoB)*(s-ladoC);
        double area = Math.pow(a,0.5);
        return area;
    }

    public String toString(){
        return "Triangulo → LadoA :" +ladoA+ "| "+"LadoB :" +ladoB+ " | "+"LadoC :" +ladoC;
    }

}
