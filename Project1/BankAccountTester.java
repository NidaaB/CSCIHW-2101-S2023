package Project1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount nidaaChecking = new BankAccount();
        BankAccount jamesChecking = new BankAccount(10000);

        System.out.println(nidaaChecking.getBalance());
        System.out.println("Balance Starting");
        System.out.println(jamesChecking.getBalance());
        jamesChecking.withdraw(500);
        System.out.println("Balance After withdraw");
        System.out.println(jamesChecking.getBalance());
        jamesChecking.deposit(100);
        System.out.println("Balance After Deposit");
        System.out.println(jamesChecking.getBalance());

        System.out.println(nidaaChecking.getBalance());
        
        nidaaChecking.deposit(50000);
        nidaaChecking.calcCompoundInterest(nidaaChecking.getBalance(), 10, 0.40, 12);


    }
}