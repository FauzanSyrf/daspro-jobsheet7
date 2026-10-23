import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tiket=0, hargaTiket=50000, tiketDibeli=0;
        double diskon=0, totalBeli, totalBayar, pendapatan=0;
        do {
        
            System.out.print("Tiket dibeli (ketik '0' untuk ganti hari): ");
            tiket = sc.nextInt();
            
            if (tiket == 0) {
                System.out.println("berganti hari......");
                break;
            }
            if (tiket < 0 ) {
                System.out.println("input tidak valid");
                continue;
            }
            if (tiket > 4 && tiket <= 10) {
                diskon = tiket*hargaTiket*0.1;
            }else if (tiket > 10){
                diskon = tiket*hargaTiket*0.15;
            }else {
                diskon = 0;
            }
            totalBeli = tiket*hargaTiket;
            System.out.println("Total pemebelian: Rp."+totalBeli);
            totalBayar = tiket*hargaTiket - (diskon);
            System.out.println("Total bayar: Rp."+(int)totalBayar);
            tiketDibeli += tiket;
            pendapatan += totalBayar;

        } while (true);
        System.out.println("Total pejualan tiket hari ini: "+tiketDibeli+"\nTotal pendapatan hari ini: Rp."+pendapatan);
    }
}
