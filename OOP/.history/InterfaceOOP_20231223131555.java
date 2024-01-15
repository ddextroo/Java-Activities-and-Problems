import java.util.ArrayList;
import java.util.List;

interface Account {
    public void deposit(double amount);

    public void withdraw(double amount);

    public double view_balance();

    AccountType getAccountType();

    public String getAccountName();

    public void calculate_interest();

}

enum AccountType {
    SAVINGS,
    CURRENT
}

class SavingsAccount implements Account {

    private double balance;
    private double interestRate;
    private String name;

    public SavingsAccount(double initialDeposit, double interestRate, String name) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
        this.name = name;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Now deposit " + amount + " to " + getAccountType() + " Account.");
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdraw P" + balance + " from " + getAccountType() + " Account.\n");
    }

    @Override
    public double view_balance() {
        return this.balance;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.SAVINGS;
    }

    @Override
    public String getAccountName() {
        return this.name;
    }

    @Override
    public void calculate_interest() {
        balance += balance * interestRate / 100;
    }
}

class CurrentAccount implements Account {

    private double balance;
    private double overdraftLimit;
    private String name;

    public CurrentAccount(double initialDeposit, double overdraftLimit, String name) {
        this.balance = initialDeposit;
        this.overdraftLimit = overdraftLimit;
        this.name = name;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Now deposit P" + amount + " to " + getAccountType() + " Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdraw P" + balance + "from " + getAccountType() + " Account.\n");
        }
    }

    @Override
    public double view_balance() {
        return this.balance;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.CURRENT;
    }

    @Override
    public String getAccountName() {
        return this.name;
    }

    @Override
    public void calculate_interest() {
        throw new UnsupportedOperationException("Unimplemented method 'calculate_interest'");
    }

}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public Account createAccount(AccountType type, double initialDeposit, double interestOrOverdraft, String name) {
        Account newAccount;
        switch (type) {
            case SAVINGS:
                newAccount = new SavingsAccount(initialDeposit, interestOrOverdraft, name);
                break;
            case CURRENT:
                newAccount = new CurrentAccount(initialDeposit, interestOrOverdraft, name);
                break;
            default:
                throw new IllegalArgumentException("Unsupported account type: " + type);
        }

        accounts.add(newAccount);
        return newAccount;
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.view_balance());
        }
    }
}

public class InterfaceOOP {
    public static void main(String[] args) {
        String name = "Dexter";
        Bank bank = new Bank();
        Account savingsAccount = bank.createAccount(AccountType.SAVINGS, 1000.0, 1.25, name);
        Account currentAccount = bank.createAccount(AccountType.CURRENT, 5000.0, 1000.0, name);
        System.out.println("Account name: " + savingsAccount.getAccountName());
        System.out.println();
        System.out.println("Savings Account:\nInitial Deposit: P1000.00\nInterest rate: 1.25%");
        System.out.println("\nCurrent Account:\nInitial Deposit: P5000.00\nOverdraft Limit: P1000.00");
        savingsAccount.deposit(100.00);
        currentAccount.deposit(500.00);
        savingsAccount.withdraw(150.00);
        System.out.println("\nSavings A/c and Current A/c.:");
        bank.printAccountBalances();
        savingsAccount.calculate_interest();
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c.:");
        bank.printAccountBalances();
    }
}
