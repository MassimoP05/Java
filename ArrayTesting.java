// Declares a new int array with a length of 5
// int[] intArray = new int[5];

// Prints the size of the array
// System.out.println(intArray.length);

// Declares a new int array with a length of 5
// int[] intArray = new int[5];
// Declares a new int with the value of the array's size
// int length = intArray.length;
// Prints the size of the array
// System.out.println(length);

// Arrays.sort(array): sorts the elements of the array in ascending order;
// Arrays.fill(array, value): sets all elements of the array to the specified value;
// Arrays.toString(array): converts the array into a string representation, making it easier to display its elements.

// int[] array = {5, 2, 9, 1, 6};
        
        // Sort the array
        // Arrays.sort(array);
        // System.out.println("Sorted array: " + Arrays.toString(array));
        
        // Fill the array with the value 0
        // Arrays.fill(array, 0);
        //System.out.println("Array after filling: " + Arrays.toString(array));

        
        
        // Declares a new int array with a length of 5
        // int[] intArray = new int[5];
        // Fills the array with numbers from 1 to 5
        // intArray[0] = 1;
        // intArray[1] = 2;
        // intArray[2] = 3;
        // intArray[3] = 4;
        // intArray[4] = 5;
        // Prints the fourth element of the array
        // System.out.println(intArray[3]);



import java.util.Arrays;

public class ArrayTesting {
    public static void main(String[] args) {
        

        int[] array = {3,7,4,6,9,1,2,3,2,4};    
        // Arrays.sort(array); //sorting in acending order
        // Arrays.fill(array, 0); //changes all values to 0 in the choosen array
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        array[7] = 1;
        array[8] = 1;
        array[9] = 1; // changes individual spots in the array

        System.out.println(Arrays.toString(array)); // converts the array to sting while printing it 

    }
}