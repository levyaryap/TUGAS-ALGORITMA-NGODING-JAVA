package TugasSemester1.ArrayTugas;

public class analisisNilai_lvl2 {
    public static void main(String[] args)
 {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};

        int total = 0;
        int lulus = 0;

        // Menghitung total nilai
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / nilai.length;

        System.out.println("Rata-rata nilai: " + rataRata);

        // Menampilkan nilai di atas rata-rata
        System.out.print("Nilai di atas rata-rata: ");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > rataRata) {
                System.out.print(nilai[i] + " ");
            }
        }

        // Menghitung jumlah mahasiswa yang lulus
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 70) {
                lulus++;
            }
        }

        // Menghitung persentase kelulusan
        double persentase = (double) lulus / nilai.length * 100;

        System.out.println("\nJumlah mahasiswa lulus: " + lulus);
        System.out.println("Persentase kelulusan: " + persentase + "%");
    }
}

