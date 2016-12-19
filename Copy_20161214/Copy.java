import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy 
{
	public static void main(String[] args)
		throws Exception
	{
		if(args.length == 2)
		{
			File source = new File(args[0]);
			File dest = new File(args[1]);
			dest.createNewFile();

			if(source.exists())
			{
				FileInputStream fis1 = new FileInputStream(args[0]);
				FileOutputStream fis2 = new FileOutputStream(dest);
				
				byte[] buf = new byte[1024];
				int hasRead = 0;

				while( (hasRead = fis1.read(buf)) > 0)
				{
					fis2.write(buf, 0, hasRead);
				}

				fis2.close();
				fis1.close();
			}
			else
			{
				System.out.println("File is not exist!");
			}
		}
		else
		{
			System.out.println("enter wrong!");
		}
		
	}
}
