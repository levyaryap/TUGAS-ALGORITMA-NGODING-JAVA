package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl2_DiskonBelanja {
    public static void main(String[] args){
        Double TotalBelanja;
        String Diskon;
        Scanner input = new Scanner(System.in);
        System.out.print("Total Belanja : Rp.");
        Double Uang = input.nextDouble();

        if (Uang >=1000000){
            TotalBelanja = Uang-(Uang*0.2);
            Diskon = "20 %";
        }
        else if (Uang >=500000){
            TotalBelanja = Uang-(Uang*0.1);
            Diskon = "10 %";
        }
        else if (Uang >=250000){
            TotalBelanja = Uang-(Uang*0.05);
            Diskon = "5 %";
        }
        else {
            TotalBelanja = Uang;
            Diskon = "-TIDAK ADA DISKON-";
        }
        System.out.print("Rp." + TotalBelanja + " Diskon " + Diskon);
        input.close();
    }
}
