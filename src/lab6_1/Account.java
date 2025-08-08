package lab6_1;

public class Account {
	int id;
	double balance;
	String owner;

	Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}

	void deposit(double amount) {
		this.balance += amount;
	}

	void withdraw(double amount) {
		System.out.printf("Trying to withdraw: £ %g%n", amount);
		if (amount > balance){
			throw new IllegalArgumentException("Error : Insufficient funds");
			//return;
		}
		this.balance -= amount;
	}

	void close() {
		System.out.printf("This account %d is closed%n", this.id);
	}

	void getDetails() {
		System.out.printf("This account %d is for %s has a balance of: £ %g%n", this.id, this.owner, this.balance);
	}

}