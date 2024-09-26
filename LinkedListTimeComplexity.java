import java.util.LinkedList;

public class LinkedListTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size : new int[]{1000, 10000, 100000, 1000000}) {
            // LinkedList operations
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            System.out.println("\nLinkedList Operations for size: " + size);
            measureLinkedListOperations(linkedList);
        }
    }

    private static void measureLinkedListOperations(LinkedList<Integer> linkedList) {
        // Read by index
        long startTime = System.nanoTime();
        int value = linkedList.get(linkedList.size() - 1); // Read last element
        long endTime = System.nanoTime();
        System.out.println("Read by index time: " + (endTime - startTime) + " nanoseconds");

        // Read by value
        startTime = System.nanoTime();
        boolean found = linkedList.contains(linkedList.size() - 1); // Searching for last element
        endTime = System.nanoTime();
        System.out.println("Read by value time: " + (endTime - startTime) + " nanoseconds");

        // Insert at head
        startTime = System.nanoTime();
        linkedList.addFirst(-1); // Inserting at head
        endTime = System.nanoTime();
        System.out.println("Insert at head time: " + (endTime - startTime) + " nanoseconds");

        // Insert in the middle
        startTime = System.nanoTime();
        linkedList.add(linkedList.size() / 2, -1); // Inserting in the middle
        endTime = System.nanoTime();
        System.out.println("Insert in middle time: " + (endTime - startTime) + " nanoseconds");

        // Insert at tail
        startTime = System.nanoTime();
        linkedList.addLast(-1); // Inserting at tail
        endTime = System.nanoTime();
        System.out.println("Insert at tail time: " + (endTime - startTime) + " nanoseconds");

        // Delete from head
        startTime = System.nanoTime();
        linkedList.removeFirst(); // Deleting from head
        endTime = System.nanoTime();
        System.out.println("Delete from head time: " + (endTime - startTime) + " nanoseconds");

        // Delete from middle
        startTime = System.nanoTime();
        linkedList.remove(linkedList.size() / 2); // Deleting from middle
        endTime = System.nanoTime();
        System.out.println("Delete from middle time: " + (endTime - startTime) + " nanoseconds");

        // Delete from tail
        startTime = System.nanoTime();
        linkedList.removeLast(); // Deleting from tail
        endTime = System.nanoTime();
        System.out.println("Delete from tail time: " + (endTime - startTime) + " nanoseconds");
    }
}
