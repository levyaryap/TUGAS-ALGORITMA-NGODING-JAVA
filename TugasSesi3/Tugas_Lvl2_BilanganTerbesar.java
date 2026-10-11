package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl2_BilanganTerbesar {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Input angka Pertama : ");
    int angka1 = input.nextInt();

    System.out.print("Input angka Kedua : ");
    int angka2 = input.nextInt();

    if (angka1 > angka2){
        System.out.print("Lebih Besar : " + angka1);
    } 
    else if (angka2 > angka1){
        System.out.print("Lebih besar : " + angka2);
    } 
    else {
        System.out.print("Nilai sama");
    }
    input.close();
    }
}
