public class BinarySearch {
  public static int search(int[] list, int target) {
    int bottom = 0, top = list.length;

    while (bottom < top) {
      int middle = (int) Math.floor((bottom + top) / 2);

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
}
