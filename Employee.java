import java.util.*;

class Employee
{
	int employeeId;
	String employeeName;
	Double salary;

	Employee( int employeeId , String employeeName , Double salary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
 
  	public void setEmployeeId( int employeeId )
	{
		this.employeeId = employeeId;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeename( String EmployeeName )
	{
		this.employeeName = EmployeeName;
	}

	public String getEmployeename()
	{
		return employeeName;
	}

	public void setSalary( double salary )
	{
		this.salary = salary;
	}

	public double getSalary()
	{
		return salary;
	}

	public void raiseSalary()
	{
		this.salary = salary*1.10;
	}

	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Employee ID : ");
		int employeeId = sc.nextInt();
 		
		System.out.print("Employee Name : ");
		String employeeName = sc.next();

		System.out.print("Employee Salary : ");
		double salary = sc.nextDouble();

		Employee employee_1 = new Employee( employeeId , employeeName , salary);

		System.out.println("------------------");

		System.out.println("Employee ID : "+employee_1.getEmployeeId());	

		System.out.println("Employee Name : "+employee_1.getEmployeename());

		System.out.println("Employee Salary : "+employee_1.getSalary());
	
		employee_1.raiseSalary();
		System.out.println("Updated Employee Salary : "+employee_1.getSalary());

	
		
	}
}	
