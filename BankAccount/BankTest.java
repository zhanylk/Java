package Tasks.BankAccount;

public class BankTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000, 5); // 5% годовых
        BankAccount checking = new CheckingAccount(500, 2); // комиссия $2

        System.out.println("Сберегательный счет");
        savings.deposit(200);
        ((SavingsAccount) savings).applyInterest();
        savings.withdraw(150);
        savings.displayBalance();

        System.out.println("\nРасчетнный счет");
        checking.deposit(100);
        checking.withdraw(50);
        checking.displayBalance();
    }
    }

