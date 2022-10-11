import java.util.Arrays;

/**
 * Ternary Search Algorithm
 * 
 * This algorithm is similar to the Binary Search algorithm, instead of dividing
 * the list into half at each step we tend to divide it into 3 parts
 * 
 * So in order to divide the list into 3 parts, we use 2 pointers to point mid
 * suppose mid_1 & mid_2
 * 
 * Then we calculate the partition-size for each step by (right - left) / 2
 * -> mid_1 can be calculated by left + partition-size
 * -> mid_2 = right - partition-size
 * 
 * Once we found the midpoints we need a few comparisons in order to find the
 * target value, if the result is not one of the middle points it would lie
 * between them
 * 
 * Complexity:
 * Time -> O(log base 3)
 * 
 * Bonus**
 * Binary Vs Ternary Search
 * Binary search is faster than Ternary search even if (log base 3 of a number <
 * log base 2 of a number) in Ternary search the number of conditional
 * statements increases, as the total number of comparisons defined a number in
 * worst case scenario are more in Ternary search (can be proven mathematically)
 * 
 * Note: As we divide the array into more parts our search algorithm gets even
 * slower
 */
public class TernarySearch {
  static int[] array = new int[] { 2, 5, 6, 1, 7, 8, 33, 12 };
  static int size = array.length;

  public static void main(String[] args) {
    Arrays.sort(array);
    System.out.println(ternarySearch(2));
  }

  // @params (item to search)
  static int ternarySearch(int item) {
    return search(0, size - 1, item);
  }

  // @params (left index, right index, item to search)
  static int search(int left, int right, int item) {
    int partitionSize = (size - 1) / 3;
    int mid1 = left + partitionSize;
    int mid2 = right - partitionSize;

    if (left > right)
      return -1;

    if (array[mid1] == item)
      return mid1;

    if (array[mid2] == item)
      return mid2;

    if (array[mid1] < item)
      return search(left, mid1 - 1, item);

    if (array[mid2] < item)
      return search(mid2 + 1, right, item);

    return search(mid1 + 1, mid2 - 1, item);
  }
}
