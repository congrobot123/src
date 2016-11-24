import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;

public class TestProperties
{
	public static void main(String[] args)
		throws IOException
	{
		Properties props = new Properties();
		props.setProperty("hello","welcome");
		props.setProperty("name","Tom");

		props.store(new FileOutputStream("mess_en_US.properties"), "comment line");

	}
}
