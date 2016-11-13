import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import static java.time.format.DateTimeFormatter.*;

public class TestDateTimeFormatter
{
	public static void main(String[] args) 
	{
		//ʱ���ʽ��
		DateTimeFormatter[] formatter = new DateTimeFormatter[]	
		{
			DateTimeFormatter.ISO_LOCAL_DATE_TIME,
			DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
			DateTimeFormatter.ofPattern("Gyyyy MMM dd HH:mm:ss")
		};

		LocalDateTime date1 = LocalDateTime.now();

		for(int i=0; i<formatter.length; ++i)
		{
			System.out.println(date1.format(formatter[i]));
			System.out.println(formatter[i].format(date1));
		}

		//ʱ���ַ�������
		String str1 = "2016==11==13 15ʱ11��30��";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HHʱmm��ss��");

		LocalDateTime date2 = LocalDateTime.parse(str1, formatter1);
		System.out.println(date2);
	}
}
