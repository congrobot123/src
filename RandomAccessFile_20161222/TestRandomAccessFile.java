import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;

public class TestRandomAccessFile 
{
	public static void main(String[] args) 
	{
		byte[] buf = new byte[64];
		int hasRead = 0;

		try
		(
			RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");
		)
		{
			File tmpFile = File.createTempFile("aaa", "tmp");
			raf.seek(1);

			try
			(
				FileOutputStream fops = new FileOutputStream(tmpFile);
				FileInputStream fips = new FileInputStream(tmpFile);
			)
			{
				while( (hasRead = raf.read(buf)) > 0)
				{
					fops.write(buf, 0, hasRead);
				}

				raf.seek(1);
				raf.write('e');

				while( (hasRead = fips.read(buf)) >0 )
				{
					raf.write(buf, 0, hasRead);
				}
			}
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
			tmpFile.deleteOnExit();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
