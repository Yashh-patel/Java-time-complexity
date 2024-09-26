import java.util.ArrayList;

public class ArrayListTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size : new int[]{1000, 10000, 100000, 1000000}) {
            // ArrayList operations
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            System.out.println("\nArrayList Operations for size: " + size);
            measureArrayListOperations(arrayList);
        }
    }

    private static void measureArrayListOperations(ArrayList<Integer> arrayList) {
        // Read by index
        long startTime = System.nanoTime();
        int value = arrayList.get(arrayList.size() - 1); // Read last element
        long endTime = System.nanoTime();
        System.out.println("Read by index time: " + (endTime - startTime) + " nanoseconds");

        // Read by value
        startTime = System.nanoTime();
        boolean found = arrayList.contains(arrayList.size() - 1); // Searching for last element
        endTime = System.nanoTime();
        System.out.println("Read by value time: " + (endTime - startTime) + " nanoseconds");

        // Insert at head
        startTime = System.nanoTime();
        arrayList.add(0, -1); // Inserting at head
        endTime = System.nanoTime();
        System.out.println("Insert at head time: " + (endTime - startTime) + " nanoseconds");

        // Insert in the middle
        startTime = System.nanoTime();
        arrayList.add(arrayList.size() / 2, -1); // Inserting in the middle
        endTime = System.nanoTime();
        System.out.println("Insert in middle time: " + (endTime - startTime) + " nanoseconds");

        // Insert at tail
        startTime = System.nanoTime();
        arrayList.add(-1); // Inserting at tail
        endTime = System.nanoTime();
        System.out.println("Insert at tail time: " + (endTime - startTime) + " nanoseconds");

        // Delete from head
        startTime = System.nanoTime();
        arrayList.remove(0); // Deleting from head
        endTime = System.nanoTime();
        System.out.println("Delete from head time: " + (endTime - startTime) + " nanoseconds");

        // Delete from middle
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() / 2); // Deleting from middle
        endTime = System.nanoTime();
        System.out.println("Delete from middle time: " + (endTime - startTime) + " nanoseconds");

        // Delete from tail
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1); // Deleting from tail
        endTime = System.nanoTime();
        System.out.println("Delete from tail time: " + (endTime - startTime) + " nanoseconds");
    }
}
