/**
 * Linear Search Algorithm
 * Approach
 * In this algorithm we iterate over a list & spec each item until we find one,
 * and return its index otherwise we return -1 meaning the item doesn't exist in
 * the list
 * 
 * Complexity:
 * Time -> O(n)
 * Space -> O(1)
 */
public class LinearSearch {
  static int[] array = new int[] { 2, 5, 6, 1, 7, 8, 33, 12 };
  static int size = array.length;

  public static void main(String[] args) {
    System.out.println(linearSearch(2));
  }

  // @params (item to search)
  static int linearSearch(int item) {
    var index = -1;

    for (int i = 0; i < size; i++)
      if (array[i] == item)
        return index = i;

    return index;
  }
}
