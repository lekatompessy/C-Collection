/** Program Java untuk melakuan operasi 
 * CRUD (Create, Read, Update, dan Delete)
 * data Mahasiswa
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

public class Mahasiswa {
  private String nama;
  private int nim;
  private String tanggalLahir;

  /**
   * Method ini digunakan untuk membentuk data Mahasiswa
   * menjadi bentuk objek.
   * @param nama Ini adalah parameter pertama untuk method Mahasiswa
   * @param nim Ini adalah parameter kedua untuk method Mahasiswa
   * @param tanggalLahir Ini adalah parameter ketiga untuk method Mahasiswa
   */
  public Mahasiswa(String nama, int nim, String tanggalLahir) {
    this.nama = nama;
    this.nim = nim;
    this.tanggalLahir = tanggalLahir;
  }

  /**
   * Method ini mengembalikan data nama Mahasiswa
   * @return String Ini mengembalikan nama Mahasiswa
   */
  public String getNamaMahasiswa() {
    return this.nama;
  }

  /**
   * Method ini mengembalikan data NIM Mahasiswa
   * @return int Ini mengembalikan NIM Mahasiswa
   */
  public int getNimMahasiswa() {
    return this.nim;
  }

  /**
   * Method ini mengembalikan data Tanggal Lahir Mahasiswa
   * @return String Ini mengembalikan Tanggal Lahir Mahasiswa
   */
  public String getTglLhrMahasiswa() {
    return this.tanggalLahir;
  }
}