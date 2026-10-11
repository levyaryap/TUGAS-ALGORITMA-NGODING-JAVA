package TugasSesi3;
import java.util.Scanner;

public class Tugas_Lvl1_LulusAtauTidakLulus {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa Nilai Levy : ");
        int nilai = inputan.nextInt();

        if (nilai >= 60){
            System.out.print("Lulus");
        }
        else {
            System.out.print("Tidak Lulus");
        }
        inputan.close();
    }
    
}
