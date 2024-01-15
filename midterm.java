// Dexter G. Inguito - BSIT 2-2

import java.util.Scanner;

// DecimalToBinaryConverter class converts decimal numbers to binary representation
class DecimalToBinaryConverter {
    private int decimalNumber;            // Decimal number input by the user
    private String binaryRepresentation;  // Binary representation of the decimal number

    // Constructor initializes binaryRepresentation to an empty string
    public DecimalToBinaryConverter() {
        this.binaryRepresentation = "";
    }

    // Method to convert a decimal number to binary
    public void convertToBinary(int decimal) {
        this.decimalNumber = decimal;  // Set the decimalNumber field with the input value

        int decimalValue = this.decimalNumber;

        // Loop to convert decimal to binary using repeated division by 2
        while (decimalValue > 0) {
            int remainder = decimalValue % 2;
            this.binaryRepresentation = remainder + this.binaryRepresentation;  // Build the binary representation
            decimalValue /= 2;
        }
    }

    // Override toString method to provide a string representation of the object
    public String toString() {
        return "Binary of " + this.decimalNumber + " is: " + this.binaryRepresentation;
    }
}

// Main class for the program
public class midterm {
    public static void main(String[] args) {
        DecimalToBinaryConverter converter = new DecimalToBinaryConverter();  // Create an instance of the converter
        Scanner scanner = new Scanner(System.in);

        System.out.println("DECIMAL to BINARY converter using OOP");
        System.out.print("Enter Decimal Number: ");
        converter.convertToBinary(scanner.nextInt());  // Get user input and convert to binary
        scanner.close();
        System.out.println(converter);  // Display the result using toString method
    }
}
