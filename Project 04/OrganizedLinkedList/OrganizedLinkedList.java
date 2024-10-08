import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// used the command javadoc OrganizedLinkedList.java to generate the javadocs
// the files should be included in a separate folder.
// used the command java OrganizedLinkedList to run the program

/**
 * This class will use some functions that will read, sort, and print a list of integers.
 * This project will use a basic design that will handle basic user input, process data,
 * and present the entered data or output. It also leverages code reuse by using the 
 * classes and methods that already exist within the java library.
 */
public class OrganizedLinkedList {

    /**
     * This is the main entry point of the java project.
     * 
     * This method follows these steps:
     * 1. Prompts the user to enter a list of integers.
     * 2. Reads and computes user input and may handle potential errors.
     * 3. Stores integers in a organized/sorted linked list.
     * 4. Prints the organized/sorted list.
     * 
     * This method will demonstrate code reuse by using the Scanner class
     * to handle input more efficiently and use the Collections.sort method to 
     * sort lists more conveniently.
     *
     * @param args No command line arguments were used yet.
     */
    public static void main(String[] args) {
        // 1. Read and compute user input
        List<Integer> numbers = readIntegerInput();

        // 2. Sort the list using the Collections.sort make sorting more efficient
        Collections.sort(numbers);

        // 3. Print the sorted list
        printSortedList(numbers);
    }

    /**
     * Reads a list of integers from the user's input.
     *
     * This method repeatedly prompts the user to enter integers separated by spaces.
     * It handles potential errors/mistakes and allows the user to end input
     * by entering the word "finish" at the end of the list.
     * 
     * this method reuses the 'Scanner' class to handle input,
     * the 'LinkedList' class will handle the implementation of integers more efficiently,
     * the 'equalsIgnoreCase' method will handle case insensitive string comparisons,
     * and the 'Integer.parseInt' method will handle the conversion of string to integer.
     *
     * @return A list of integers entered by the user.
     */
    private static List<Integer> readIntegerInput() {
        // reuses the scanner class to hanlde input better and more convenient
        Scanner scanner = new Scanner(System.in);
        // reuses the LinkedList for the implementation of the list of integers
        List<Integer> numbers = new LinkedList<>(); // Using LinkedList for efficient insertions

        System.out.println("Enter a list of integers separated by spaces. Enter 'finish' to end:");

        while (scanner.hasNext()) {
            // reuses the variable known as equalIgnoreCase to compare strings without considering letter case
            String input = scanner.next();
            if (input.equalsIgnoreCase("finish")) {
                break; // this will end any input loop
            }

            try {
                // reuses variable known as Integer.parseInt to make a string to integer conversion
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                // this will handle any invalid input
                System.out.println("Invalid input: " + input + ". Please enter an integer or type 'finish' to end.");
            }
        }

        return numbers;
    }

    /**
     * Prints the sorted list of integers.
     *
     * @param numbers The sorted list of integers to be printed.
     */
    private static void printSortedList(List<Integer> numbers) {
        System.out.println("Here is the sorted list:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); 
    }
}