import java.util.ArrayList;

class NameListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> nameList = new ArrayList<>();

        // Add names to the ArrayList
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        nameList.add("David");

        // Display names on the console
        System.out.println("Names in the ArrayList:");
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
