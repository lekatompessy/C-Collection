// Example program
#include <iostream>
#include <string>
using namespace std;

int main()
{
  int arr[] = {12, 17, 10, 5, 15, 25, 11, 7, 25, 16, 19};
  int total = 0;
  int max = arr[0];
  
  // find array length
  int size = sizeof(arr)/sizeof(arr[0]);
  
  for (int i = 0; i < size; i++) {
    if (arr[i] > max) {
        // if max not same with current array, reset to one (because there is still a max number)
        if (total > 1) {
            total = 1;
        }
        // change current max to the new max number
        max = arr[i];
    } else if (arr[i] == max) {
        // if current array and max is same just adding the total
        total++;
    }
  }
  
  cout << max << endl;
  cout << total << endl;
  return 0;
}
