// Define a class to represent a person
class Person {
    // Private fields to encapsulate the person's attributes
    private String name;
    private int age;

    // Constructor to initialize the person with a name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print the details of the person
    public void printDetails() {
        System.out.printf("Name: %s\nAge: %d\n", this.name, this.age);
    }
}

// Main class to demonstrate the usage of the Person class
public class details {
    public static void main(String[] args) {
        // Create a new Person instance with name "Dexter" and age 20
        new Person("Dexter", 20).printDetails(); // Invoke the printDetails method to display the details
    }
}
