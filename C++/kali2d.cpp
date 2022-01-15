#include <stdio.h>

int main()
{
  int A[2][3] = {2, 4, 3,
                 3, 2, 5};
  int B[3][5] = {3, 2, 5, 7, 4,
                 2, 4, 6, 3, 2,
                 3, 3, 2, 5, 4};
  int C[2][5];
  int I,J,K;

  int barisA = sizeof(A[0])/sizeof(int);
  int kolomB = sizeof(B) / sizeof(B[0]);

  for (I=0; I<=1; I++)
  { for (J=0; J<=4; J++)
    {
      if (barisA != kolomB) {
        printf("Baris A dan Kolom B tidak sesuai!");
        return 0;
      }
      C[I][J] = 0;
      for (K=0; K<=2; K++)
      {
        C[I][J] = C[I][J] + A[I][K] * B[K][J];
      }
    }
  }

  for (I=0; I<=1; I++)
  { for (J=0; J<=4; J++)
    {
      printf("%5i", C[I][J]);
    }
    printf("\n");
  }

  return 0;
}
