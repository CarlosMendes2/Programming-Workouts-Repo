import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        tempoDeJogo(scan);
    }

    private static void tempoDeJogo(Scanner scan) {

        String[] entrada = scan.nextLine().split(" ");

        int horaInicio = Integer.parseInt(entrada[0]);
        int minutoInicio = Integer.parseInt(entrada[1]);
        int horaFinal = Integer.parseInt(entrada[2]);
        int minutoFinal = Integer.parseInt(entrada[3]);

        calculaDuracao(horaInicio,minutoInicio,horaFinal,minutoFinal);
    }

    private static void calculaDuracao(int horaInicio, int minutoInicio, int horaFinal, int minutoFinal) { // FIXME HORAS E MINUTOS IGUALS && 24HORAS.
        int horasPassadas = 0;
        int minutosPassados = 0;

        while(horaInicio != horaFinal && minutoInicio != minutoFinal){
            if(horaInicio != 24){
                horaInicio++;
                horasPassadas++;
            }else{
                horaInicio = 0;
                horasPassadas++;
            }

            if(minutoInicio != 60){
                minutoInicio++;
                minutosPassados++;
            }else{
                horaInicio = 0;
                minutosPassados++;
            }
        }
        //O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",horasPassadas,minutosPassados);

    }
}
