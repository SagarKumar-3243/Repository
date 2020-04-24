import java.util.Scanner;

class Bankc
{
	public String depName;
	public String accNumber;
	public String accType;
	public int balance;
	
	public void deposit()
	{	Scanner input = new Scanner(System.in);
		System.out.println("Enter how much money you want to deposit: ");
		int amount = input.nextInt();
		balance += amount;
	} 
	public void withdraw()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how much money you want withdraw: ");
		int amount = input.nextInt();
		if(balance-amount <= 1000)
			System.out.println("Your Account balance is very low.");
		else
			balance = balance - amount; 
	}
	public void display()
	{
		System.out.println("Name of the Account holder:- "+ depName);
		System.out.println("Name of the Account balance:- "+ balance);
	}
		
}
public class Bank
{
	public static void main(String args[])
	{
		int choice;
		Scanner input= new Scanner(System.in);
		Bankc obj= new Bankc();
			while(true)
			{
				System.out.println("Choice among them:- ");
				System.out.println("0. open your account:- ");
				System.out.println("1. Deposit in your account");
				System.out.println("2. Withdraw your amount");
				System.out.println("3. Display your Account details");
				System.out.println("4. Quit");
				choice = input.nextInt();
				switch(choice)
				{
					case 0: 
					{
						System.out.println("fillup this form:- ");
						System.out.println("Name:- ");
						obj.depName = input.nextLine();
						obj.depName = input.nextLine();
						
						System.out.println("Account Number:- ");
						obj.accNumber = input.nextLine();
						
						System.out.println("Type of Account:- ");
						obj.accType = input.nextLine();
						
						System.out.println("Balnce amount:- ");
						obj.balance = input.nextInt();
						
						break;
					}
					case 1: 
					{
						obj.deposit();
						break;
					}
					case 2 :
					{
						obj.withdraw();
						break;
					}
					case 3:
					{
						obj.display();
						break;
					}
					case 4:
					{
						return ;
					}	
					default :
						System.out.println("Invslid input!...");
						
				}
			}	
		
	}
}