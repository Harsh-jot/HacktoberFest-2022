public class SelectionSort {
  public void sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int index = i;
      for (int j = i; j < n; j++)
        if (arr[j] < arr[index])
          index = j;
      int temp = arr[i];
      arr[i] = arr[index];
      arr[index] = temp;
    }
  }
}
