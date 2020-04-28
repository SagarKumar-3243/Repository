import java.util.Scanner;

class employee
{
	String Name;
	int Salary;
	public void run()
	{
		Scanner input= new Scanner(System.in);
		if(Salary >10000)
		{
			try{
				throw new Exception("1000");
			}catch(Exception e)
			{
				System.out.println("Exception found!...");
			}
		}
		else
		{
			System.out.println("Name of the Employee:- "+ Name);
			System.out.println("Salary of the Employee:- "+ Salary);
		}
	}
}
public class Q8
{
	public static int menu()
	{
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("1. Initialize Employee list:");
		System.out.println("2. Display: ");
		System.out.println("3. Quit!...");
		System.out.println(" Enter your Choice!... ");
		choice = input.nextInt();
		return choice;
	}
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		employee obj= new employee();
		int ch;
		while(true)
		{
			ch= menu();
			switch (ch)
			{
				case 1:
				{
					System.out.println("Fillup the form below given:");
					System.out.println("Name of the employee:- ");
					obj.Name= input.nextLine();
					System.out.println("Salary of the employee:- ");
					obj.Salary= input.nextInt();
					break;
				}
				case 2:
				{
					try
					{
						obj.run();
					}
					catch(Exception e)
					{
						System.out.println("Salary is higher than 10,000 Rs.:- ");
					}
					break;
				}
				case 3:
				{
					return ;
				}
				default: 
					System.out.println("Invalid Input!...");
			}
			System.out.println("\n\n\n");
		}
	}
}