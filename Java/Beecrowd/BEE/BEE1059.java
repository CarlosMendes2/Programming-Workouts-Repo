public class BEE1059 {
    public static void main(String[] args) {
            imprimePares(100);
    }
    private static void imprimePares(int a){
        for (int i = 1; i<= a; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
