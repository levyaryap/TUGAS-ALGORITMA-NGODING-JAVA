package TugasSemester1.ArrayTugas;

public class totalPenjualanHarian_lvl1 {
    public static void main(String[] args) {
        //menyimpan data penjualan dalam Array
        int penjualan []=
            {100000,150000,125000,200000,175000};
        //panggil total
        int total = 0;
        //menghitung total penjualan
        for (int i=0; i<penjualan.length; i++){
        
            total = total + penjualan [i];
        }
        System.out.println("Total Penjualan Selama 5 Hari : Rp" + total);
        //menghitung jumlah elemen
        System.out.println("Jumlah Elemen Array : " + penjualan.length);
    }
}
