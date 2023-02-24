public class BinarySearch<T extends Number> {
  public int search(T[] list, int start, int end, T target) {
    if (start > end) {
      return -1;
    }

    int middle = (start + end) / 2;

    T guess = list[middle];

    if (guess.equals(target)) {
      return middle;
    }

    if (guess.doubleValue() > target.doubleValue()) {
      return search(list, start, middle - 1, target);
    }

    return search(list, middle + 1, end, target);
  }
}
