package TugasSesi3;
import java.util.Scanner;


public class Tugas_Lvl1_GanjilAtauGenap {
    public static void main(String[] args) throws Exception {
        Scanner Inputan = new Scanner(System.in);
        System.out.print("Input angka : ");
        int angka = Inputan.nextInt();

        if (angka % 2==0){
            System.out.print("Genap");
        }
        else {
            System.out.print("Ganjil");
        }
        Inputan.close();
    }
}
