public class SelectionSort {
  public static int[] sort(int[] list) {
    int[] sorted = new int[list.length];

    int length = list.length;

    for (int i = 0; i < length; i++) {
      int minIndex = min(list);

      sorted[i] = list[minIndex];

      list = copy(list, minIndex);
    }

    return sorted;
  }

  private static int min(int[] list) {
    int min = list[0], minIndex = 0;

    for (int i = 0; i < list.length; i++) {
      if (min > list[i]) {
        min = list[i];

        minIndex = i;
      }
    }

    return minIndex;
  }

  private static int[] copy(int[] list, int remove) {

    int[] copy = new int[list.length - 1];

    int j = 0;

    for (int i = 0; i < list.length; i++) {
      if (i == remove) {
        continue;
      }

      copy[j] = list[i];

      j++;
    }

    return copy;
  }
}
