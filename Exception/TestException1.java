import java.lang.Exception;

public class TestException1
{
	public static void main(String[] args) 
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int temp = a / b;
			System.out.println(temp);
		}
		catch (Exception e)
		{
			System.out.println("enter wrong");
			e.printStackTrace();
		}
	}
}
