// Example program
#include <iostream>
using namespace std;

int main()
{
  int arr[] = {12, 17, 10, 5, 15, 25, 11, 7, 25, 16, 19};
  int max = arr[0];
  int total = 0;
  int sum = 0;
  
  // find array length
  int size = sizeof(arr)/sizeof(*arr);
  
  for (int i = 0; i < size; i++) {
    // count average
    sum += arr[i];
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
  
  // get average number
  float average = (float)sum/(float)size;
  
  cout << "Max number = " << max << endl;
  cout << "Total max number = " << total << endl;
  cout << "Average = " << average << endl;
  
  return 0;
}
