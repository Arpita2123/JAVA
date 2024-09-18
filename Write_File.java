import java.io.* ;

class Write_File
{
	public static void main(String a[])
	{
		
		String text = "Hello World!!!";
		
		try
		{
			FileWriter f = new FileWriter("D://JAVA//abc.txt");
			f.write(text);
			f.close();
			System.out.println("Successfully wrote in file");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}