import java.io.PrintStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class TestSystem  
{
	public static void main(String[] args) 
	{	
		try
		(
			PrintStream ps = new PrintStream(new FileOutputStream("a.out"));
		)
		{
			System.setOut(ps);
			System.out.println("Hello World!");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
