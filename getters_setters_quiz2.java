import java.util.Scanner;

// Class representing the string reverser
class StringReverser {
    private String originalString;
    private String reversedString;

    // Default constructor
    public StringReverser() {
        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Input a string: ");
        originalString = scanner.nextLine();

        // Reverse the string
        reverseString();
    }

    // Getter for the reversed string
    public String getReversedString() {
        return reversedString;
    }

    // Method to reverse the string
    private void reverseString() {
        char[] charArray = originalString.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters from the beginning and end of the array
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // Create the reversed string
        reversedString = new String(charArray);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the StringReverser class using the default constructor
        StringReverser stringReverser = new StringReverser();

        // Get and display the reversed string
        String reversedString = stringReverser.getReversedString();
        System.out.println("Reverse string: " + reversedString);
    }
}
