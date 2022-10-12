import java.util.*;

/**
 * Approach
 * Binary Search Algorithm
 * 
 * It's faster than linear search but it only runs upon a sorted list, so before
 * using binary search we should make sure that the list must be sorted before
 * using a binary search algorithm
 * 
 * Complexity:
 * Time -> O(log n)
 * Space -> O(1) for iterative approach
 */
public class BinarySearch {
  static int[] array = new int[] { 2, 5, 6, 1, 7, 8, 33, 12 };
  static int size = array.length;

  public static void main(String[] args) {
    Arrays.sort(array);
    System.out.println(iterativeBinarySearch(2));
    System.out.println(recursiveBinarySearch(2));
  }

  // @params (item to search)
  static int iterativeBinarySearch(int item) {
    int left = 0;
    int right = size - 1;
    int index = -1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (array[mid] == item)
        return index = mid;

      if (array[mid] < item)
        left = mid + 1;

      if (array[mid] > item)
        right = mid - 1;
    }

    return index;
  }

  // @params (item to search)
  static int recursiveBinarySearch(int item) {
    int left = 0;
    int right = size - 1;

    Arrays.sort(array);

    return partitionArray(left, right, item);
  }

  // ======================= utility method =================
  // @params (left index, right index, item to search)
  static int partitionArray(int left, int right, int item) {

    int mid = (left + right) / 2;
    int index = -1;

    if (left > right)
      return index;

    if (array[mid] == item)
      return index = mid;

    if (array[mid] < item)
      return partitionArray(mid + 1, right, item);

    return partitionArray(left, mid - 1, item);

  }
}
