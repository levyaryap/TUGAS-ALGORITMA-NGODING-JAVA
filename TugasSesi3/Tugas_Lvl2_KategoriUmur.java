package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl2_KategoriUmur {
    public static void main(String[] args){
        String indeksUmur;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Umur Anda : ");
        int Umur = input.nextInt();

        if (Umur >= 60){
            indeksUmur = "Lansia";
        }
        else if (Umur >=18){
            indeksUmur = "Dewasa";
        }
        else if (Umur >=13){
            indeksUmur = "Remaja";
        }
        else if (Umur >=6){
            indeksUmur = "Anak-anak";
        }
        else {
            indeksUmur = "Balita";
        }
        System.out.print("Anda adalah " + indeksUmur);
        input.close();
    }
}
