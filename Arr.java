import java.util.Scanner;

public class Arr {
    
    // Method to perform addition and store in an array
    public static int[] addNumbers(int[] num1, int[] num2) {
        int size = num1.length;
        int[] sumArray = new int[size];

        for (int i = 0; i < size; i++) {
            sumArray[i] = num1[i] + num2[i]; // Perform addition
        }

        return sumArray; // Return the result array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        // Taking input for first array
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Taking input for second array
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Call the method to get the sum array
        int[] resultArray = addNumbers(array1, array2);

        // Display the result
        System.out.println("Sum of corresponding elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(array1[i] + " + " + array2[i] + " = " + resultArray[i]);
        }

        scanner.close();
    }
}
