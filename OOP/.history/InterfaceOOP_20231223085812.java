import java.util.*;

interface Account {
    public void deposit(double amount);

    public void withdraw(double amount);

    public double calculate_interest();

    public double view_balance();

    AccountType getAccountType();

}

enum AccountType {
    SAVINGS,
    CURRENT
}

class SavingsAccount implements Account {

    private String accountName;
    private double amount;

    public SavingsAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.amount -= amount;
    }

    @Override
    public double calculate_interest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculate_interest'");
    }

    @Override
    public double view_balance() {
        return this.amount;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.SAVINGS;
    }

    public String getAccountName() {
        return this.accountName;
    }

}

class CurrentAccount implements Account {

    private String accountName;
    private double amount;

    public CurrentAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.amount -= amount;
    }

    @Override
    public double calculate_interest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculate_interest'");
    }

    @Override
    public double view_balance() {
        return this.amount;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.CURRENT;
    }

    public String getAccountName() {
        return this.accountName;
    }

}

class Bank {
    public Account createAccount(AccountType type, String AccountName) {
        switch (type) {
            case SAVINGS:
                return new SavingsAccount(AccountName);
            case CURRENT:
                return new CurrentAccount(AccountName);
            default:
                throw new IllegalArgumentException("Unsupported account type: " + type);
        }
    }
}

public class InterfaceOOP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose = 0;
        double amount = 0;
        String name = "";
        Bank bank = new Bank();
        Account account = bank.createAccount(AccountType.SAVINGS, name);

        do {
            System.out.println("""
                    Welcome to bank uwu
                    Press 1 for Savings Account
                    Press 2 for Current Account
                    Press 3 to quit
                    """);
            System.out.println("Select type: ");
            choose = scan.nextInt();
            System.out.println("Input account name: ");
            name = scan.next();
            if (choose == 1) {
                account = bank.createAccount(AccountType.SAVINGS, name);
            } else if (choose == 2) {
                account = bank.createAccount(AccountType.CURRENT, name);
            }
            System.out.println("""
                    Select 1 for deposit or 2 for withdraw
                    """);
            choose = scan.nextInt();
            if (choose == 1) {
                System.out.println("Initial Deposit: ");
                amount = scan.nextDouble();
                account.deposit(amount);
                System.out.println("Now deposit P" + amount + "to" + account.getAccountType() + "Account");
            } else if (choose == 2) {
                System.out.println("Initial Deposit: ");
                amount = scan.nextDouble();
                account.withdraw(amount);
                System.out.println("Withdraw P" + amount + "from " + account.getAccountType() + " Account");
            }
        } while (choose != 3);
        scan.close();
    }
}
