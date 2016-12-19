import java.io.CharArrayReader;
import java.io.IOException;

public class TestArray 
{
	public static void main(String[] args) 
	{
		char[] cArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

		char[] buffer = new char[2];
		int hasRead = 0;

		try
		(
			CharArrayReader cr = new CharArrayReader(cArray);
		)
		{
			while( (hasRead = cr.read(buffer)) >0 )
			{
				for(int i=0; i<hasRead; ++i)
				{
					System.out.print(buffer[i]);
				}
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
