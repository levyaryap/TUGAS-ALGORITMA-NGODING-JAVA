package TugasSesi3;
import java.util.Scanner;

public class Tugas_Lvl1_CekUmur {
    public static void main(String[] args){
        Scanner isina = new Scanner(System.in);
        System.out.print("Isi Umur Anjeun : ");
        int Umur = isina.nextInt();

        if (Umur >= 17){
            System.out.print("Geus meunang Boga KTP");
        }
        else {
            System.out.print("Can Meunang Boga KTP");

        }
        isina.close();
    }
    
}
