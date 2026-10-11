package TugasSesi3;
import java.util.Scanner;

public class Tugas_Lvl3_CekKelulusan {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan Nilai Levy : ");
    int nilai = input.nextInt();
    System.out.println("Masukan Kehadiran : ");
    int kehadiran = input.nextInt();

    if (nilai >=60 && kehadiran >=75){
        System.out.println("Anda Lulus");
    }
    else {
        System.out.println("Tidak Lulus");
    }
    input.close();
   } 
}
