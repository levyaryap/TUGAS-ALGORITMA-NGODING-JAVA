package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl3_LampuLaluLintas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Warna Lampu : ");
        String Lampu = input.next();

        if (Lampu.equals("merah")){
            System.out.print("Berhenti");
        }
        else if (Lampu.equals("kuning")){
            System.out.print("Bersiap");
        }
        else if (Lampu.equals("hijau")){
            System.out.print("Jalan");
        }
        else {
            System.out.print("Warna Tidak Valid");
        }
input.close();
    }
    
}
