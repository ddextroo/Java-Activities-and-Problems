import java.util.*;

public class middle {

    public static void main(String[] args) {
        //Input string
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scan.nextLine();
        scan.close();

        // Result
        System.out.println("The middle character(s) in the string: " + displayMiddleCharacter(input));
    }

    public static String displayMiddleCharacter(String input) {
        int length = input.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            // For even-length strings, there are two middle characters
            char[] middleChars = {input.charAt(middleIndex - 1), input.charAt(middleIndex)};
            return "" + middleChars[0] + middleChars[1];
        } else {
            // For odd-length strings, there is one middle character
            char middleChar = input.charAt(middleIndex);
            return String.valueOf(middleChar);
        }
    }
}
