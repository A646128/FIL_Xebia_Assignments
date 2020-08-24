package day5;
import java.util.Scanner;

abstract class Account {
	long accountNumber;
	String name;
	long Amount;
	abstract public void deposit(long a, long amt);
	abstract public void withdraw(long a, long amt);
	}
 final class SBAccount extends Account {
	 SBAccount(String n,long Amt){
		 if (Amt>999)
		 {
			 this.name=n;
			 this.Amount= Amt;
			 System.out.println("Savings Account Number:501038974 has been created Successfully for "+name+" with Amount "+Amount);
			 System.out.println( "User will get 4% interest per month on SB Accounts\n");
		 }
		 else
		 {
			 System.out.println("Savings account cannot be created. Minimum Balance to open the SB Acoount is 1000Rs\n");
		 }
		 
	 }
	
	public void deposit(long a, long amt) {
		Amount = Amount+ amt;
		System.out.println("Amount:"+amt+" has been deposited to SB Account:" +a);
		System.out.println("Total Amount after deposit is "+Amount+"\n");
	}
	public void withdraw(long a, long amt) {
		Amount = Amount- amt;
		System.out.println("Amount: "+amt+" has been withdrawn from SB Account: " +a);
		System.out.println("Total Amount after withdrawn is : "+Amount);
	}
 }
 final class CurrentAccount extends Account {
	 CurrentAccount(String n,long Amt){
		 if (Amt>4999)
		 {
			 this.name=n;
			 this.Amount= Amt;
			 System.out.println("Current Account Number:501038974 has been created Successfully for "+name+" with Amount "+Amount);
		 }
		 else
		 {
			 System.out.println("Current Account cannot be created. Minimum Balance to open the Current Account is 5000Rs \n");
		 }
		 
	 }
	 public void deposit(long a, long amt) {
			Amount = Amount+ amt;
			System.out.println("Amount:"+amt+" has been deposited to Current Account:" +a);
			System.out.println("Total Amount after deposit is "+Amount+"\n");
		}
		public void withdraw(long a, long amt) {
			Amount = Amount- amt;
			System.out.println("Amount: "+amt+" has been withdrawn from Current Account: " +a);
			System.out.println("Total Amount after withdrawn is "+Amount);
		}
}
public class SBCurrentAccount{
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Want to open the Account with us. Please enter one option either Savings or Current");
		String accType=s.nextLine();
		System.out.println("Enter the Name");
		String accName=s.nextLine();
		System.out.println("Enter the Amount");
		long accAmount=s.nextLong();
		
		Account account;
		if(accType.equalsIgnoreCase("Savings")) {
			account = new SBAccount(accName,accAmount);
			System.out.println("Depositing the Entered Amount to the Existing Account");
			account.deposit(501038974,accAmount);
			System.out.println("Withdrawing the Entered Amount from the Existing Account");
			account.withdraw(501038974,accAmount);
		}
		
		else {
			account = new CurrentAccount(accName,accAmount);
			System.out.println("Depositing the Entered Amount to the Existing Account");
			account.deposit(501038974,accAmount);
			System.out.println("Withdrawing the Entered Amount from the Existing Account");
			account.withdraw(501038974,accAmount);
		}
		
		}
}