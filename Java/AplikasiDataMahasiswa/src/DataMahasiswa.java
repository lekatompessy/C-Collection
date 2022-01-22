/** Program Java untuk melakuan operasi CRUD data Mahasiswa
 * 
 * @author Samuel Lekatompessy
 * @version 1.0
 * @since 2022-01-22
 * 
 * Copyright 2022 Samuel Lekatompessy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {
  static ArrayList<Mahasiswa> dataMahasiswa;
  static Scanner scan;
  static boolean isEditing = false;
  static int maxData = 3;

  /**
   * Method ini merupakan method utama yang berfungsi untuk menjalankan seluruh program.
   * Pada method ini, daftar dataMahasiswa didefinisikan dan menampilkan menu program.
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    dataMahasiswa = new ArrayList<Mahasiswa>();
    scan = new Scanner(System.in);

    while (true) {
      showMenu();
    }
  }

  /**
   * Method ini digunakan untuk mereset ulang tampilan console/terminal.
   */
  static void clearScreen() {
    try {
      final String os = System.getProperty("os.name");
      if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls")
            .inheritIO()
            .start()
            .waitFor();
      } else {
        Runtime.getRuntime().exec("clear");
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (final Exception e) {
      System.out.println("Terdapat error: " + e.getMessage());
    }
  }

  /**
   * Method ini digunakan untuk menampilkan daftar menu program.
   * Pada menu ini, pengguna dapat memilih menu yang tersedia dalam program.
   */
  static void showMenu() {
    System.out.println("=== Aplikasi Data Mahasiswa ===");
    System.out.println("[1] Tambah Data");
    System.out.println("[2] Hapus Data");
    System.out.println("[3] Ubah Data");
    System.out.println("[4] Tampilkan Semua Data");
    System.out.println("[0] Keluar");
    System.out.println("------------------------------");
    System.out.print("Pilih menu> ");

    String selectedMenu = scan.nextLine();

    if (selectedMenu.equals("1")) {
      addDataMahasiswa();
    } else if (selectedMenu.equals("2")) {
      deleteDataMahasiswa();
    } else if (selectedMenu.equals("3")) {
      editDataMahasiswa();
    } else if (selectedMenu.equals("4")) {
      showDataMahasiswa();
    } else if (selectedMenu.equals("0")) {
      System.exit(0);
    } else {
      System.out.println("Menu yang dipilih tidak tersedia!");
      backToMenu();
    }
  }

  /**
   * Method ini digunakan untuk menghentikan aksi program dan kembali ke menu utama.
   */
  static void backToMenu() {
    System.out.println("");
    System.out.print("Tekan [Enter] untuk kembali...");
    scan.nextLine();
    clearScreen();
  }

  /**
   * Method ini digunakan untuk menambah data mahasiswa berdasarkan inputan yang diberikan
   * oleh pengguna.
   */
  static void addDataMahasiswa() {
    clearScreen();

    try {
      if (dataMahasiswa.size() >= maxData) {
        throw new ArrayIndexOutOfBoundsException("Max data sudah terpenuhi!");
      } else {
        try {
          System.out.print("Masukkan Nama: ");
          String nama = scan.nextLine();
          System.out.print("Masukkan NIM: ");
          int nim = Integer.parseInt(scan.nextLine());
          if (nim < 0) {
            throw new ArithmeticException("[NIM] Masukkan angka positif saja!");
          }

          System.out.print("Masukkan Tanggal Lahir: ");
          String tglLahir = scan.nextLine();

          Mahasiswa inputData = new Mahasiswa(nama, nim, tglLahir);
          dataMahasiswa.add(inputData);
          System.out.println("Berhasil menambahkan data!");
        } catch (NumberFormatException e) {
          System.out.println("Terjadi kesalahan: [NIM] Masukkan hanya angka saja!");
        } catch (Exception e) {
          System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    backToMenu();
  }

  /**
   * Method ini digunakan untuk menghapus data yang dipilih oleh pengguna dari daftar.
   */
  static void deleteDataMahasiswa() {
    isEditing = true;
    showDataMahasiswa();

    try {
      System.out.println("---------------");
      System.out.print("Pilih Indeks> ");
      int index = Integer.parseInt(scan.nextLine());

      if (index > dataMahasiswa.size()) {
        throw new IndexOutOfBoundsException("Data yang Anda masukkan tidak tersedia!");
      } else {
        try {
          System.out.println("Anda akan menghapus:");
          System.out.println(String.format("[%d] %s", index, dataMahasiswa.get(index)));
          System.out.println("Apa kamu yakin?");
          System.out.print("Jawab (y/t)> ");
          String jawab = scan.nextLine();

          if (jawab.equalsIgnoreCase("y")) {
            dataMahasiswa.remove(index);
            System.out.println("Data berhasil dihapus!");
          }
        } catch (Exception e) {
          System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    isEditing = false;
    backToMenu();
  }

  /**
   * Method ini digunakan untuk mengubah data yang dipilih oleh pengguna dari daftar.
   */
  static void editDataMahasiswa() {
    isEditing = true;
    showDataMahasiswa();

    try {
      System.out.println("---------------");
      System.out.print("Pilih Indeks> ");
      int index = Integer.parseInt(scan.nextLine());

      if (index > dataMahasiswa.size()) {
        throw new IndexOutOfBoundsException("Data yang Anda masukkan tidak tersedia!");
      } else {
        try {
          System.out.println("Masukkan data baru.");
          System.out.print("Masukkan Nama: ");
          String nama = scan.nextLine();
          System.out.print("Masukkan NIM: ");
          int nim = Integer.parseInt(scan.nextLine());
          if (nim < 0) {
            throw new ArithmeticException("[NIM] Masukkan angka positif saja!");
          }

          System.out.print("Masukkan Tanggal Lahir: ");
          String tglLahir = scan.nextLine();

          Mahasiswa inputData = new Mahasiswa(nama, nim, tglLahir);
          dataMahasiswa.set(index, inputData);
          System.out.println(dataMahasiswa.toString());
          System.out.println("Data berhasil diubah!");
        } catch (NumberFormatException e) {
          System.out.println("Terjadi kesalahan: [NIM] Masukkan hanya angka saja!");
        } catch (Exception e) {
          System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    isEditing = false;
    backToMenu();
  }

  /**
   * Method ini digunakan untuk menampilkan seluruh data yang telah ditambahkan oleh pengguna.
   */
  static void showDataMahasiswa() {
    clearScreen();

    if (dataMahasiswa.size() > 0) {
      System.out.println("=== Daftar Mahasiswa ===");
      int index = 0;
      for (Mahasiswa data : dataMahasiswa) {
        System.out.println(
            String.format(
                "[%d] Nama: %s\n    NIM: %d\n    Tgl Lahir: %s",
                index,
                data.getNamaMahasiswa(),
                data.getNimMahasiswa(),
                data.getTglLhrMahasiswa()));
        index++;
      }
    } else {
      System.out.println("Tidak ada data!");
    }

    if (!isEditing) {
      backToMenu();
    }
  }
}
