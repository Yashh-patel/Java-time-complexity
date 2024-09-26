import java.util.HashSet;
import java.util.Set;

public class SetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of Sets
        for (int size : new int[]{1000, 10000, 100000, 1000000}) {
            // HashSet operations
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                set.add(i);
            }

            System.out.println("\nHashSet Operations for size: " + size);
            measureSetOperations(set, size);
        }
    }

    private static void measureSetOperations(Set<Integer> set, int size) {
        // Read by value (contains)
        long startTime = System.nanoTime();
        boolean found = set.contains(size - 1); // Searching for the last element
        long endTime = System.nanoTime();
        System.out.println("Read by value time (contains): " + (endTime - startTime) + " nanoseconds");

        // Insert new element
        startTime = System.nanoTime();
        set.add(-1); // Inserting a new value
        endTime = System.nanoTime();
        System.out.println("Insert new element time: " + (endTime - startTime) + " nanoseconds");

        // Delete existing element
        startTime = System.nanoTime();
        set.remove(size - 1); // Deleting the last element
        endTime = System.nanoTime();
        System.out.println("Delete existing element time: " + (endTime - startTime) + " nanoseconds");

        // Insert duplicate element (not effective in HashSet)
        startTime = System.nanoTime();
        set.add(-1); // Trying to add an existing element
        endTime = System.nanoTime();
        System.out.println("Insert duplicate element time: " + (endTime - startTime) + " nanoseconds");

        // Delete non-existing element
        startTime = System.nanoTime();
        set.remove(size + 1); // Trying to delete a non-existing element
        endTime = System.nanoTime();
        System.out.println("Delete non-existing element time: " + (endTime - startTime) + " nanoseconds");
    }
}
