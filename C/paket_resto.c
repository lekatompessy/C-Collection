#include <stdlib.h>
#include <stdio.h>

int main()
{
    char * paket;
    int menu, nasi = 3000, ayam_bakar = 7000, tahu = 1000, tempe = 1000, lalap = 2000,
    air_mineral = 3000, sayur_asem = 2000, gepuk = 5000, air_hangat = 1000, jumlah_pesanan, total, pajak, total_akhir;

    printf("========Selamat Datang di Masami's Resto=======\n\n");
    printf("PAKET MAKANAN\n");
    printf("=============\n");
    printf("Paket 1 \n");
    printf("Paket 2 \n");
    printf("Paket 3 \n");
    printf("Silahkan pilih paket menu yang ada: ");
    scanf("%d", &menu);
    printf("Banyaknya pesanan: ");
    scanf("%d", &jumlah_pesanan);
    printf("----------------------------\n");

    if (menu == 1)
    {
        printf("Paket 1 \n");
        printf("Nasi: %d\n", nasi);
        printf("Ayam Bakar: %d\n", ayam_bakar);
        printf("Tahu: %d\n", tahu);
        printf("Tempe: %d\n", tempe);
        printf("Lalapan: %d\n", lalap);
        printf("Air Mineral: %d\n", air_mineral);
        printf("Jumlah pesanan: %d paket\n", jumlah_pesanan);
        total = (nasi + ayam_bakar + tahu + tempe + lalap + air_mineral) * jumlah_pesanan;
    } 
    else if (menu == 2)
    {
        printf("Paket 2 \n");
        printf("Nasi: %d\n", nasi);
        printf("Ayam Bakar: %d\n", ayam_bakar);
        printf("Sayur Asem: %d\n", sayur_asem);
        printf("Tahu: %d\n", tahu);
        printf("Tempe: %d\n", tempe);
        printf("Lalap: %d\n", lalap);
        printf("Air Mineral: %d\n", air_mineral);
        printf("Jumlah pesanana %d paket\n", jumlah_pesanan);
        total = (nasi + ayam_bakar + sayur_asem + tahu + tempe + lalap + air_mineral) * jumlah_pesanan;
    }
    else if (menu == 3)
    {
        printf("Paket 3 \n");
        printf("Nasi: %d\n", nasi);
        printf("Gepuk: %d\n", gepuk);
        printf("Tahu: %d\n", tahu);
        printf("Tempe: %d\n", tempe);
        printf("Lalap: %d\n", lalap);
        printf("Air Hangat: %d\n", air_hangat);
        printf("Jumlah pesanan: %d paket\n", jumlah_pesanan);
        total = (nasi + gepuk + tahu + tempe + lalap + air_hangat) * jumlah_pesanan;
    }
    else {
        printf("Maaf, paket yang anda pilih tidak ada dalam menu! Silahkan coba lagi!\n");
        return 0;
    }

    pajak = (total) * 10 / 100;
    total_akhir = total + pajak;
    paket = (menu == 1) ? "paket 1" : "paket 2";
    paket = (menu == 3) ? "paket 3" : paket;
    printf("Total, %s * %d: %d\n", paket, jumlah_pesanan, total);
    printf("Pajak 10 persen: %d\n", pajak);
    printf("Total bayar: %d\n", total_akhir);
    return 0;
}
