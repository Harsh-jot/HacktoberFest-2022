public class Main {
    public static void main(String[] args) throws Exception {

        Search search = new Search(new int[] { 2, 5, 6, 1, 7, 8, 33, 12 });

        /**
         * Linear Search
         */
        System.out.println(search.linearSearch(1));

        /**
         * Binary Search (Recursive)
         */
        System.out.println(search.recursiveBinarySearch(1));

        /**
         * Binary Search (Iterative)
         */
        System.out.println(search.iterativeBinarySearch(5));

        /**
         * Ternary Search
         */
        System.out.println(search.ternarySearch(5));

        /**
         * Jump Search
         */
        System.out.println(search.jumpSearch(5));

        /**
         * Exponential Search
         */
        System.out.println(search.exponentialSearch(5));
    }
}
