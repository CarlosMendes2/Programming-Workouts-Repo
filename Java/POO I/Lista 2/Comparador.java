public class Comparador {

    String comparaPerimetro(Retangulo a, Triangulo b){
        if(a.calculaPerimetro() > b.calculaPerimetro()){
            return "Retangulo maior";
        }else if (a.calculaPerimetro() < b.calculaPerimetro()){
            return "Triangulo maior";
        }else{
            return "Tamanhos iguais";
        }
    }

    String comparaPerimetro(Retangulo a, Circulo b){
        if(a.calculaPerimetro() > b.calculaPerimetro()){
            return "Retangulo maior";
        }else if (a.calculaPerimetro() < b.calculaPerimetro()){
            return "Circulo maior";
        }else{
            return "Tamanhos iguais";
        }
    }

    String comparaPerimetro(Circulo a, Triangulo b){
        if(a.calculaPerimetro() > b.calculaPerimetro()){
            return "Perímetro circulo maior";
        }else if (a.calculaPerimetro() < b.calculaPerimetro()){
            return "Perímetro triangulo maior";
        }else{
            return "Perímetros iguais";
        }
    }
    String comparaArea(Circulo a,  Retangulo b){
        if(a.calculaArea() > b.calculaArea()){
            return "Area circulo maior";
        }else if (a.calculaArea() < b.calculaArea()){
            return "Area retangulo maior";
        }else{
            return "Areas iguais";
        }
    }

    String comparaArea(Triangulo a, Retangulo b){
        if(a.calculaArea() > b.calculaArea()){
            return "Area do triângulo maior";
        }else if (a.calculaArea() < b.calculaArea()){
            return "Area do retângulo maior";
        }else{
            return "Areas iguais";
        }
    }

    String comparaArea(Triangulo a, Circulo b){
        if(a.calculaArea() > b.calculaArea()){
            return "Area do triângulo maior";
        }else if (a.calculaArea() < b.calculaArea()){
            return "Area do circulo maior";
        }else{
            return "Areas iguais";
        }
    }


}
