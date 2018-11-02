
public class CheckingAccount extends Account {

	
	public final double OVERDRAFTLIMIT = 100.00;

	public CheckingAccount(int accountNumber, double balance, double annualInterestRate, String dateCreated) {
	super(accountNumber, balance, annualInterestRate, dateCreated);
	}

	@Override
	public void withdraw(double amount)
	{
		if(balance - amount <= OVERDRAFTLIMIT)
		{
			System.out.println("Sorry!!! Your balance cannot goes below " + OVERDRAFTLIMIT);
		} else  {
			super.withdraw(amount);
		}
	}

	@Override
	public String toString()
	{
		String res = "Checking Account Details\n";
		res += super.toString();
		return res;
	}
}
