package tgs52;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan berat badan Anda (kg):");
        float beratBadan = scanner.nextFloat();

        System.out.println("Masukkan tinggi badan Anda (m):");
        float tinggiBadan = scanner.nextFloat();

        double imt = beratBadan / Math.pow(tinggiBadan, 2);
        String kriteria;

        if (imt <= 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt <= 25) {
            kriteria = "Berat Badan Ideal";
        } else if (imt <= 30) {
            kriteria = "Berat Badan Lebih";
        } else if (imt <= 40) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
}
