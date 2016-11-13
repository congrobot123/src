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
						SimpleDateFormat adf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
						System.out.println(adf.format(date));
						break;
					case "cpuinfo":
						Runtime rt = Runtime.getRuntime();
						System.out.println("CPU和Memory统计信息:");
						System.out.println("\t 处理器数目:" + rt.availableProcessors() + "个数");
						System.out.println("\t   空闲内存:" + rt.freeMemory()/1000000  + "MB");
						System.out.println("\t     总内存:" + rt.maxMemory()/1000000 + "MB");
						break;
					default:
						System.out.println("'" + cmdinfo + "'不是内部或外部命令，也不是可运行的程序\n或批处理文件。");
				}
			}
			
			System.out.print("C:\\Users\\congrobot>");
		}
	}
}
