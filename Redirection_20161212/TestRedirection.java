import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestRedirection 
{
	public static void main(String[] args) 
	{
		try
		(
			FileInputStream fis = new FileInputStream("a.txt");
		)
		{
			System.setIn(fis);

			Scanner sc = new Scanner(System.in);
			int sum = 0;
			while(sc.hasNext())
			{	
				int temp = sc.nextInt();
				sum += temp;
			}

			System.out.println(sum);
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
