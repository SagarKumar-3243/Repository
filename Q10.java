import java.util.Scanner;

class menu
{
	float a, b, total; 
	int sin = 1;
	menu()
	{
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Enter first number:- ");
		 a= input.nextInt(); 
		 System.out.println("Enter Second number:- ");
		 b= input.nextInt();
	}
	public void operationmenu()
	{
		int ch;
		Scanner input = new Scanner(System.in);
		System.out.println("1. Addition.");
		System.out.println("2. Subtraction.");
		System.out.println("3. Multiplication.");
		System.out.println("4. Division.");
		System.out.println("5. Remainder.");
		System.out.println("Enter your choice:- ");
		ch = input.nextInt();
		switch(ch)
		{
			case 1:
			{
				total= a+b;
				break;
			}
			case 2:
			{
				total = a-b;
				break;
			}
			case 3:
			{
				total = a*b;
				break;
			}
			case 4:
			{
				total = a/b;
				break;
			}
			case 5:
			{
				total = a%b;
				break;
			}
			default :
				System.out.println("Invalid Input!...");
		}
		System.out.println("Total = "+ total);
	}
}
class Q10
{
	public static void menu(menu obj)
	{
		Scanner input= new Scanner(System.in);  
		System.out.println("Enter your choice: ");
		System.out.println("1. Operation menu. ");
		System.out.println("2. Exit.");
		int choice = input.nextInt();
		switch(choice)
		{
			case 1:
			{
				obj.operationmenu();
				break;
			}
			case 2:
			{
				obj.sin = 0;
				return ;
			}
			default : 
				System.out.println("Invalid Input!...");

		}
		 
	}
	public static void main(String args[])
	{
		int flag = 1;
		Scanner input = new Scanner(System.in);
		menu obj= new menu();
		while(true)
		{
			menu(obj);
			if(obj.sin == 0)
			{
				System.out.println("Do you want to exit?- (Type Yes / No)");
				String dec = input.nextLine();
				switch(dec)
				{
					case "Yes":
					{
						flag = 0;
						break;
					}
					case "No":
					{
						break;
					}
					default :
						System.out.println("Invalid Input!...");
				}
			}
			System.out.println("\n\n\n");
			if(flag == 0)
				return ;
		}
	}
}