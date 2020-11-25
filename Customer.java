import java.util.*;
class Customer
{
	 public static String bankName = "ABHIBANK";
	public String name;
	public double balance;
	Customer(String name)
	{
		this.name = name;
		this.balance = balance;
	}
	public void deposit (double amount)
	{
		this.balance = this.balance+amount;
		System.out.println("After Deposit Blance is:"+this.balance);
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Sorry..Insufficient Fund");
			System.exit(0);
		}
		else
		{
			this.balance = this.balance-amount;
			System.out.println("After withdraw the balance : "+balance);
		}
	}
	
	
	
	public static void main(String args[])
	{
		System.out.println("Welcome to " + Customer.bankName); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name: ");
		String name = sc.next();
		Customer c1 = new Customer(name);
		System.out.println("Hello "+c1.name+"Your Account got Created");
		while(true)
		{
			System.out.println("Choose Your Option to Perform: ");
			System.out.println("D-Deposit \nW-Withdraw \nE-Exit");
			String option =sc.next();
			if(option.equalsIgnoreCase("D"))
			{
				System.out.println("Enter Amount: ");
				double amount = sc.nextDouble();
				c1.deposit(amount);
			}
			else if(option.equalsIgnoreCase("W"))
			{
				System.out.println("Enter amount to withdraw:");
				double amount = sc.nextDouble();
				c1.withdraw(amount);
			}
			else if(option.equalsIgnoreCase("E"))
			{
				System.out.println("Thanks for Banking:");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Option..Pls Chosse valid optino");

			}
		}
	}
}
