package Oops;

public class dataHiding {

    class Account {
        private double balance;

        // Constructor
        public Account(double balance) {
            this.balance = balance;
        }

        // Getter
        public double getBalance() {
            return balance;
        }

        // Setter
        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    class TestApp {
        public static void main(String[] args) {
            // Create outer object
            dataHiding outer = new dataHiding();

            // Create Account object
            Account acc = outer.new Account(5000);

            // Access balance
            System.out.println("Initial Balance: " + acc.getBalance());

            // Update balance
            acc.setBalance(8000);
            System.out.println("Updated Balance: " + acc.getBalance());
        }
    }
}