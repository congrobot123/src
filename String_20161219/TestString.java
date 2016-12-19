import java.io.StringReader;
import java.io.IOException;


public class TestString 
{
	public static void main(String[] args)
		throws IOException
	{
		String str = "������ huangsongsong" +
						"����   gengrui" +
						"������ wuyuzhen" +
						"����� wanqingcui" +
						"����Ϫ lvchangxi" +
						"��С�� xuxiaolei";

		char[] buffer = new char[16];
		
		try
		(
			StringReader sr = new StringReader(str);
		)
		{
			int hasRead = 0;

			while( (hasRead = sr.read(buffer)) >0 )
			{
				String temp = new String(buffer, 0, hasRead);
				System.out.print(temp);
			}
		}
	}
}
