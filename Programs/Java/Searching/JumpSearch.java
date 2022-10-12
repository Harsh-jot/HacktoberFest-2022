/**
 * JumpSearch Algorithm
 * 
 * Jump search can also be termed as evolved Linear search as it's an optimized
 * implementation of Linear search which tends to provide overall better
 * performance but not as fast as binary search
 * 
 * In this algorithm, we define some blocks & then jump to that specific blocks
 * one by one or where the item may exist and apply linear search to that
 * specific part only that's the reason the algorithm is termed as Jump search
 * as we jump to specific locations in order to find out the target element
 * 
 * Approach:
 * -> First we start by calculating the size of the ideal block by the formula √
 * n (could be proven mathematically)
 * -> Further on getting the ideal block size we could divide the input array
 * into the resultant number of blocks i.e blocks size
 * -> And instead of iterating over the entire array, we would figure out in
 * which block the target element exists
 * -> By comparing the last item of each block with the target element if the
 * target element < the last element of that block, we choose that specific
 * block & finally apply Linear Search there in order to get the result
 * -> Moreover we will also check first if the last item == target element if so
 * we would return the index immediately
 * 
 * Complexity: O(√ n )
 */

public class JumpSearch {
  static int[] array = new int[] { 2, 5, 6, 1, 7, 8, 33, 12 };
  static int size = array.length;

  public static void main(String[] args) {
    System.out.println(jumpSearch(85));
  }

  // @params (item to search)
  static int jumpSearch(int item) {
    int blockSize = (int) Math.sqrt(array.length);
    int start = 0;
    int next = blockSize;

    while (start < array.length &&
        array[next - 1] < item) {
      start = next;
      next += blockSize;
      if (next > array.length)
        next = array.length;
    }

    for (var i = start; i < next; i++)
      if (array[i] == item)
        return i;

    return -1;
  }

}
