package Tasks.BankAccount;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Применяемые проценты:" + interest);
    }

    @Override
    public void withdraw(double amount) {
        // Ограничения могут быть добавлены здесь
        super.withdraw(amount);
    }
}

