
public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, double annualInterestRate, String dateCreated) {
		super(accountNumber, balance, annualInterestRate, dateCreated);
		}

		@Override
		public String toString()
		{
			String res = "Savings Account Details\n";
			res += super.toString();
			return res;
		}

}
