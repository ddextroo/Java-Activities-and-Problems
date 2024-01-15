import java.util.ArrayList;
import java.util.List;

interface Account {
    public void deposit(double amount);

    public void withdraw(double amount);

    public double view_balance();

    AccountType getAccountType();

    public String getAccountName();

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
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double calculate_interest() {
        return balance += balance * interestRate / 100;
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
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
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

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountName() {
        return this.name;
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
}

public class InterfaceOOP {
    public static void main(String[] args) {
        String name = "dexter";
        Bank bank = new Bank();
        Account account1 = bank.createAccount(AccountType.SAVINGS, 1200.0, 1.25, name);
        Account account2 = bank.createAccount(AccountType.CURRENT, 1500.0, 1000.0, name);

        System.out.println(account1.view_balance());

    }
}
