import java.io.* ;

class Create_File
{
	public static void main(String a[])
	{
		File f =new File("D://JAVA//abc.txt");
	
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Created.");
			}
			else
			{
				System.out.println("File is already Exist");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}