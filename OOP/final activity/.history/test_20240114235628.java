/// Abstract superclass
abstract class Employee {
    private int id;
    private String name;
    private String mobileNumber;
    private double salary;

    // Constructor
    public Employee(int id, String name, String mobileNumber, double salary) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
    }

    // Abstract method to get employee information
    public abstract void displayInfo();

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for mobileNumber
    public String getMobileNumber() {
        return mobileNumber;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

// Concrete subclass
class FullTimeEmployee extends Employee {
    // Constructor
    public FullTimeEmployee(int id, String name, String mobileNumber, double salary) {
        super(id, name, mobileNumber, salary);
    }

    // Implementation of abstract method
    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.println("Salary: $" + getSalary());
        System.out.println();
    }
}

class EmployeeExample {
    public static void main(String[] args) {
        // Initialize four employees
        FullTimeEmployee employee1 = new FullTimeEmployee(1, "Ahmad", "1234567890", 50000);
        FullTimeEmployee employee2 = new FullTimeEmployee(2, "Bob", "9876543210", 60000);
        FullTimeEmployee employee3 = new FullTimeEmployee(3, "Charlie", "5551234567", 70000);
        FullTimeEmployee employee4 = new FullTimeEmployee(4, "David", "8889990000", 80000);

        // Display information for the employee with the name "Ahmad"
        displayEmployeeInfo("Ahmad", employee1, employee2, employee3, employee4);
    }

    // Helper method to display information for an employee with a specific name
    private static void displayEmployeeInfo(String targetName, Employee... employees) {
        System.out.println("Displaying information for employee with name '" + targetName + "':");
        for (Employee employee : employees) {
            if (employee.getName().equals(targetName)) {
                employee.displayInfo();
                return; // Stop searching after finding the employee
            }
        }
        System.out.println("Employee with name '" + targetName + "' not found.");
    }
}
