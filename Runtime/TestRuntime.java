public class TestRuntime
{
	public static void main(String[] args)
		throws Exception
	{
		Runtime rt = Runtime.getRuntime();
		//rt.exec("notepad.exe C:\\Users\\congrobot\\Desktop\\JavaCode\\src\\scanner\\abc.txt");
		
		System.out.println("������������" + rt.availableProcessors() );
		System.out.println("�����ڴ�����" + rt.freeMemory());
		System.out.println("���ڴ�����" + rt.totalMemory());
		System.out.println("��������ڴ�����" + rt.maxMemory() );
	
	}
}
