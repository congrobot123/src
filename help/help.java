public class help
{
	public static void main(String[] args) 
	{
		if(args.length == 1 && args[0].equals("ASSOC"))
		{
			System.out.println("��ʾ���޸��ļ���չ������\n");
			System.out.println("\tASSOC [.ext[=[fileType]]]");
		}
		else if(args.length == 1 && args[0].equals("ATTRIB"))
		{
			System.out.println("��ʾ������ļ�����\n");
			System.out.println("ATTRIB [+R | -R] [+A | -A ] [+S | -S] [+H | -H] [+I | -I]");
		}
	}
}
