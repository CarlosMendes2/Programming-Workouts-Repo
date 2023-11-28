public class Somador {

    double area;

    void adicionarTriangulo(Triangulo tri){
        this.area += tri.calculaArea();
    }
    void adicionarRetangulo(Retangulo ret){
        this.area += ret.calculaArea();
    }
    void adicionarCirculo(Circulo circ){
        this.area += circ.calculaArea();
    }

    public String toString(){
        return "Area: "+area;
    }

}
