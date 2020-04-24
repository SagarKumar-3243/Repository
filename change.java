import java.util.Scanner;
interface over
{
	void show();
	void init();
}
class person implements over
{
String Name;
String Age;
String sex;
	public void init()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Name:- ");
		Name = input.nextLine();
		
		System.out.println("Age:- ");
		Age = input.nextLine();
		
		System.out.println("Sex:- ");
		sex = input.nextLine();
	}
	public void show()
	{
		System.out.println("Name:- "+ Name);
		System.out.println("Age:- "+ Age);
		System.out.println("Sex:- "+ sex);
	}
}

class employee extends person
{
	String employeeID;
	String employeebatch;
	String employeedepartment;
	public void init()
	{
		Scanner input = new Scanner(System.in);
		super.init();
		
		System.out.println("EmployeeId:- ");
		employeeID = input.nextLine();
		
		System.out.println("Employee Batch:- ");
		employeebatch = input.nextLine();
		
		System.out.println("Employee Department:- ");
		employeedepartment = input.nextLine();
	}
	public void show()
	{
		System.out.println("****Employee****\n\n");
		super.show();
		System.out.println("Employee ID:- "+ employeeID);
		System.out.println("Employee Batch:- "+ employeebatch);
		System.out.println("Employee Department:- "+ employeedepartment);
	}
}
class student extends person
{
	String rollNo;
	String RegNo;
	String Class;
	public void init()
	{
		Scanner input = new Scanner(System.in);
		super.init();
		System.out.println("Student Roll number:- ");
		rollNo = input.nextLine();
		System.out.println("Student's Registration Nuumber:- ");
		RegNo = input.nextLine();
		System.out.println("Class of Student:- ");
		Class = input.nextLine();
	}
	public void show()
	{
		System.out.println("****Student*****\n\n");
		super.show();
		System.out.println("Roll Number:- "+ rollNo);
		System.out.println("Registration Number:- "+ RegNo);
		System.out.println("Class:- "+ Class);
	}
}
public class change
{
 public static void main(String args[])
 {
	 Scanner input = new Scanner (System.in);
	 employee eobj = new employee();
	 student sobj = new student();
	 int choice;
	 while(true)
	 {
		 System.out.println("Enter your choice:- ");
		 System.out.println("1. Show data: ");
		 System.out.println("2. Initialize employee data: ");
		 System.out.println("3. Initialize Student data: ");
		 System.out.println("4. Quit!...");
		 choice = input.nextInt();
		 switch(choice)
		 {
			 case 1:
			 {
				 System.out.println("****Below given all the data****");
				 System.out.println("---Employee---");
				 eobj.show();
				 System.out.println("\n\n\n---Student---");
				 sobj.show();
				 break;
			 }
			 case 2:
			 {
				 System.out.println("Initialize Employee data: ");
				 eobj.init();
				 break;
			 }
			 case 3:
			 {
				 System.out.println("initialize Student data: ");
				 sobj.init();
				 break;
			 }
			 case 4:
			 {
				 return ;
			 }
			 default :
				System.out.println("Invalid Entery!...");
		 }
		 System.out.println("\n\n\n");
	 }
	 
 }
}