public class TestException
{
	public static void main(String[] args)
		throws Exception
	{
		runtime_fun();

		checked_fun();
	}

	public static void runtime_fun()
	{
		try
		{
			int[] a = new int[2];
			int b = a[2];
		}
		catch (Exception e)
		{
			System.out.println("Exception runtime");
		}
	}

	public static void checked_fun()
		throws Exception
	{
		throw new Exception("Exception checked");
	}
}
