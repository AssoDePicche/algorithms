public class BinarySearch<T> {
  public int search(T[] list, int start, int end, T target) {
    try {
      if (start > end) {
        return -1;
      }

      int middle = (start + end) / 2;

      T guess = list[middle];

      if (guess.equals(target)) {
        return middle;
      }

      if (guess.hashCode() > target.hashCode()) {
        return search(list, start, middle - 1, target);
      }

      return search(list, middle + 1, end, target);
    } catch (ArrayIndexOutOfBoundsException exception) {
      return -1;
    }
  }
}
