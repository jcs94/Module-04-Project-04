# Module-04-Project-04

## OrganizedLinkedList

This project reads, sorts, and prints a list of integers provided by the user. It demonstrates handling user input, processing data, and presenting the output using Java's built-in classes and methods.

## Some features

- Prompts the user to enter a list of integers separated by spaces.
- Reads and handles user input, including errors like invalid characters or non-integer values.
- Sorts the collected integers in ascending order.
- Stores the sorted integers in a LinkedList.
- Displays the sorted list of integers.

## Running the Project

Use the following commands in your terminal to generate documentation and run the program:

Command to generate documentation:
javadoc OrganizedLinkedList.java

Command to run program:
java OrganizedLinkedList

## How It Works

1. The program displays a message asking the user to enter a list of integers separated by spaces and instructs them to type "finish" to end the input.
2. It reads the integers entered by the user, handling potential errors such as invalid characters or non-integer values. It continues reading input until the user types "finish."
3. It sorts the collected integers in ascending order using Collections.sort().
4. The sorted integers are stored in a LinkedList for efficient insertions.
5. Finally, the sorted integers are displayed.
