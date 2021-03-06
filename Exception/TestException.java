import java.lang.Exception;

public class TestException
{
	public static void main(String[] args) 
	{
		fun(args);
	}

	public static void fun(String[] s)
	{
		try
		{
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(args[1]);

			int temp = a / b;
			System.out.println(temp);
		}
		catch (NumberFormatException e | ArithmeticException e | IndexOutOfBoundsException e)
		{
			e.printStackTrace();
			return;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return;
		}

		System.out.println("finish");
	}
}
