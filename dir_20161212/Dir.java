import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Dir
{
	public static void main(String[] args)
		throws Exception
	{
		//�õ�.�ž���·��
		File file1 = new File(".");
		String abs = file1.getAbsolutePath();
		String path = abs.substring(0, (abs.length()-2));

		File file2 = new File(path);
		
		File[] arraytemp = file2.listFiles();

		File file3 = new File(file2.getAbsoluteFile().getParent());
		
		File[] arrayfile = new File[arraytemp.length + 2];
		arrayfile[0] = file2;
		arrayfile[1] = file3;
		for(int i = 2; i<arrayfile.length; ++i)
		{
			arrayfile[i] = arraytemp[i-2];
		}

		int j = 0;
		for(File subfile : arrayfile)
		{
			long time = subfile.lastModified();
			Date date = new Date(time);

			SimpleDateFormat adf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			String datestr = adf.format(date);
		
			System.out.print(datestr + "  ");

			if(subfile.isFile())
			{
				System.out.print("       ");
				System.out.print(subfile.length()+"\t");
			}
			else
			{
				System.out.print("<DIR>  ");
				System.out.print("\t");
			}

			if(j == 0)
			{
				System.out.print(".");
			}
			else if(j == 1)
			{
				System.out.print("..");
			}
			else
			{
				System.out.print(subfile.getName());
			}

			System.out.println();
			j++;
		}
	}
}