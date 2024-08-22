import java.util.Scanner;
class Person
{

	String name;
	int birthdate;
	int height;
	int weight;
	String address;
	
	Scanner sc = new Scanner(System.in);
	void data1()
	{
		System.out.println("Enter the Name : ");
		name = sc.nextLine();

		System.out.println("Enter the Birth Date : ");
		birthdate = sc.nextInt();

		System.out.println("Enter the Height : ");
		height = sc.nextInt();

		System.out.println("Enter the Weight : ");
		weight = sc.nextInt();

		System.out.println("Enter the Address : ");
		address = sc.next();	
	}

	void display1()
	{
   		System.out.println("Enter the Name : "+name);
		System.out.println("Enter the Birth Date : "+birthdate);
		System.out.println("Enter the Height : "+height);
		System.out.println("Enter the Weight : "+weight);
		System.out.println("Enter the Address : "+address);	
	}

	void calculateAge()
	{
		int age;
		age = 2024 - birthdate;
		System.out.println("Age : "+age);
	}

}

class Student extends Person
{

	int rollno ;
	int m1 , m2 , m3 ;

	Scanner sc = new Scanner(System.in);
	void data2()
	{
		System.out.println("Enter the Roll Number : ");
		rollno = sc.nextInt();

		System.out.println("Enter the Marks of Marathi : ");
		m1 = sc.nextInt();

		System.out.println("Enter the Marks of Hindi : ");
		m2 = sc.nextInt();

		System.out.println("Enter the Marks of English : ");
		m3 = sc.nextInt();
	}

	void display2()
	{
		System.out.println("Enter the Roll Number : "+rollno);
		System.out.println("Enter the Marks of Marathi : "+m1);
		System.out.println("Enter the Marks of Hindi : "+m2);
		System.out.println("Enter the Marks of English : "+m3);
	}

	void calculateAvg()
	{
		float avg;
		avg = (m1+m2+m3)/3;
		System.out.println("Average : "+avg);
	}

}

class Employee extends Person
{
	int empid;
	double salary;
	
	Scanner sc = new Scanner(System.in);
	void data3()
	{
		System.out.println("Enter the Empployee ID : ");
		empid = sc.nextInt();

		System.out.println("Enter the Employee Salary : ");
		salary = sc.nextDouble();	
	}

	void display3()
	{
		System.out.println("Enter the Empployee ID : "+empid);
		System.out.println("Enter the Employee Salary : "+salary);
	}

	void calculateTax()
	{
		double tax;

		if(salary<=200000)
			tax=0;
		else if(salary<=300000)
			tax=0.1*(salary-200000);
		else if(salary<=500000)
			tax=(0.2*(salary-300000))+(0.1*100000);
		else if(salary<=1000000)
			tax=(0.3*(salary-500000))+(0.2*200000)+(0.1*100000);
		else
			tax=(0.4*(salary-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
		System.out.println("Income tax amount is "+tax);
	}

}


public class InheritanceTest 
{
 	public static void main(String a[])
	{
		System.out.println("Person class : ");
		Person p = new Person();
		p.data1();
		p.display1();
		p.calculateAge();

		System.out.println("Student class : ");
		Student s= new Student();
		s.data1();
		s.data2();
		s.display1();
		s.calculateAge();
		s.display2();
		s.calculateAvg();

		System.out.println("Employee class : ");
		Employee e = new Employee();
		e.data1();
		e.data3();
		e.display1();
		e.calculateAge();
		e.display3();
		e.calculateTax();

	}
}
		
		