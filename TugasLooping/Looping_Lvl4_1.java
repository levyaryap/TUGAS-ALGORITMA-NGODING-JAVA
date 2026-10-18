package TugasSesi3.TugasLooping;

public class Looping_Lvl4_1 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 2; i <= n; i++){
            boolean Prima = true;

            for (int j=2;j*j<=i;j++){
                if(i%j==0){
                    Prima = false;
                    break;
                }
            }
            if (Prima){
                System.out.print(i+" ");
            }
        }
    }
}
