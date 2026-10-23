import java.util.Scanner;

public class HitungParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kendaraan, durasi, totalParkir=0, pendapatan=0;
        int biayaMotor=2000, biayaMobil=3000;
        do {
            System.out.print("Input kode kendaraan (1:motor ; 2:mobil ; 0:selesai): ");
            kendaraan = sc.nextInt();
            if (kendaraan == 0) {
                System.out.println("Parkiran Tutup");
                break;
            }
            if (kendaraan != 1  && kendaraan != 2) {
                System.out.println("Kode kendaraan salah, masukkan ulang");
                continue;
            }
          
            System.out.print("Durasi Parkir: ");
            durasi = sc.nextInt();
            
            if (kendaraan == 1) {
                totalParkir += durasi*2000;
            }else if (kendaraan == 2){
                totalParkir += durasi*3000;
            }
            
        } while (true);
        System.out.println("Total pendapatan: Rp."+totalParkir);
}
}
