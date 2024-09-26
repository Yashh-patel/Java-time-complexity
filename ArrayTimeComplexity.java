public class ArrayTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size : new int[]{1000, 10000, 100000, 1000000}) {
            // Array operations
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            System.out.println("\nArray Operations for size: " + size);
            measureArrayOperations(array);
        }
    }

    private static void measureArrayOperations(int[] array) {
        // Read by index
        long startTime = System.nanoTime();
        int value = array[array.length - 1]; // Read last element
        long endTime = System.nanoTime();
        System.out.println("Read by index time: " + (endTime - startTime) + " nanoseconds");

        // Read by value
        startTime = System.nanoTime();
        boolean found = false;
        for (int num : array) {
            if (num == array.length - 1) { // Searching for last element
                found = true;
                break;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Read by value time: " + (endTime - startTime) + " nanoseconds");

        // Insert at head
        int[] newArray = new int[array.length + 1];
        startTime = System.nanoTime();
        newArray[0] = -1; // Inserting at head
        System.arraycopy(array, 0, newArray, 1, array.length);
        endTime = System.nanoTime();
        System.out.println("Insert at head time: " + (endTime - startTime) + " nanoseconds");

        // Insert in middle
        newArray = new int[array.length + 1];
        startTime = System.nanoTime();
        System.arraycopy(array, 0, newArray, 0, array.length / 2);
        newArray[array.length / 2] = -1; // Inserting in the middle
        System.arraycopy(array, array.length / 2, newArray, (array.length / 2) + 1, array.length - (array.length / 2));
        endTime = System.nanoTime();
        System.out.println("Insert in middle time: " + (endTime - startTime) + " nanoseconds");

        // Insert at tail
        newArray = new int[array.length + 1];
        startTime = System.nanoTime();
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = -1; // Inserting at tail
        endTime = System.nanoTime();
        System.out.println("Insert at tail time: " + (endTime - startTime) + " nanoseconds");

        // Delete from head
        startTime = System.nanoTime();
        int[] smallerArray = new int[array.length - 1];
        System.arraycopy(array, 1, smallerArray, 0, array.length - 1); // Deleting from head
        endTime = System.nanoTime();
        System.out.println("Delete from head time: " + (endTime - startTime) + " nanoseconds");

        // Delete from middle
        startTime = System.nanoTime();
        smallerArray = new int[array.length - 1];
        System.arraycopy(array, 0, smallerArray, 0, array.length / 2);
        System.arraycopy(array, (array.length / 2) + 1, smallerArray, array.length / 2, array.length - (array.length / 2) - 1); // Deleting from middle
        endTime = System.nanoTime();
        System.out.println("Delete from middle time: " + (endTime - startTime) + " nanoseconds");

        // Delete from tail
        startTime = System.nanoTime();
        smallerArray = new int[array.length - 1];
        System.arraycopy(array, 0, smallerArray, 0, array.length - 1); // Deleting from tail
        endTime = System.nanoTime();
        System.out.println("Delete from tail time: " + (endTime - startTime) + " nanoseconds");
    }
}
