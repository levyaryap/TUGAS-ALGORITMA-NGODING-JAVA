package TugasSesi3;
import java.util.Scanner;
public class Tugas_Lvl2_KategoriNilai {
    public static void main(String[] args){

        Character indeksnilai;
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa Nilai UTS Levy ? : ");
        int nilai = input.nextInt();

        if (nilai >=80){
            indeksnilai = 'A';
        }
        else if (nilai >=70){
            indeksnilai = 'B';
        }
        else if (nilai >=60){
            indeksnilai = 'C';
        }
        else if (nilai >=50){
            indeksnilai = 'D';
        }
        else {
            indeksnilai = 'E';
        }
        System.out.print("Nilai Levy adalah : " + indeksnilai);
          input.close();
    } 
}
