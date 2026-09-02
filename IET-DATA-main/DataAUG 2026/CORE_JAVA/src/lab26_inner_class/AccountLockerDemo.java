package lab26_inner_class;

/**
 * Lab 26: Demonstrating Inner Class concept (Outer Account, Inner Locker).
 * Run command: java -cp bin lab26_inner_class.AccountLockerDemo
 */
class Account {
    private int accId;
    private String holderName;
    private double balance;

    public Account(int accId, String holderName, double balance) {
        this.accId = accId;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccId() { return accId; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public class Locker {
        private int lockerId;
        private int durationInMonths;

        public Locker(int lockerId, int durationInMonths) {
            this.lockerId = lockerId;
            this.durationInMonths = durationInMonths;
        }

        public void showData() {
            System.out.println("+--------------------------------------------------------+");
            System.out.println("|              ACCOUNT & LOCKER DETAILS                  |");
            System.out.println("+--------------------------------------------------------+");
            System.out.printf("| Account ID       : %-35d |\n", accId);
            System.out.printf("| Account Holder   : %-35s |\n", holderName);
            System.out.printf("| Account Balance  : $%-34.2f |\n", balance);
            System.out.println("+--------------------------------------------------------+");
            System.out.printf("| Locker ID        : %-35d |\n", lockerId);
            System.out.printf("| Locker Duration  : %-28d months |\n", durationInMonths);
            System.out.println("+--------------------------------------------------------+");
        }
    }
}

public class AccountLockerDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         JAVA INNER CLASS DEMONSTRATION           ");
        System.out.println("==================================================");

        Account accountObj = new Account(1002541, "Robert Downey Jr.", 150000.75);
        Account.Locker lockerObj = accountObj.new Locker(8092, 24);

        System.out.println("\nInvoking Inner Class showData() method:\n");
        lockerObj.showData();

        System.out.println("==================================================");
    }
}
