package multithreading;

//BankAccount class that simulates a bank account
class BankAccount {
	double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	// Synchronized method to deposit money
	public synchronized void deposit(double amount) {
		System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
		balance += amount;
		System.out.println("New balance after deposit: " + balance);
	}

	// Synchronized method to withdraw money
	public synchronized void withdraw(double amount) {
		if (amount <= balance) {
			System.out.println(Thread.currentThread().getName() + " withdrawing: " + amount);
			balance -= amount;
			System.out.println("New balance after withdrawal: " + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + " insufficient funds for withdrawal of: " + amount);
		}
	}
}

//Customer class that implements Runnable for multithreading
class Customer implements Runnable {
	private BankAccount account;

	public Customer(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(100); // Deposit money
		account.withdraw(50); // Withdraw money
		account.withdraw(200); // Try to withdraw more than balance
	}
}

public class BankingSystemExample {
	public static void main(String[] args) {
		// Creating a shared BankAccount object
		BankAccount account = new BankAccount(150);

		// Creating multiple Customer threads
		Thread customer1 = new Thread(new Customer(account), "Customer 1");
		Thread customer2 = new Thread(new Customer(account), "Customer 2");
		Thread customer3 = new Thread(new Customer(account), "Customer 3");

		// Starting the threads
		customer1.start();
		customer2.start();
		customer3.start();

		// Wait for all threads to finish
		try {
			customer1.join();
			customer2.join();
			customer3.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}

		System.out.println("Final balance: " + account.balance);
	}
}
