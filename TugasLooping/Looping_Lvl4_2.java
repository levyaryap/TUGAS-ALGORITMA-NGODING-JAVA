package TugasSesi3.TugasLooping;

public class Looping_Lvl4_2 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0;i<n;i++){
            int nilai =1;

            for(int j=0;j<=i;j++){
                System.out.print(nilai+" ");
                nilai = nilai * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
