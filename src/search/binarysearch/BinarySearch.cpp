#include <cmath>
#include <vector>

class BinarySearch {
  public:

  static int search(std::vector<int> list, int target) {
    int bottom = 0;

    int top = list.size();

    while (bottom < top) {
      int middle = floor((bottom + top) / 2);

      int guess = list[middle];

      if (guess == target) {
        return middle;
      }

      if (guess > target) {
        top = middle - 1;
      } else {
        bottom = middle + 1;
      }
    }

    return -1;
  }
};
