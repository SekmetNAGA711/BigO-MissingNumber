public class DataStructuresAlgorithms {
    public static int recursiveSearch(String target, String[] items, int index) {
        //  If index is out of bounds, the item is not in the list
        if (index >= items.length) {
            return -1;
        }

        //  If the item at the current index matches the target, return the index
        if (items[index].equals(target)) {
            return index;
        }

        // Recursive step: Check the next index
        return recursiveSearch(target, items, index + 1);
    }

    public static int recursiveSearch(String target, String[] items) {
        return recursiveSearch(target, items, 0);
    }

    public static void main(String[] args) {
        String[] arr = {"hey", "there", "you"};
        System.out.println(recursiveSearch("hey", arr));       // Output: 0
        System.out.println(recursiveSearch("porcupine", arr)); // Output: -1
    }
}

