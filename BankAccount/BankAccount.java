package Tasks.BankAccount;

public class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Достпуно" + amount);
        } else {
            System.out.println("Доступно");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Изъято" + amount);
        } else {
            System.out.println("Недостаточно средств или неверная сумма");
        }
    }

    public void displayBalance() {
        System.out.println("Текущий баланс" + balance);
    }
}
