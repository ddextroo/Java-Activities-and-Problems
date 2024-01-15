import java.util.Scanner;

// Class representing the calculator
class Calculator {
    private double number1;
    private double number2;

    // Getter for number1
    public double getNumber1() {
        return number1;
    }

    // Setter for number1
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    // Getter for number2
    public double getNumber2() {
        return number2;
    }

    // Setter for number2
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    // Method to compute the product
    public double computeProduct() {
        return number1 * number2;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input for number1
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        calculator.setNumber1(num1);

        // Input for number2
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        calculator.setNumber2(num2);

        // Compute and display the product
        double product = calculator.computeProduct();
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}
