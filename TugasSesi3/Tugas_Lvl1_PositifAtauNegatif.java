package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl1_PositifAtauNegatif {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input Angka : ");
        double angka = inputan.nextDouble();

        if (angka >0)
           System.out.print("Positif");
        else if (angka <0)
        System.out.print("Negatif");
        else {
            System.out.println("Netral");
        }

inputan.close();
    }    
}
