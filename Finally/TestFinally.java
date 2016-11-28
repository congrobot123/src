import java.io.FileInputStream;

public class TestFinally  
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;

		try
		{
			fis = new FileInputStream("a.txt");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int temp = a / b;
			System.out.println(temp);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("test1");
			//System.out.println(e.getMessage());
			//return;
			//System.exit(1);
		}
		catch (NumberFormatException e)
		{
			System.out.println("test2");
			//e.printStackTrace();
			return;
		}
		catch (ArithmeticException e)
		{
			System.out.println("test3");
			//e.printStackTrace();
			return;
		}
		catch (Exception e)
		{
			System.out.println("test4");
			e.printStackTrace();
			return;
		}
		finally
		{
			System.out.println("test5");
			if(fis != null)
			{
				try
				{
					fis.close();
					return;
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
