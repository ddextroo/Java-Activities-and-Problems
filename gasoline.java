import java.util.*;
public class gasoline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0, amount = 0;
        int numLiters = 0;
        System.out.println("Welcome to the gasoline station");
        System.out.print("Enter the price per liter of gas: ");
        price = scan.nextDouble();
        System.out.print("How many liters would you want? ");
        numLiters = scan.nextInt();
        System.out.print("Enter amount to pay: ");
        amount = scan.nextInt();
        scan.close();
        System.out.printf("Total amount: %.2f\n", calculate(price, numLiters, amount)[0]);
        System.out.printf("Your change: %.2f", calculate(price, numLiters, amount)[1]);

    }
    public static double[] calculate(double price, int liters, double amount) {
        double total[] = new double[2];
        total[0] = price * liters;
        total[1] = amount - total[0];
        return total;
    }
}
