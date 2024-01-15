class Student {
    private int rollNo;
    private String name;
    private String subject;
    private int mark;

    // Constructor
    public Student(int rollNo, String name, String subject, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.mark = mark;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;
    }

    // Display information of the student
    public void displayInfo() {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Name: " + getName());
        System.out.println("Subject: " + getSubject());
        System.out.println("Mark: " + getMark());
        System.out.println("---------------");
    }

    // Carve 2 marks for students with marks < 5
    public void carveMarks() {
        if (getMark() < 5) {
            mark += 2;
            System.out.println("Carved 2 marks for " + getName());
        }
    }

    public static void main(String[] args) {
        // Initial values for 4 students
        Student student1 = new Student(10, "John", "Math", 8);
        Student student2 = new Student(20, "Alice", "Science", 3);
        Student student3 = new Student(30, "Bob", "English", 6);
        Student student4 = new Student(40, "Eva", "History", 2);

        // Display information of all students
        System.out.println("Initial Information of Students:");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();

        // Display information of student with roll-no = 10
        System.out.println("Information of student with Roll No 10:");
        if (student1.getRollNo() == 10) {
            student1.displayInfo();
        }

        // Carve 2 marks for students with marks < 5
        System.out.println("Carving 2 marks for students with marks < 5:");
        student2.carveMarks();
        student4.carveMarks();

        // Display updated information of students
        System.out.println("Updated Information of Students:");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}

