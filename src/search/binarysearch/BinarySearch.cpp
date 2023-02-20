#include <cmath>
#include <vector>

class BinarySearch {
  public:
    static int search(std::vector<int> list, int start, int end, int target) {
      if (start > end) {
        return -1;
      }

      int middle = floor((start + end) / 2);

      int guess = list[middle];

      if (guess == target) {
        return middle;
      }

      if (guess > target) {
        return search(list, 0, middle - 1, target);
      }

      return search(list, middle + 1, end, target);
    }
};
