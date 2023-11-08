package tgs51;

import java.util.Scanner;

public class NilaiMhs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan NPM:");
        String npm = scanner.nextLine();

        System.out.println("Masukkan Nama Mahasiswa:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan Nilai Kehadiran:");
        double nilaiKehadiran = scanner.nextDouble();

        System.out.println("Masukkan Nilai Tugas:");
        double nilaiTugas = scanner.nextDouble();

        System.out.println("Masukkan Nilai UTS:");
        double nilaiUTS = scanner.nextDouble();

        System.out.println("Masukkan Nilai UAS:");
        double nilaiUAS = scanner.nextDouble();

        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        String grade, keterangan;

        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else {
            grade = "A";
            keterangan = "ISTIMEWA";
        }

        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    } // baris 51
} // baris 52
