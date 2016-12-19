import java.io.FileReader;

public class TestReader
{
	public static void main(String[] args)
		throws Exception
	{
		FileReader fis = new FileReader("test.txt");

		char[] buf = new char[1];
		
		int hasRead = 0;
		int sum = 0;
		while( (hasRead = fis.read(buf)) > 0)
		{
			sum += hasRead;
			System.out.print(new String(buf, 0, hasRead));
		}

		System.out.println("sum = " + sum);
		fis.close();
	}
}
