import java.io.File;

public class TestFileNameFilter 
{
	public static void main(String[] args) 
	{
		File file = new File(".");
		String[] namestr = file.list( (dir, name) -> (new File(name).isFile() && name.endsWith(".java")) );

		for(String temp : namestr)
		{
			System.out.println(temp);
		}
	}
}
