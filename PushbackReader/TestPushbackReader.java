import java.io.StringReader;
import java.io.PushbackReader;
import java.io.IOException;

public class TestPushbackReader 
{
	public static void main(String[] args) 
	{
		String str = "»ÆËÉËÉ huangsongsong" +
						"¹¢Èñ   gengrui" +
						"ÎâÓñÕä wuyuzhen" +
						"ÍòÇì´ä wanqingcui" +
						"ÂÀ²ýÏª lvchangxi" +
						"ÐìÐ¡ÀÚ xuxiaolei";
		
		String wuz = "ÎâÓñÕä wuyuzhen";
		
		char[] buffer = new char[16];
		String  lastContent = "";
		int hasRead = 0;

		try
		(
			StringReader sr = new StringReader(str);
			PushbackReader pr = new PushbackReader(sr, 32);
		)
		{
			while( (hasRead = pr.read(buffer)) > 0)
			{
				String content = new String(buffer, 0, hasRead);

				int targetIndex = 0;
				if( (targetIndex = (lastContent + content).indexOf(wuz)) >0)
				{
					pr.unread((lastContent + content).toCharArray());
					System.out.println(targetIndex);

					if(targetIndex + wuz.length() > 16)
					{
						buffer = new char[targetIndex + wuz.length()];
					}


					//System.out.println(targetIndex+wuz.length()-1);
					
					pr.read(buffer, 0, targetIndex+wuz.length());
					System.out.println(new String(buffer, 0, targetIndex+wuz.length()));

					return;
				}
				else
				{
					lastContent = content;
				}
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}