public class Main2 {
    public static void main(String[] args) {
        int numbers = 100;
        int N = 2;
        while (N<numbers){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N) ; i++) {
                if(N%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(N);
            }
            N++;
        }
    }
}
