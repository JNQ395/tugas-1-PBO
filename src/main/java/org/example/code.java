package org.example;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        // input dari user ketika program berjalan
        Scanner objInput = new Scanner(System.in);

        int opsiMenu = 0;

        // Melakukan perulangan selama opsiMenu bukan 3 (keluar)
        do {
            System.out.println("-----Sistem Perpustakaan-----");
            System.out.println();
            System.out.println("1. Masuk sebagai Mahasiswa");
            System.out.println("2. Masuk sebagai Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi Anda [1/2/3]: ");

            try {
                // Membaca input dari pengguna
                // menginputkan sebuah nilai String ke dalam variabel opsiMenu
                opsiMenu = objInput.nextInt();
            } catch (java.util.InputMismatchException e) {
                // Menangani kesalahan jika input tidak berupa angka
                System.out.println("Input tidak valid. Harap masukkan angka.");
                objInput.nextLine(); // Konsumsi input yang tidak valid
                continue;
            }

            // Memproses pilihan menu
            switch (opsiMenu) {
                case 1:
                    System.out.println("Masuk sebagai Mahasiswa");
                    System.out.print("Masukkan NIM Anda: ");
                    String nim = objInput.next();
                    if (nim.length() == 15) {
                        // Tambahkan pemeriksaan kata sandi dan logika masuk lainnya untuk mahasiswa di sini
                        System.out.println("Berhasil masuk sebagai Mahasiswa.");
                    } else {
                        System.out.println("Panjang NIM tidak valid. Harus 15 karakter.");
                    }
                    break;
                case 2:
                    System.out.println("Masuk sebagai Admin");
                    System.out.print("Masukkan nama pengguna Anda: ");
                    String namaPengguna = objInput.next();
                    System.out.print("Masukkan kata sandi Anda: ");
                    String kataSandi = objInput.next();
                    //pemeriksaan nama pengguna dan kata sandi
                    if ("admin".equals(namaPengguna) && "admin123".equals(kataSandi)) {
                        System.out.println("Berhasil masuk sebagai Admin.");
                    } else {
                        System.out.println("Nama pengguna atau kata sandi tidak valid.");
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (opsiMenu != 3);

        // Menutup scanner setelah pengguna keluar dari sistem
        objInput.close();
    }
}
