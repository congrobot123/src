import java.io.FileInputStream;

public class TestInputSteam
{
	public static void main(String[] args)
		throws Exception
	{
		FileInputStream fis = new FileInputStream("TestInputSteam.java");

		byte[] buf = new byte[1024];

		int hasRead = 0;
		int sum = 0;
		while( ( hasRead = fis.read(buf) ) > 0 )
		{
			sum += hasRead;
			System.out.print(new String(buf, 0, hasRead));
		}

		System.out.println("sum = " + sum);
		fis.close();
	}
}
