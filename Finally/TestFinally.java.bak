import java.io.FileInputStream;

public class TestFinally  
{
	public static void main(String[] args)
	{
		try
		{
			fun(args);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void fun(String[] s)
		throws MyException
	{
		try
		{
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int temp = a / b;
			System.out.println(temp);
		}
		catch (Exception e)
		{
			throw new MyException(e);
		} 
	}
}

class MyException extends Exception
{
	public MyException()
	{
	
	}

	public MyException(String msg)
	{
		super(msg);
	}

	public MyException(Throwable t)
	{
		super(t);
	}
}


