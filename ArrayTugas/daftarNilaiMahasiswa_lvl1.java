package TugasSemester1.ArrayTugas;

public class daftarNilaiMahasiswa_lvl1 {
    public static void main(String[] args) {
        //membuat tempat penyimpanan (array) untuk 5 nilai
        int nilai[][]={
            {80, 75, 90, 65, 85}
        };
        /*menampilkan semua nilai memakai perulangan (looping)
        komputer akan mengulang dari indeks 0 sampai indeks 4*/
        for (int i=0; i < nilai.length; i++){
        //mengambil dan menampilkan nilai pada indeks ke-2 saja
            System.out.println(nilai [i][2]+" ");
        }
    }
}
