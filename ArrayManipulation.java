import java.util.Arrays;
import java.util.Scanner;

/**
 * Array Manipulation and Analysis
 *
 * @author Joshua Barrett
 * Class: CISC 191
 */
public class ArrayManipulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Save the original array
        int[] original = Arrays.copyOf(numbers, numbers.length);

        // Calculate the sum
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Find maximum and minimum
        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        // Search for a specific value
        System.out.print("Enter a value to search for: ");
        int searchValue = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchValue) {
                found = true;
                break;
            }
        }

        // Sort the array
        Arrays.sort(numbers);

        // Create and reverse a copy of the sorted array
        int[] reversed = Arrays.copyOf(numbers, numbers.length);

        for (int i = 0; i < reversed.length / 2; i++) {

            int temp = reversed[i];

            reversed[i] = reversed[reversed.length - 1 - i];

            reversed[reversed.length - 1 - i] = temp;
        }

        // Display results
        System.out.println("\n--- Results ---");

        System.out.println("Original Array: "
                + Arrays.toString(original));

        System.out.println("Sum: " + sum);

        System.out.println("Average: " + average);

        System.out.println("Maximum: " + maximum);

        System.out.println("Minimum: " + minimum);

        System.out.println("Sorted Array: "
                + Arrays.toString(numbers));

        System.out.println("Reversed Array: "
                + Arrays.toString(reversed));

        if (found) {
            System.out.println(searchValue + " was found in the array.");
        } else {
            System.out.println(searchValue + " was not found in the array.");
        }

        // Close scanner
        scanner.close();
    }
}
