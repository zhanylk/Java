package Tasks.BankAccount;

public class CheckingAccount extends BankAccount{
    private double transactionFee;

    public CheckingAccount(double initialBalance, double transactionFee) {
        super(initialBalance);
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount + transactionFee <= balance) {
            super.withdraw(amount + transactionFee);
            System.out.println("Комиссия за транзакцию" + transactionFee);
        } else {
            System.out.println("Не достаточно средств");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > transactionFee) {
            super.deposit(amount - transactionFee);
            System.out.println("Комиссия" + transactionFee);
        } else {
            System.out.println("Сумма депозита должна превышать комиссию за транзакцию");
        }
    }
}
