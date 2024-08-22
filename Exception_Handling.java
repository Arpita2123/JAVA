import java.util.Scanner;
class Exception_Handling
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Program is started . ");
		int a[] = new int [5] ;
		int b , c;
		System.out.println("Enter the elements of array : ");
		for(int i = 0 ; i < 5 ; i++)
		{
			a[i] = sc.nextInt();
		}
			
		System.out.println("Enter the number which is divisor :");
		b =sc.nextInt();
		
		for(int j =0 ; j < 5; j++)
		{
			try
			{
				c=a[j]/b;
				System.out.println(c);
			}

			
			catch(Exception e)
			{
				System.out.println("Cannot perform because --  "+e);
				break;
			}
		}
		System.out.println("Program is ended. ");
	}
}