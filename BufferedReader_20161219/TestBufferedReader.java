import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestBufferedReader
{
	public static void main(String[] args) 
	{
		String line = null;
		try
		(
			InputStreamReader  reader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(reader);
		)
		{
			while( (line = br.readLine()) != null)
			{
				if(line.equals("exit"))
				{
					System.exit(1);
				}

				System.out.println("enter is:" + line);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
