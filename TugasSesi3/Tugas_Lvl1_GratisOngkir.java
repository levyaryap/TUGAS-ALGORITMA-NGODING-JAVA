package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl1_GratisOngkir {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Total Belanja :Rp.");
        int Uang = input.nextInt();

        if (Uang >=100000){
            System.out.print("Gratis Ongkir");
        }
        else {
            System.out.print("Bayar Ongkir");
        }
input.close();
    }
    
}
