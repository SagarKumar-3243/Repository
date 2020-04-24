import java.util.Scanner;
interface collegeContain
{
	final String collegeName= "LALIT CHANDRA BHARALI COLLEGE"; 
	void show();
}
class teacher implements collegeContain 
{
	String Teacher;
	String  Class;
	String Qualification;
	public void show()
	{
		System.out.println("Class = "+ Class);
		System.out.println("Qualification = "+ Qualification);
	}
	
}
class Department extends teacher
{
	String deptName;
	String deptNum;
	public void show()
	{
		super.show();
		System.out.println("Department Name:- "+ deptName);
		System.out.println("Department Number:- "+ deptNum);
	}
}
public class college
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); 
		Department obj= new Department();
		int choice;
		while(true)
		{
			System.out.println("Enter your choice.");
			System.out.println("1. Show College name:  ");
			System.out.println("2. Show all data :  ");
			System.out.println("3. Initialize Department: ");
			System.out.println("4. Show Teacher Name: ");
			System.out.println("5. Quit!...");
			choice = input.nextInt();
			
			switch (choice)
			{
				case 1:
				{
					System.out.println("Name of college :- "+ obj.collegeName);
					break;
				}
				case 2:
				{
					System.out.println("*****Below all the data is given:*****");
					obj.show();
					break;
				}
				case 3:
				{
					System.out.println("Please fill up the upcoming digital form: ");
					System.out.println("Teacher Name:- ");
					obj.Teacher = input.nextLine();
					obj.Teacher = input.nextLine();
					
					System.out.println("Class of teacher:- ");
					obj.Class = input.nextLine();
					
					System.out.println("Qualification of the teacher:- ");
					obj.Qualification= input.nextLine();
					
					System.out.println("Department Name:- ");
					obj.deptName = input.nextLine();
					
					System.out.println("Department Number:- ");
					obj.deptNum = input.nextLine();
					break;
				}
				case 4:
				{
					System.out.println("Teacher Name is:- "+ obj.Teacher);
					break;
				}
				case 5:
					return;
				default :
					System.out.println("Invalid Entry!...");
				
			} 
			System.out.println("\n\n\n");
		}
	}
}