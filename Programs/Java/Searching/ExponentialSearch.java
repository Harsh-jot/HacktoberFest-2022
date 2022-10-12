
/**
 * Exponential Search
 * 
 * Approach
 * The idea behind Exponential search is to start iterating from a small range
 * and speculate if the target element is available in the range or not
 * 
 * If not then we end up doubling the range & once we find the range where we
 * could retrieve our target element we would use Binary search over there
 * 
 * Complexity: Since we are using Binary Search internally to search the desired
 * element
 * so the complexity would be O(log i) in the worst case, where i is the index
 * of the target value (for the worst case is like applying the binary search
 * up-to i elements) also the maximum number of times we could divide the array
 * into half is log n
 */
public class ExponentialSearch {
  static int[] array = new int[] { 2, 5, 6, 1, 7, 8, 33, 12 };
  static int size = array.length;

  public static void main(String[] args) {
    System.out.println(exponentialSearch(8));
  }

  static int exponentialSearch(int item) {
    int bound = 1;

    while (bound < size && array[bound] < item)
      bound *= 2;

    int left = bound / 2;
    int right = Math.min(bound, size - 1);

    return partitionArray(left, right, item);
  }

  // ======================= utility method =================
  // @params (left index, right index, item to search)
  static int partitionArray(int left, int right, int item) {

    int mid = (left + right) / 2;

    if (left > right)
      return -1;

    if (array[mid] == item)
      return mid;

    if (array[mid] < item)
      return partitionArray(mid + 1, right, item);

    return partitionArray(left, mid - 1, item);
  }
}
