public class Week7ArrayCopy {
    public static void main(String[] args) {
        // Step 1: Declare and initialise the original array
        int[] originalArray = {10, 20, 30};

        // Step 2: Create a new array of the same length
        int[] copiedArray = new int[originalArray.length];

        // Step 3: Manually copy each element using a for loop
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Step 4: Print original array
        System.out.print("Original Array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        System.out.println(); // Line break

        // Step 5: Print copied array
        System.out.print("Copied Array:   ");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }

        System.out.println();
    }
}