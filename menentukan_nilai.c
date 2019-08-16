#include <stdio.h>
#include <stdlib.h>

int main()
{
    char * nilai;
    int a, b, c;

    printf("Masukkan nilai a: ");
    scanf("%d", &a);
    printf("Masukkan nilai b: ");
    scanf("%d", &b);
    printf("Masukkan nilai c: ");
    scanf("%d", &c);

    nilai = a > b ? (a > c ? "A" : "C") : (b > c ? "B" : "C");
    
    // if (a > b)
    // {
    //     if (a > c)
    //     {
    //         hasil = "A";
    //     }
    //     else
    //     {
    //         hasil = "C";
    //     }
    // }
    // else
    // {
    //     if (b > c)
    //     {
    //         hasil = "B";
    //     }
    //     else
    //     {
    //         hasil = "C";
    //     }
        
    // }
    
    printf("%s adalah yang terbesar\n", nilai);
    return 0;
}
