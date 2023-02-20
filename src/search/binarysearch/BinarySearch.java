public class BinarySearch {
  public static int search(int[] list, int start, int end, int target) {
    if (start > end) {
      return -1;
    }

    int middle = (start + end) / 2;

    int guess = list[middle];

    if (guess == target) {
      return middle;
    }

    if (guess > target) {
      return search(list, start, middle - 1, target);
    }

    return search(list, middle + 1, end, target);
  }
}
