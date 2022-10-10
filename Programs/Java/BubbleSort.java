public class BubbleSort {
  public static void sort(int[] arr) {
    boolean isSorted;
    for (int i = 0; i < arr.length; i++) {
      isSorted = true;
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          isSorted = false;
        }
      }
      if (isSorted)
        return;
    }
  }
}
