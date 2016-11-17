import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class TestTerminal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		System.out.print("C:\\Users\\congrobot>");

		while(sc.hasNext())
		{
			String cmdinfo = sc.next();
			cmdinfo = cmdinfo.substring(0, cmdinfo.length()-1);
			
			if(cmdinfo.length() != 0)
			{
				switch (cmdinfo)
				{
					case "clear":
						for(int i = 0; i<20; ++i)
						{
							System.out.println("\n");
						}
						break;
					case "date":
						Date date = new Date();
						SimpleDateFormat adf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
						System.out.println(adf.format(date));
						break;
					case "cpuinfo":
						Runtime rt = Runtime.getRuntime();
						System.out.println("CPU��Memoryͳ����Ϣ:");
						System.out.println("\t ��������Ŀ:" + rt.availableProcessors() + "����");
						System.out.println("\t   �����ڴ�:" + rt.freeMemory()/1000000  + "MB");
						System.out.println("\t     ���ڴ�:" + rt.maxMemory()/1000000 + "MB");
						break;
					default:
						System.out.println("'" + cmdinfo + "'�����ڲ����ⲿ���Ҳ���ǿ����еĳ���\n���������ļ���");
				}
			}
			
			System.out.print("C:\\Users\\congrobot>");
		}
	}
}