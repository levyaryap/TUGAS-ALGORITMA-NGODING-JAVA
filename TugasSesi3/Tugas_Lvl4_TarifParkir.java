package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl4_TarifParkir {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Durasi Parkir : ");
        int jam = input.nextInt();
        int Biaya;

        if (jam ==1){
            Biaya = 5000;
        }
        else if (jam <=6){
            Biaya = 5000 + (jam -1) * 3000;
        }
        else {
            Biaya = 20000;
        }
        System.out.print("Total Biaya Parkir : Rp." + Biaya);
        input.close();
      }
 }

