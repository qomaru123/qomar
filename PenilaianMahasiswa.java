import java.util.Scanner;

public class PenilaianMahasiswa {

    // Fungsi untuk menghitung nilai akhir berdasarkan bobot
    public static double hitungNilaiAkhir(double nilaiKeaktifan, double nilaiTugas, double nilaiProyek, double nilaiKuis, double nilaiUTS, double nilaiUAS) {
        // Menghitung nilai akhir dengan bobot yang ditentukan
        return (nilaiKeaktifan * 0.1) + (nilaiTugas * 0.2) + (nilaiProyek * 0.15) + (nilaiKuis * 0.1) + (nilaiUTS * 0.25) + (nilaiUAS * 0.3);
    }

    // Fungsi untuk evaluasi status kelulusan dan peringkat
    public static void evaluasiStatus(double nilaiAkhir) {
        // Menentukan status kelulusan
        if (nilaiAkhir >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }

        // Menentukan peringkat berdasarkan nilai akhir
        if (nilaiAkhir >= 85) {
            System.out.println("Peringkat: A");
        } else if (nilaiAkhir >= 70) {
            System.out.println("Peringkat: B");
        } else if (nilaiAkhir >= 50) {
            System.out.println("Peringkat: C");
        } else {
            System.out.println("Peringkat: D");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("==== Program Penilaian Mahasiswa ====");
            
            // Input data mahasiswa
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan Nilai Keaktifan (0-100): ");
            double nilaiKeaktifan = scanner.nextDouble();
            
            System.out.print("Masukkan Nilai Tugas (0-100): ");
            double nilaiTugas = scanner.nextDouble();
            
            System.out.print("Masukkan Nilai Proyek (0-100): ");
            double nilaiProyek = scanner.nextDouble();
            
            System.out.print("Masukkan Nilai Kuis (0-100): ");
            double nilaiKuis = scanner.nextDouble();
            
            System.out.print("Masukkan Nilai UTS (0-100): ");
            double nilaiUTS = scanner.nextDouble();
            
            System.out.print("Masukkan Nilai UAS (0-100): ");
            double nilaiUAS = scanner.nextDouble();
            
            // Menghitung nilai akhir mahasiswa
            double nilaiAkhir = hitungNilaiAkhir(nilaiKeaktifan, nilaiTugas, nilaiProyek, nilaiKuis, nilaiUTS, nilaiUAS);
            System.out.println("\nRincian Penilaian:");
            System.out.println("Nama Mahasiswa: " + nama);
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            
            // Evaluasi kelulusan dan peringkat berdasarkan nilai akhir
            evaluasiStatus(nilaiAkhir);
            
            // Menanyakan apakah ingin mengulang
            System.out.print("\nApakah Anda ingin memasukkan data mahasiswa lain? (ya/tidak): ");
            scanner.nextLine(); // Mengonsumsi newline yang tersisa
            String jawab = scanner.nextLine();
            
            if (!jawab.equalsIgnoreCase("ya")) {
                ulangi = false; // Keluar dari perulangan
            }
        }

        scanner.close();
        System.out.println("\nProgram selesai. Terima kasih!");
    }
}

