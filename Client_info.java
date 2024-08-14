import java.util.Scanner;
interface Client
{
    void input();
    void output();
}
class Client_info implements Client
{
    String name;
    double salary;
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter the Name: ");
        name=sc.next();
        System.out.println("Enter the Salary: ");
        salary=sc.nextDouble();
    }
    public void output()
    {
        System.out.println("Client Name is: "+name);
        System.out.println("Salary is: "+salary);
    }
    public static void main(String args[])
    {
        Client c=new Client_info();
        c.input();
        c.output();
    }
}