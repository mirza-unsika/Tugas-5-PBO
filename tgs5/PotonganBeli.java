package tgs5;
import java.util.Scanner;

public class PotonganBeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Input total pembelian dari pengguna
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();

        // Tentukan besarnya potongan berdasarkan kriteria
        double potongan;
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }

        // Hitung jumlah yang harus dibayarkan
        double jumlahHarusDibayarkan = totalPembelian - potongan;

        // Output hasil
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahHarusDibayarkan);
	}

}
