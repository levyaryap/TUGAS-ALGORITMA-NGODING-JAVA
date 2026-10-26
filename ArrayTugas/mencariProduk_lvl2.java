package TugasSemester1.ArrayTugas;
import java.util.Scanner;
public class mencariProduk_lvl2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] produk = {101, 105, 110, 115, 120, 125};

        System.out.print("Masukkan kode produk: ");
        int kode = input.nextInt();

        int indeks = -1;
        int jumlahPemeriksaan = 0;

        // Pencarian kode produk
        for (int i = 0; i < produk.length; i++) {
            jumlahPemeriksaan++;

            if (produk[i] == kode) {
                indeks = i;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (indeks != -1) {
            System.out.println("Produk ditemukan.");
            System.out.println("Indeks produk: " + indeks);
        } else {
            System.out.println("Produk tidak tersedia.");
        }

        System.out.println(
            "Jumlah pemeriksaan: " + jumlahPemeriksaan
        );

        input.close();
    }
}

