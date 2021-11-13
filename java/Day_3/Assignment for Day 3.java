import java.util.Scanner;
class Employee
{
	private int eid;
	private String name;
	private float salary;
	void inputDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the EID: ");
		eid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name: ");
		name = sc.nextLine();
		System.out.print("Enter the Salary: ");
		salary = sc.nextFloat();
	}
	void showDetails()
	{
        System.out.println("Employee Data:");
        System.out.println("EID: " + eid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

	}
}

class EmployeeDetails
{
	public static void main(String[] args)
	{
		Employee E1 = new Employee();
		E1.inputDetails();
		E1.showDetails();
	}
}