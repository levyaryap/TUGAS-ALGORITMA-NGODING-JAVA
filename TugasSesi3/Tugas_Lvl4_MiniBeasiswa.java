package TugasSesi3;

import java.util.Scanner;

public class Tugas_Lvl4_MiniBeasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai : ");
        int nilai = input.nextInt();
        System.out.println("Masukan Kehadiran : ");
        int kehadiran = input.nextInt();
        System.out.println("Penghasilan Orang Tua : Rp.");
        int penghasilan = input.nextInt();
        System.out.println("Mahasisa (aktif/tidak) : ");
        String Keaktifan = input.next();
        String Beasiswa;

        if (nilai >=85 && kehadiran >=90 && penghasilan <=5000000 && Keaktifan.equals("aktif")){
            Beasiswa = "Mendapat Beasiswa Penuh";
        }
        else if (nilai >=75 && kehadiran >=80 && penghasilan <=8000000){
            Beasiswa = "Mendapat Beasiswa Sebagian";
        }
        else {
            Beasiswa = "Tidak Mendapat Beasiswa";
        }
        System.out.println("Anda " + Beasiswa);
        input.close();
    }
}
