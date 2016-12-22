import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.io.IOException;

public class TestChannel 
{
	public static void main(String[] args) 
	{
		try
		(
			FileInputStream fis = new FileInputStream("TestChannel.java");
			FileOutputStream fos = new FileOutputStream("a.txt");
		)
		{
			FileChannel fcin = fis.getChannel();
			FileChannel fcon = fos.getChannel();

			ByteBuffer buf = ByteBuffer.allocate(256);

			while( fcin.read(buf) != -1)
			{
				buf.flip();
				fcon.write(buf);
				buf.clear();
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}