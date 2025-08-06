package lab2_1;

public class Bank {
	int lastID;
	Account[] accounts = new Account[3];
	
	public Account addAccount(String owner, double balance) {
		if (lastID + 1 > accounts.length) {
			return null;
		}
		
		
		Account account = new Account(lastID, owner, balance);
		accounts[lastID] = account;
		this.lastID += 1;
		return account;
	}
	
	public Account getAccount(String owner) {
		for (Account account : accounts ) {
			if (account == null) {
				continue;
			}
			if (account.owner == owner) {
				return account;
			}
		}
		return null;
	}
}
