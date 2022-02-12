#include <stdio.h>
#define n1 3
#define n2 5

int main() {
  char A[n1][n2] = {'A', 'B', 'C', 'D', 'E',
                  'F', 'G', 'H', 'I', 'J',
                  'K', 'L', 'M', 'N', 'O'};

  printf("Array before sorted: \n");
  for (int i = 0; i <= n1-1; ++i) {
    for (int j = 0; j <= n2-1; ++j) {
      printf("%3c", A[i][j]);
    }
    printf("\n");
  }
  printf("\n");

  // Process of sorted Array
  printf("Array after sorted: \n");
  for (int i = 0; i <= n2-1; ++i) {
    for (int j = 0; j <= n1-1; ++j) {
      printf("%3c", A[j][i]);
    }
    printf("\n");
  }

  return 0;
}
