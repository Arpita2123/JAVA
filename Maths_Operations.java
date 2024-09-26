import java.util.Scanner;

public class Maths_Operations 
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
				System.out.println("Select Follwoing Maths Operations :");
				System.out.println("1. Arithmetic Operation");
				System.out.println("2. Statistical Operation");
				System.out.println("3. Trigonametric Operation");
				System.out.println("4. Exit");	

				int S = sc.nextInt();
				
				switch(S) 
				{
				
					case 1:
						System.out.println(".........Arithmetic Operations..........");
						System.out.println("Enter the two Numbers :");
						int n1 = sc.nextInt();
						int n2 = sc.nextInt();
						System.out.println("Addition :"+(n1 + n2));
						System.out.println("Subtraction :"+(n1 - n2));
						System.out.println("Multiplication :"+(n1 * n2));
						System.out.println("Division :"+(n1 / n2));
						break;

					case 2:
						System.out.println("...........Statistical Operations.........");
						System.out.println("Enter the value :");
						int n = sc.nextInt();
						double sum =0;
						for (int i = 0; i <= n; i++)
						{
							System.out.println("Enter the numbers" + (i+1) +":");
							double num = sc.nextDouble();
							sum+=num;
						}
						double average = sum/n;
						System.out.println("Average : "+average);
						break;

					case 3:
						System.out.println("...........Trigonametric Operations...........");
						System.out.println("Enetr the angle in Degrees :");
						int angle = sc.nextInt();

						double radian = Math.toRadians(angle);
						System.out.println("Sine :" +Math.sin(radian));
						System.out.println("Coine :" +Math.cos(radian));
						System.out.println("Tangent :" +Math.tan(radian));
						break;

					case 4:
						System.out.println("Exit .....");
						sc.close();
						System.exit(0);
						break;

					default:
						System.out.println("Invalid choice.... Please Enter Valid Choice...");


				}
		}
	}
}





