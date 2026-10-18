package TugasSesi3.TugasLooping;
import java.util.Scanner;
public class Looping_Lvl2_2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukan Angka = ");
        int angka = input.nextInt();
        int factorial=1;

        for (int i=1;i<=angka;i++){
            factorial *= i;
        }
        System.out.println(angka + "! = "+factorial);
        input.close();
    }
}
