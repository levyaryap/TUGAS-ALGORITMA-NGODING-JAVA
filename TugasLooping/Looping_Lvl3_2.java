package TugasSesi3.TugasLooping;
import java.util.Scanner;
public class Looping_Lvl3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Angka : ");
        int angka = input.nextInt();

        for (int i=1;i<=angka; i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            input.close();
        }
    }
}
