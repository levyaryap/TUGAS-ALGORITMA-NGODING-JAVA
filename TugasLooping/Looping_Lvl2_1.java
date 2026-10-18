package TugasSesi3.TugasLooping;
import java.util.Scanner;

public class Looping_Lvl2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka dengan sejumlah N : ");
        int N = input.nextInt();

        int count = 0;
        for (int i =0;i<=N;i++){
            if(i%2==0){
                count+=i;
            }
        }
        System.out.println("Sum of numbers even : " + count);
        input.close();
    }
}
