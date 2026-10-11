package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl2_HariBerdasarkanAngka {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka (1-7) : ");
        int hari = input.nextInt();
        String Hari;

        if (hari == 1){
            Hari = "Senin";
        }
        else if (hari == 2){
            Hari = "Selasa";
        }
        else if (hari == 3){
            Hari = "Rabu";
        }
        else if (hari == 4){
            Hari = "Kamis";
        }
        else if (hari == 5){
            Hari = "Jum'at";
        }
        else if (hari == 6){
            Hari = "Sabtu";
        }
        else if (hari == 7){
            Hari = "Minggu";
        }
        else{
            Hari = "Hari Tidak Valid";
        }
        System.out.print(Hari);
        input.close();
    }
}
