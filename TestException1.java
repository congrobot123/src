import java.util.Scanner;

public class TestException1  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		try
		{
			if(str.equals("I am 007"))
			{
				throw new Exception("�װ���007������");
			}
			else
			{
				throw new Exception("�Բ������´ν���");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}