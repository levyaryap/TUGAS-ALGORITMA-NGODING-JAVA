package TugasSemester1.ArrayTugas;

public class sistemRankingSiswa_lvl3 {
    public static void main(String[] args) {
        int[] nilai = {78,90,65,90,85,72,95,85};

        for (int i = 0; i<nilai.length -1;i++){
            for (int j = 0; j< nilai.length -1 -i; j++){
                if (nilai[j]<nilai[j+1]){
                    int temp = nilai[j];
                    nilai[j]=nilai[j+1];
                    nilai[j+1]=temp;
                }
            }
        }

        System.out.println("urutan nilai");
        for (int i = 0; i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }

        System.out.println("\n\nTiga nilai tertinggi yang berbeda:");

        int jumlah = 0;
        int sebelumnya= -1;

        for (int i=0;i<nilai.length;i++){
            if (nilai[i] != sebelumnya) {
                System.out.print(nilai[i]+" ");
                sebelumnya = nilai[i];
                jumlah++;
            }

            if (jumlah==3){
                break;
            }
        }

        System.out.println("\n\nPeringkat setiap mahasiswa:");

        for(int i=0;i<nilai.length;i++){
            int peringkat=1;

            for (int j=0;j<nilai.length;j++){
                if(nilai[j]>nilai[i]){
                    peringkat++;
                }
            }

            System.out.println("nilai" + nilai[i] +
            " = Peringkat " + peringkat);
        }
    }
}
