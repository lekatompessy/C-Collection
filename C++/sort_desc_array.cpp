#include <stdio.h>
#define n 8

int main() {
  int A[n];

  // Process input number to Array
  printf("Please input %i numbers: \n", n);
  for (int i = 0; i <= n-1; ++i) {
    scanf("%d", &A[i]);
  }

  // Process print number that already inputted
  printf("The number entered is: ");
  for (int i = 0; i <= n-1; ++i) {
    printf(" %3i", A[i]);
  }
  printf("\n");

  // Process of sorting Array as Descending
  // using Bubble Sort
  int S;
  for (int i = 0; i <= n-2; ++i) {
    for (int j = 0; j <= n-2 - i; ++j) {
      if (A[j] < A[j+1]) {
        S = A[j];
        A[j] = A[j+1];
        A[j+1] = S;
      }
    }
  }

  // Printing sorted numbers
  printf("Sorted numbers (D): ");
  for (int i = 0; i <= n-1; ++i) {
    printf(" %3i", A[i]);
  }
  printf("\n");

  return 0;
}
