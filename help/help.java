public class help
{
	public static void main(String[] args) 
	{
		if(args.length == 1 && args[0].equals("ASSOC"))
		{
			System.out.println("显示或修改文件扩展名关联\n");
			System.out.println("\tASSOC [.ext[=[fileType]]]");
		}
		else if(args.length == 1 && args[0].equals("ATTRIB"))
		{
			System.out.println("显示或更改文件属性\n");
			System.out.println("ATTRIB [+R | -R] [+A | -A ] [+S | -S] [+H | -H] [+I | -I]");
		}
	}
}
