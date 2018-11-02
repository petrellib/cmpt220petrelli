
public class AccountTest {

	
	public static void main(String[] args) {
		
		Account acct = new Account(1717, 1000, 1.5, "10/25/1997");
		CheckingAccount cacct = new CheckingAccount(1718, 500, 10.0, "05/06/2000");
		SavingsAccount sacct = new SavingsAccount(1719, 1000, 0.37, "10/11/2005");
		
		System.out.println(acct.toString());
		System.out.println(cacct.toString());
		System.out.println(sacct.toString());

	}

}
